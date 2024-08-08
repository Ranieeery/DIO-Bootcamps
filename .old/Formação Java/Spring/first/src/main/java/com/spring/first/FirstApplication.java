package com.spring.first;

import com.spring.first.date.CalendarJ;
import com.spring.first.date.Dates;
import com.spring.first.string.Strings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - Strings");
		System.out.println("2 - Dates");
		System.out.println("3 - Spring");
		int opcao = scanner.nextInt();

		switch (opcao) {
			case 1 -> Strings.main();
			case 2 -> {
				Dates.main();
				System.out.println("Calendar:");
				CalendarJ.main();
			}
			default -> SpringApplication.run(FirstApplication.class, args);
		}
	}
}
