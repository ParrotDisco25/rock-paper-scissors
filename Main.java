package rockpaperscissors;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		
		while (true) {
		
		int botScore = 0;
		
		int playerScore = 0;
		
		while (playerScore < 3 && botScore < 3) {
			
				System.out.println("1 = rock \n2 = paper\n3 = scissors");
				
				int botPick = (int)(Math.random() * 4);
				
				int playerPick = scanner1.nextInt();
				
				if (playerPick == 1 && botPick == 0) {
					System.out.println("tie");
				} else if (playerPick == 1 && botPick == 1) {
					botScore += 1;
					System.out.println("you lost");
				} else if (playerPick == 1 && botPick == 2) {
					playerScore += 1;
					System.out.println("you won");
				} else if (playerPick == 2 && botPick == 0) {
					playerScore += 1;
					System.out.println("you won");
				} else if (playerPick == 2 && botPick == 1) {
					System.out.println("tie");
				} else if (playerPick == 2 && botPick == 2) {
					playerScore += 1;
					System.out.println("you won");
				} else if (playerPick == 3 && botPick == 0) {
					botScore += 1;
					System.out.println("you lost");
				} else if (playerPick == 3 && botPick == 1) {
					playerScore += 1;
					System.out.println("you won");
				} else if (playerPick == 3 && botPick == 2) {
					System.out.println("tie");
				} else {
					botScore += 1;
					System.out.println("you lost");
				}
	
				System.out.println("your score: " + playerScore + "\nbot score: " + botScore);

			}
			
			if (playerScore == 3) {
				System.out.println("you beat the bot");
			} else {
				System.out.println("the bot beat you");
			}
			
			System.out.println("your score: " + playerScore + " bot score: " + botScore);
			
			System.out.println("play again? \n1 = yes \n2 = no");
			int answer = scanner1.nextInt();
			
			if (answer != 1) {
				break;
			}
		}
	}

}
