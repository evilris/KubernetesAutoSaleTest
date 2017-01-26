package me.lukawski.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@ComponentScan("me.lukawski")
@SpringBootApplication
public class SpringCpuLoaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCpuLoaderApplication.class, args);
	}
}
