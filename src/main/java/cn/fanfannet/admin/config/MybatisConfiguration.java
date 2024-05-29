package cn.fanfannet.admin.config;

import com.github.pagehelper.PageInterceptor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfiguration {

    public PageInterceptor pageInterceptor() {
        return new PageInterceptor();
    }
}
