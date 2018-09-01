package com.jay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * IMPORTANT: If your application contains more than 1 controllers, please read below:
 * https://stackoverflow.com/questions/38240619/how-to-run-multiple-controllers-in-a-spring-boot-application/38240656
 * 
 * The Application class (which has your main method) should be in the outer most 
 * folder in your source hierarchy, because that is where the component scan begins. 
 * If you have any controller which is any level out of controller, spring will not 
 * be able to pick that controller during component scan.
 * com.example.demo
 *             |
 *             +-> controller
 *             |      |
 *             |      +--> Controller1.java
 *             |      +--> Controller2.java
 *             |
 *             +-> Application.java
 *              
 * @author CORP\jayvg
 */
@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}
}
