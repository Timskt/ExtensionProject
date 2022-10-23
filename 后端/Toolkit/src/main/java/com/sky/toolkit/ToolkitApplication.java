package com.sky.toolkit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.sky.toolkit.mapper")
public class ToolkitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToolkitApplication.class, args);
	}

}
