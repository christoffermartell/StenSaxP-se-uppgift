import java.util.Random;
import java.util.Scanner;

public class StenSaxPåse {
	
	static int playerChoice = convert();              // global variabel fungerar i hela programmet alltså inte restricted till tex ensaka metoder mm..
	public static void main(String[] args) {
		
		Random Rand = new Random(); // framkallat Random verktyg som vi använder när datorn väljer sten sax eller
									// påse.
		Scanner scan = new Scanner(System.in); // scanner för att user ska kunna svara i programmet.

		int compScore = 0; // Datorns början poäng
		int playerscore = 0; // spelaren börjarpoäng
		int counter = 0; // till loopen
        
		System.out.println("Hi, my name is Eve!\nWhats your name?"); // berättar datorns namn samt frågar efter
																		// spelarens
		String name = scan.nextLine(); // här kommer svaret..
		System.out.println("Hello " + name + "!" + "\nAre you ready for Stone, paper, scissors?"); // säger hej mm
		System.out.println("Here we go, Godluck!!"); // önskar lyckatill till spelaren

		while (counter == 0) { // While loop för att programmet ska köra fråga + svarskoden om igen

			int compChoice = 1 + Rand.nextInt(3); // denna variabel måste vara innanför loopen för att kunna välja nytt
													// random nr
													// annars hade den valt samma och skapat ett mönster som vi kan läsa
													// av.
													// efter varje spel och ingen har nått 3 päng så kommer programmet
													// tillbaka och drar en ny random siffra.
			System.out.println("press : 1 for Stone , 2 for paper , 3 for scissors."); // välj sten,sax eller påse.
			
			
			
			boolean checkInput = false; //boolean true or false
			while(!checkInput) {        // utropstäcken betyder inte
			String input = scan.nextLine();  //eftersom om user skriver in bokstäver som räknas som string så är metoden 
			                                  //metoden till för berätta att user måste skriva in en siffra istället.
			
			checkInput = convert(input);}
			
			
			//int playerChoice = Integer.parseInt(scan.nextLine());
			 //int playerChoice = scan.nextInt(); // välj sten sax eller påse
            
			
			if (playerChoice == compChoice) { // ifall dator och spelare väljer samma nummer så blir det lika och ingen
												// får poäng..
				System.out.println("It's a tie. Zero points were awarded."); // berättar ifall det blir lika.
				}

			else if (playerChoice == 1) { // else if kod för att styra vad som händer när spelare samt datorn väljer tal
				if (compChoice == 2) {
					System.out.println("Computer choose paper, sorry " + name + " You lost this round");
					compScore++; // ger datorn poäng
					System.out.println("computer: " + compScore);
					System.out.println(name + " : " + playerscore);
				} else if (compChoice == 3) {
					System.out.println("Computer choose scissors");
					System.out.println("Congratulations! " + name + " You won this round!");
					playerscore++; // ger spelaren ett poäng
					System.out.println("Computer: " + compScore); // skriver ut ställningen i spelet
					System.out.println(name + " : " + playerscore);

				}
			}

			else if (playerChoice == 2) {
				if (compChoice == 1) {
					System.out.println(" Computer choose rock ");
					System.out.println(" Congratulation" + name + " you won this round");
					playerscore++;
					System.out.println("Computer: " + compScore);
					System.out.println(name + " : " + playerscore);
				} else if (compChoice == 3) {
					System.out.println("Computer choose paper " + "sorry " + name + " you lost this round");
					compScore++;
					System.out.println("Computer: " + compScore);
					System.out.println(name + " : " + playerscore);
				}
			}

			else if (playerChoice == 3) {
				if (compChoice == 1) {
					System.out.println("Computer choose rock " + " sorry " + name + " You lost this round");
					System.out.println("");
					compScore++;
					System.out.println("Computer: " + compScore);
					System.out.println(name + " : " + playerscore);
				} else if (compChoice == 2) {
					System.out.println("Computer choose paper ");
					System.out.println("Congratulations! " + name + "you won this round");
					playerscore++;
					System.out.println("Computer: " + compScore);
					System.out.println(name + " : " + playerscore);
				}
			}

			if (playerscore == 3) { // om spelaren får 3 poäng vinner han och spelet avslutas
				System.out.println(" You are the winner. Gz! ");
				counter++;

			}

			if (compScore == 3) { // om datorn får 3 poäng vinner den och spelet avslutas
				System.out.println(" Sorry you lost. ");
				counter++;
			}

			}
	}

	public static boolean convert(String s) {    // en metod som används för att identifiera vad user skriver in och berättar om det är korrekt eller ej

		boolean correctInput = false;

		try {                            // denna metod testar user inputen och ommdet ej stämmer överens med den information vi vill ha så skicka den ett retur svar att skriva in ett nummer.

			int playerChoice = Integer.parseInt(s);
			System.out.println(playerChoice);
		correctInput = true;
		} catch (Exception playerchoice) {
			 System.out.println("Sorry, please enter a number ");
			 
		}
		
		return correctInput;
	}

}
