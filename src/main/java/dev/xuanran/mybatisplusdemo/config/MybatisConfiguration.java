package dev.xuanran.mybatisplusdemo.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by XuanRan on 2022/10/2
 */
@Configuration
public class MybatisConfiguration {

    /**
     * Mybatis Plus 分页插件
     * 使用：
     * Page<T> page = new Page(current,size);
     * mapper.selectPage(page,queryWrapper);
     *
     * @return object
     */
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor() {
        return new PaginationInnerInterceptor();
    }
}
