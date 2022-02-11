package com.qa.main;

import java.util.Random;

public class RockPaperScissors {
	
	public Roll getRoll(int id) {
		switch(id) {
		case 1:
			return Roll.ROCK;
		case 2:
			return Roll.PAPER;
		case 3:
			return Roll.SCISSORS;
		default:
			return Roll.ROCK;
		}
	}
	
	public String fight(int player) {
		String outcome = "";
		Random rand = new Random();
		int computerRand = rand.nextInt(3);
		computerRand++;
		Roll Player = getRoll(player);
		Roll Computer = getRoll(computerRand);
		
		System.out.println("Player: " + Player);
		System.out.println("Computer: " + Computer);
		if(Player == Computer) {
			outcome += "Clash!";
			return outcome;
		}
		else if(Player == Roll.PAPER && Computer == Roll.ROCK || Computer == Roll.PAPER && Player == Roll.ROCK) {
			if(Player == Roll.PAPER) {
				outcome += RollOutcomes.ROCKPAPER.getMessage() + " Player Wins!";
			}
			else{
				outcome += RollOutcomes.ROCKPAPER.getMessage() + " Computer Wins!";
			}
		}
		else if(Player == Roll.PAPER && Computer == Roll.SCISSORS || Computer == Roll.PAPER && Player == Roll.SCISSORS) {
			if(Player == Roll.SCISSORS) {
				outcome += RollOutcomes.PAPERSCISSOR.getMessage() + " Player Wins!";
			}
			else{
				outcome += RollOutcomes.PAPERSCISSOR.getMessage() + " Computer Wins!";
			}
		}
		else if(Player == Roll.SCISSORS && Computer == Roll.ROCK || Computer == Roll.SCISSORS && Player == Roll.ROCK) {
			if(Player == Roll.ROCK) {
				outcome += RollOutcomes.SCISSORROCK.getMessage() + " Player Wins!";
			}
			else{
				outcome += RollOutcomes.SCISSORROCK.getMessage() + " Computer Wins!";
			}
		}
		else {
			return "fail";
		}
		
		return outcome;
	}
	
}
