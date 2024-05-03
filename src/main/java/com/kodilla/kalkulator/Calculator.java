package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {

	public int add(int a, int b){
		int c = a + b;
		return a+b;
	}
	public int subtraction(int a, int b){
		int c = a - b;
		return c;
	}

	public static void main(String[] args) {
			Calculator calculator = new Calculator();
			System.out.println(calculator.add(63, 36));
			System.out.println(calculator.subtraction(55, 34));
		}
}
