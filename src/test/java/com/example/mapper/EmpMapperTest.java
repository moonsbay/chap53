package com.example.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class EmpMapperTest {
	
	@Autowired
	EmpMapper mapper;   //자동맵핑
	
//	@Autowired
//	ApplicationContext factory;   //수동 맵핑 테스트
	
//	@Test
//	void autowire() {
//		assertThat(factory).isNotNull();
//		mapper = factory.getBean(EmpMapper.class); //수동주입
//		assertThat(mapper).isNotNull();            //자동
//		System.out.println(this.mapper == mapper);  //같은 것인지 확인
//		System.out.println(this.mapper.equals(mapper)); //이것은? false다..음..
//		System.out.println(this.mapper.equals(this.mapper)); //이것도 false가 나오다니..같은 이름 다른 연결.. 연결이 두개..?
//		assertThat(this.mapper).isEqualTo(mapper);    //그래서 이퀄로 하면 이것도 false..
//		assertThat(this.mapper==mapper).isTrue();
//	}
	
   @Test
	void selectAll() {
		
		var list = mapper.selectAll();
		System.out.println(list);
		assertThat(list).isNotNull();
		assertThat(list).isNotEmpty();
	//	assertThat(list).isEmpty();
	//	assertThat(list.size()).isGreaterThanOrEqualTo(0);
		assertThat(list.size()).isEqualTo(14);
	}
   
   @Test
   void selectByDeptno() {
	   
	   var list = mapper.selectByDeptno(10);
	   System.out.println(list);
	   assertThat(list.size()).isEqualTo(3);
	   
	   list = mapper.selectByDeptno(20);
	   assertThat(list.size()).isEqualTo(5);
	   
	   list = mapper.selectByDeptno(30);
	   assertThat(list.size()).isEqualTo(6);
	   
	   list = mapper.selectByDeptno(40);
	   assertThat(list.size()).isEqualTo(0);
   
   
   }
   
   void selectBySearch() {
	   var list = mapper.selectBySearch(null, "");
	   System.out.println(list);
	   assertThat(list.size()).isEqualTo(14);
	   
	   list = mapper.selectBySearch(null, "사");
	   System.out.println(list);
	   assertThat(list.size()).isEqualTo(5);
	   
	   list = mapper.selectBySearch(20, "");
	   System.out.println(list);
	   assertThat(list.size()).isEqualTo(5);
	   
	   list = mapper.selectBySearch(20, "사");
	   System.out.println(list);
	   assertThat(list.size()).isEqualTo(3);
   }
	
	
	
}
