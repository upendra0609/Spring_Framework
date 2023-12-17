package com.sikku.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
//@ComponentScan(basePackages = "com.sikku")
public class AppConfig {
	
	@Bean("messageSource")
	public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("com/sikku/commons/App");
//        messageSource.setDefaultEncoding("UTF-8");        
        return messageSource;
    }

}
