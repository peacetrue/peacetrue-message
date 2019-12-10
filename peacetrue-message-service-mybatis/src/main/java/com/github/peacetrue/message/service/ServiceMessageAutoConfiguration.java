package com.github.peacetrue.message.service;

import com.github.peacetrue.associate.AssociatedSourceBuilder;
import com.github.peacetrue.associate.AssociatedSourceBuilderImpl;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Objects;

/**
 * @author xiayx
 */
@Configuration
@EnableConfigurationProperties(ServiceMessageProperties.class)
@MapperScan(basePackageClasses = ServiceMessageAutoConfiguration.class, annotationClass = Mapper.class)
@PropertySource("classpath:/application-message-service.properties")
public class ServiceMessageAutoConfiguration {

    private ServiceMessageProperties properties;

    public ServiceMessageAutoConfiguration(ServiceMessageProperties properties) {
        this.properties = Objects.requireNonNull(properties);
    }

    @Bean
    public AssociatedSourceBuilder associatedSourceBuilder() {
        return new AssociatedSourceBuilderImpl();
    }

    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }

}
