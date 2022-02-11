package com.qa.main;

public enum Roll {
	ROCK("Rock"),
	PAPER("Paper"),
	SCISSORS("Scissors");
	
	private String message;
	
	Roll(String message){
		this.message = message;
	}
	
	public String getRoll() {
		return message;
	}
}
