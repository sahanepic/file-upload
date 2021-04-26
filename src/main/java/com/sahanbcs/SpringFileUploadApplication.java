package com.sahanbcs;

import com.sahanbcs.uplodingfiles.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class SpringFileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFileUploadApplication.class, args);
	}

}
