package com.qa.main;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		boolean run = true;
		while(run) {
			System.out.println("Welcome to Rock Paper Scissors!");
			System.out.println("Please select a number from the options below:\n0. Exit\n1. Rock\n2. Paper\n3. Scissors");
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			if(choice == 0) {
				System.out.println("Goodbye!");
				run = false;
			}
			else {
				System.out.println(rps.fight(choice));
			}			
		}
	}
}
