package io.gorest;

import io.gorest.config.CucumberConfig;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"io.gorest.glue", "io.gorest.helpers", "io.gorest.state"})
@EnableConfigurationProperties({CucumberConfig.class})
public class SpringCucumberApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCucumberApplication.class, args);
    }
}
