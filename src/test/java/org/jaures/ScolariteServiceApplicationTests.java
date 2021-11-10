package org.jaures;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity 
@Data @NoArgsConstructor @AllArgsConstructor @ToString

class Student {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private Date birthDate;
	
	
}
interface StudentRepository extends JpaRepository<Student,Long>{
	
}
@SpringBootTest
class ScolariteServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
