package com.cloudstream.eon;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EonApplication {
	public static void main(String[] args) {
		SpringApplication.run(EonApplication.class, args);
	}

	@Bean
	public Consumer<Person> log() {
		return person -> {
			System.out.println("Received: " + person.age);
		};
	}

	public static class Person {
		private String name;
		private int age;

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setName(String name) {
			this.name = name;
		}
		public String toString() {
			return this.name;
		}
	}
}
