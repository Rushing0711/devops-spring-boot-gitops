package com.coding.devops.gitops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsSpringBootGitopsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsSpringBootGitopsApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from GitOps! Version: " + System.getenv("VERSION");
    }

}
