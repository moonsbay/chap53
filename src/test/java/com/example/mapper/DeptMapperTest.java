package com.example.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DeptMapperTest {
	
	@Autowired
	DeptMapper mapper;
	
	
	
	@Test
	void autowire() {
		assertThat(mapper).isNotNull();
	}
	
	@Test
	void selectAll() {
		
		var list = mapper.selectAll();
		System.out.println(list);
		assertThat(list).isNotNull();
	//	assertThat(list).isNotEmpty();
	//	assertThat(list).isEmpty();
		assertThat(list.size()).isGreaterThanOrEqualTo(0);
	}
	
	@Test
	void selectByDname() {
	//	var list = mapper.selectByDname("부");
	//	var list = mapper.selectByDname("영");
//		var list = mapper.selectByDname("");
		var list = mapper.selectByDname(null);  // 여러가지 테스트해보는 것
		System.out.println(list);
		assertThat(list).isNotNull();
		assertThat(list.size()).isGreaterThan(0);
		
		list = mapper.selectByDname("");  // 여러가지 테스트해보는 것
		assertThat(list).isNotNull();
		assertThat(list.size()).isGreaterThan(0);
		
		list = mapper.selectByDname("부");  // 여러가지 테스트해보는 것
		assertThat(list.size()).isEqualTo(4);
		
	}
	
	
	
}
