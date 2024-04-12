package io.renren.modules.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"springfox.documentation.schema"})
public class CetApplication {

    public static void main(String[] args) {
        SpringApplication.run(CetApplication.class, args);
    }

}
