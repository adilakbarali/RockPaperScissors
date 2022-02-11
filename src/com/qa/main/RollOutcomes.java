package com.qa.main;

public enum RollOutcomes {
	SCISSORROCK("Rock beats Scissors!"),
	ROCKPAPER("Paper beats Rock!"),
	PAPERSCISSOR("Scissor beats Paper!");
	
	private String message;
	
	RollOutcomes(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
