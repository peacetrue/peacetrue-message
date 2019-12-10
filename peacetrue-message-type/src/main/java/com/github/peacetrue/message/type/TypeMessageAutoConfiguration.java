package com.github.peacetrue.message.type;

import com.github.peacetrue.spring.web.method.support.ConcreteClassAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xiayx
 */
@Configuration
@EnableConfigurationProperties(com.github.peacetrue.message.type.TypeMessageProperties.class)
@ConditionalOnClass(ConcreteClassAutoConfiguration.class)
@AutoConfigureBefore(ConcreteClassAutoConfiguration.class)
@PropertySource("classpath:application-message-type.properties")
public class TypeMessageAutoConfiguration {

}
