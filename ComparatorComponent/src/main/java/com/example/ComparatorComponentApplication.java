package com.example;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ComparatorComponentApplication {
	
	@Bean
	InitializingBean saveDataAtStartup(){
		
		return ()->{
			System.loadLibrary(Core.NATIVE_LIBRARY_NAME);			
		};
		
	}

	public static void main(String[] args) {
		SpringApplication.run(ComparatorComponentApplication.class, args);
	}
}
