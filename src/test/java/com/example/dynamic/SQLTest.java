package com.example.dynamic;

import org.apache.ibatis.jdbc.SQL;
import org.junit.jupiter.api.Test;

public class SQLTest {
    
	@Test
	void test1() {
		var s = new SQL();
		s.SELECT("*");
		s.FROM("emp");
		
		System.out.println(s.toString());
	}
	
	@Test
	void test2() {
		
		var s = new SQL().SELECT("*")
				         .FROM("emp");
		System.out.println(s);
	}
	@Test
	void test3() {
		Integer deptno = null;  //전체
		String search = null;
		//1.전체
		System.out.println(dynamicSQL1(null, ""));
		//2. 전체, 과
		System.out.println(dynamicSQL1(10, ""));
		//3. 부서
		System.out.println(dynamicSQL1(null, "과"));
		//4. 부서 and search
		System.out.println(dynamicSQL1(20, "사"));
	}
	
	String dynamicSQL1(Integer deptno, String search){
	var s = new SQL();
		s.SELECT("*")
		 .FROM("emp");
		
		if(deptno != null) {
		 s.WHERE(String.format("deptno=%d", deptno));
//		 s.AND();
		}
		if(!search.trim().equals("")) {
		 s.AND();
		 s.WHERE(String.format("ename like '%%%s%%' or job like '%%%s%%'", search, search));
		 
		}
		System.out.println(s);	
		
		return s.toString();
	}
	
}
