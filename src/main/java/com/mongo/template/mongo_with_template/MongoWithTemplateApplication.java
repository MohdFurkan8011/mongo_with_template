package com.mongo.template.mongo_with_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MongoWithTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoWithTemplateApplication.class, args);
	}

}
