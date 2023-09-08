package com.example.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DeptTest {
	@Test
	void setter() {
		var dept = new Dept();
		dept.setDeptno(10);
		dept.setDname("총무부");
		dept.setLoc("부산");
		
		assertThat(dept.getDeptno()).isEqualTo(10);
		assertThat(dept.getDname()).isEqualTo("총무부");
		assertThat(dept.getLoc()).isEqualTo("부산");
		
	}
	
	@Test
	void equals() {
		var dept1 = new Dept();
		dept1.setDeptno(10);
		dept1.setDname("총무부");
		dept1.setLoc("부산");
		
		var dept2 = new Dept();
		dept2.setDeptno(10);
		dept2.setDname("총무부");
		dept2.setLoc("부산");
		
		System.out.println(dept1.equals(dept2));
		
		assertThat(dept1).isEqualTo(dept2);
	}
	
	@Test
	void hashcode() {
		var dept1 = new Dept();
		dept1.setDeptno(10);
		dept1.setDname("총무부");
		dept1.setLoc("부산");
		
		var dept2 = new Dept();
		dept2.setDeptno(10);
		dept2.setDname("총무부");
		dept2.setLoc("부산");
		
		System.out.println(dept1.hashCode());
		System.out.println(dept2.hashCode());
		
		assertThat(dept1.hashCode()).isEqualTo(dept2.hashCode());
		
	}
	
	@Test
	void tostring() {
		var dept1 = new Dept();
		dept1.setDeptno(10);
		dept1.setDname("총무부");
		dept1.setLoc("부산");
		
		System.out.println(dept1);
		assertThat(dept1.toString()).isEqualTo("Dept(deptno=10, dname=총무부, loc=부산)");
	}  
	@Test
	void builder() {
		
		var dept1 = new Dept();
		dept1.setDeptno(10);
		dept1.setDname("개발부");
		dept1.setLoc("서울");
		
		var dept2 = new Dept(10, "개발부", "서울");
		
		var dept3 = Dept.builder().deptno(10).dname("개발부").loc("서울").build();
		assertThat(dept1).isEqualTo(dept2);
		assertThat(dept1).isEqualTo(dept3);
		assertThat(dept2).isEqualTo(dept3);
		
		
	}
}
