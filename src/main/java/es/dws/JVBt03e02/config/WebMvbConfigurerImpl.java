package es.dws.JVBt03e02.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvbConfigurerImpl
 */
@Configurable
public class WebMvbConfigurerImpl implements WebMvcConfigurer{
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/enlaces").setViewName("linksView");
    }
    
}
