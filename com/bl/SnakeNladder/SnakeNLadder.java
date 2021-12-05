package com.bl.SnakeNladder;

public class SnakeNLadder {

	public static void main(String[] args) {
		int positionA = 0;
		int positionB = 0;
		// flag 0 : not play , flag 1: play enable
		int flagA = 0;
		int flagB = 0;
		int positionA_temp;
		int positionB_temp;
		int dieRolls = 0;

		System.out.println("Snake and Laddar Simulation Game\n\n");
		
		while (true) {
			dieRolls++;
			// logic for player 1
			int dieA = (int) Math.floor(Math.random() * 10) % 6 + 1;
			
			if (flagA == 1) {
				int lsvalueA = (int) Math.floor(Math.random() * 10) % 2 + 1;
				// lsvalue 1 : ladder , lsvalue 2: snake
				
				switch (lsvalueA) {
				case 1: {
					positionA_temp = positionA;
					positionA += dieA;
					if (positionA > 100) {
						positionA = positionA_temp;
						System.out.println("\nPlayer A need to get Die value " + (100 - positionA) + " to win\n");
						break;
					}
					System.out.println("\n Player A Rolled ! Die Value : " + dieA + "\n Player A Climbed Laddar with +"
							+ dieA + "\n Current Player A Position : " + positionA + "\n");
					break;
				}
				case 2: {
					positionA -= dieA;
					if (positionA <= 0) {
						positionA = 0;
						flagA = 0;
						System.out.println("\nOh ! Player A is Knocked Out . Need Die value 1 to get inside Game\n");
						break;
					}
					System.out.println("\n Player A Rolled ! Die Value : " + dieA + "\n Player A bitten by snake with -"
							+ dieA + "\n Current Player A Position : " + positionA + "\n");
					break;
				}
				}

			}
			if (flagA == 0 && dieA == 1) {
				flagA = 1;
				positionA = 1;
				System.out.println("\nPlayer A is entered into Game!! \n Current Player A position : " + positionA + "\n");
			}
			if (positionA >= 100) {
				System.out.println("\n Game Over !\n\n Player A wins with " + dieRolls + " Die Rolls\n");
				return;
			}

			// logic for player 2
			int dieB = (int) Math.floor(Math.random() * 10) % 6 + 1;
			if (flagB == 1) {
				int lsvalueB = (int) Math.floor(Math.random() * 10) % 2 + 1;
				// lsvalue 1 : ladder , lsvalue 2: snake
				switch (lsvalueB) {
				case 1: {
					positionB_temp = positionB;
					positionB += dieB;
					if (positionB > 100) {
						positionB = positionB_temp;
						System.out.println("\nPlayer B need to get Die value " + (100 - positionB) + " to win\n");
						break;
					}
					System.out.println("\n Player B Rolled ! Die Value : " + dieB + "\n Player B Climbed Laddar with +"
							+ dieB + "\n Current Player B Position : " + positionB + "\n");
					break;
				}
				case 2: {
					positionB -= dieB;
					if (positionB <= 0) {
						positionB = 0;
						flagB = 0;
						System.out.println("\nOh ! Player B is Knocked Out . Need Die value 1 to get inside Game\n");
						break;
					}
					System.out.println("\n Player B Rolled ! Die Value : " + dieB + "\n Player B bitten by snake with -"
							+ dieB + "\n Current Player B Position : " + positionB + "\n");
					break;
				}
				}

			}
			if (flagB == 0 && dieB == 1) {
				flagB = 1;
				positionB = 1;
				System.out.println("\nPlayer B is entered into Game!! \n Current Player B position : " + positionB + "\n");
			}
			if (positionB >= 100) {
				System.out.println("\n Game Over !\n\n Player B wins with " + dieRolls + " Die Rolls");
				return;
			}

		}

	}

}
