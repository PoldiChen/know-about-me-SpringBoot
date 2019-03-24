package com.poldichen.knowaboutme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.poldichen.knowaboutme.dao")
public class KnowAboutMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnowAboutMeApplication.class, args);
	}

}
