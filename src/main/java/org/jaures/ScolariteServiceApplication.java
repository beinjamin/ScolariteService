package org.jaures;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity @NoArgsConstructor @AllArgsConstructor @ToString
class Student{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private Date birthDate;
	
}
@RepositoryRestResource
interface StudentRepository extends JpaRepository<Student,Long>{
	
	
}
@SpringBootApplication
public class ScolariteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScolariteServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(StudentRepository studentRepository) {
		return args -> {
			studentRepository.save(new Student(null,"Hassan","jaures@gmail.com",new Date()));
		
		studentRepository.findAll().forEach(System.out::println);		
		};
	}

}
