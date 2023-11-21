package junit.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class HooksQ4Test {

	@BeforeAll
	static void initAll() {
		System.out.println("Before All");
	}
	@BeforeEach
	void init() {
		System.out.println("Before each");
	}
	@AfterEach
	void tear() {
		System.out.println("After each");
	}
	@AfterAll
	static void tearAll() {
		System.out.println("After all");
	}
	@Test
	void addTest1() {
		System.out.println("Add 1");
	}
	@Test
	void addTest2() {
		System.out.println("Add 2");
	}

}