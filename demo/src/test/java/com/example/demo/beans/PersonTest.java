package com.example.demo.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person person = new Person("Tom", "Cruise");
		assertEquals(person.getFirstName(), "Tom");
	}

}
