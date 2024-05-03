package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {

	public void someMethod(){
		System.out.println("It's works!!!");
	}

	public static void main(String[] args) {
			Calculator calculator = new Calculator();
			calculator.someMethod();

		}
}
