package com.lcal.chinavirus;

import com.lcal.chinavirus.filter.CORSFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
class  FilterConfiguration implements WebMvcConfigurer{

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new CORSFilter());
        registrationBean.setOrder(Integer.MIN_VALUE);
//        registrationBean.setUrlPatterns(Arrays.asList("/*"));
        return registrationBean;
    }
}