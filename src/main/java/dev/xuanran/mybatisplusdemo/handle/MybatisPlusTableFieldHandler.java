package dev.xuanran.mybatisplusdemo.handle;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by XuanRan on 2022/10/2
 * 当Mybatisk进行数据插入和更新时执行
 */
@Slf4j
@Component
public class MybatisPlusTableFieldHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        setFieldValByName("createTime", new Date(), metaObject);
        setFieldValByName("updateTime", new Date(), metaObject);

        // 配置逻辑删除默认值
        setFieldValByName("deleted", 0, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName("updateTime", new Date(), metaObject);
    }
}
