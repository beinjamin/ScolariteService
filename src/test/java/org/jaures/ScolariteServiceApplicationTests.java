package org.jaures;

import java.util.Date;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@Entity 

class Student {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private Date birthDate;
	
	
}
@SpringBootTest
class ScolariteServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
