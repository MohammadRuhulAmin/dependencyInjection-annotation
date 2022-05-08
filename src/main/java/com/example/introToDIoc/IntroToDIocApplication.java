package com.example.introToDIoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;


import com.example.introToDIoc.config.BeanConfig;
import com.example.introToDIoc.model.*;
@SpringBootApplication
//@ImportResource({"classpath:BeanConfig.xml"})
@Import({BeanConfig.class})

public class IntroToDIocApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(IntroToDIocApplication.class, args);
		Programmer p = (Programmer) context.getBean("programmer");
		System.out.println(p.getName());
		System.out.println(p.getMachine().getBrand());		
		Student s = (Student) context.getBean("student");
		System.out.println(s.getStudentName());
		System.out.println(s.getMobile().getMobileBrand());
		
		Human human = context.getBean(Human.class);
		human.petInfo();
		
		
		
		
	}

}
//xml based configuration 
// annotation based configuration
// java based configuration