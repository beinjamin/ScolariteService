package org.jaures;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Etudiant{
	private Long id;
	private String name;
	private String email;
	private Date birthDate;
	
}
@SpringBootApplication
public class ScolariteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScolariteServiceApplication.class, args);
	}

}
