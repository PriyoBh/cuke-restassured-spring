package io.gorest.glue.definitions;

import io.cucumber.spring.CucumberContextConfiguration;
import io.gorest.SpringCucumberApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringCucumberApplication.class)
public class CucumberSpringConfiguration {

}
