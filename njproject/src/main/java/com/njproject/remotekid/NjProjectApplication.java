package com.njproject.remotekid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class NjProjectApplication {
	public static Log log = LogFactory.getLog(NjProjectApplication.class.getClass());

	public static void main(String[] args) {
		SpringApplication.run(NjProjectApplication.class, args);
		
		System.out.println(org.springframework.core.SpringVersion.getVersion());
		
		log.debug("11111111111");
	}
}
