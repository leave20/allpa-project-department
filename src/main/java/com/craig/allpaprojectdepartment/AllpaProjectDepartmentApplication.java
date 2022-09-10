package com.craig.allpaprojectdepartment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AllpaProjectDepartmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllpaProjectDepartmentApplication.class, args);
    }

}
