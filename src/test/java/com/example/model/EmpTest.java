package com.example.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.example.util.Gender;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class EmpTest {
	
	@Test
	void build() {
		var emp1 = new Emp(1000, "홍길동", null, null, null, null, null, null, null);
		var emp2 = Emp.builder().empno(1000).ename("홍길동").build();
		
		var emp3 = new Emp(); // Emp()사용을 위해 Emp.java에 다음을 넣은 것 @NoArgsConstructor, @AllArgsConstructor
		emp3.setEmpno(1000);
		emp3.setEname("홍길동");
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp2.equals(emp3));
		
		assertThat(emp1).isEqualTo(emp2);
		assertThat(emp1).isEqualTo(emp3);
		assertThat(emp2).isEqualTo(emp3);
	}
}
