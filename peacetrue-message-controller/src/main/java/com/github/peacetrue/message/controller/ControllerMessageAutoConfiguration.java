package com.github.peacetrue.message.controller;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xiayx
 */
@Configuration
@EnableConfigurationProperties(ControllerMessageProperties.class)
@PropertySource("classpath:/application-message-controller.properties")
public class ControllerMessageAutoConfiguration {

    @Bean
    public MessageController messageController() {
        return new MessageController();
    }
}
