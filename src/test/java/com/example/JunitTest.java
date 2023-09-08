package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class JunitTest {
	
	
	@Test
	void test1() {
		System.out.println("test1()...");
		int num = 10/0;
		System.out.println("End...");
	}
	
	@Test
	void test2() {
		System.out.println("test2()...");
		int num =100;
		assertThat(num).isEqualTo(200);
	}
    
	@Test
	void test3() {
		int sum = 0;
		for(int i=1; i<10; i++) {
			sum += i;
		}
		assertThat(sum).isEqualTo(55);
	}
}
