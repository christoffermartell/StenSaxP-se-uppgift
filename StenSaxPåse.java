import java.util.Random;
import java.util.Scanner;

public class StenSaxP�se {
	
	static int playerChoice = convert();              // global variabel fungerar i hela programmet allts� inte restricted till tex ensaka metoder mm..
	public static void main(String[] args) {
		
		Random Rand = new Random(); // framkallat Random verktyg som vi anv�nder n�r datorn v�ljer sten sax eller
									// p�se.
		Scanner scan = new Scanner(System.in); // scanner f�r att user ska kunna svara i programmet.

		int compScore = 0; // Datorns b�rjan po�ng
		int playerscore = 0; // spelaren b�rjarpo�ng
		int counter = 0; // till loopen
        
		System.out.println("Hi, my name is Eve!\nWhats your name?"); // ber�ttar datorns namn samt fr�gar efter
																		// spelarens
		String name = scan.nextLine(); // h�r kommer svaret..
		System.out.println("Hello " + name + "!" + "\nAre you ready for Stone, paper, scissors?"); // s�ger hej mm
		System.out.println("Here we go, Godluck!!"); // �nskar lyckatill till spelaren

		while (counter == 0) { // While loop f�r att programmet ska k�ra fr�ga + svarskoden om igen

			int compChoice = 1 + Rand.nextInt(3); // denna variabel m�ste vara innanf�r loopen f�r att kunna v�lja nytt
													// random nr
													// annars hade den valt samma och skapat ett m�nster som vi kan l�sa
													// av.
													// efter varje spel och ingen har n�tt 3 p�ng s� kommer programmet
													// tillbaka och drar en ny random siffra.
			System.out.println("press : 1 for Stone , 2 for paper , 3 for scissors."); // v�lj sten,sax eller p�se.
			
			
			
			boolean checkInput = false; //boolean true or false
			while(!checkInput) {        // utropst�cken betyder inte
			String input = scan.nextLine();  //eftersom om user skriver in bokst�ver som r�knas som string s� �r metoden 
			                                  //metoden till f�r ber�tta att user m�ste skriva in en siffra ist�llet.
			
			checkInput = convert(input);}
			
			
			//int playerChoice = Integer.parseInt(scan.nextLine());
			 //int playerChoice = scan.nextInt(); // v�lj sten sax eller p�se
            
			
			if (playerChoice == compChoice) { // ifall dator och spelare v�ljer samma nummer s� blir det lika och ingen
												// f�r po�ng..
				System.out.println("It's a tie. Zero points were awarded."); // ber�ttar ifall det blir lika.
				}

			else if (playerChoice == 1) { // else if kod f�r att styra vad som h�nder n�r spelare samt datorn v�ljer tal
				if (compChoice == 2) {
					System.out.println("Computer choose paper, sorry " + name + " You lost this round");
					compScore++; // ger datorn po�ng
					System.out.println("computer: " + compScore);
					System.out.println(name + " : " + playerscore);
				} else if (compChoice == 3) {
					System.out.println("Computer choose scissors");
					System.out.println("Congratulations! " + name + " You won this round!");
					playerscore++; // ger spelaren ett po�ng
					System.out.println("Computer: " + compScore); // skriver ut st�llningen i spelet
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

			if (playerscore == 3) { // om spelaren f�r 3 po�ng vinner han och spelet avslutas
				System.out.println(" You are the winner. Gz! ");
				counter++;

			}

			if (compScore == 3) { // om datorn f�r 3 po�ng vinner den och spelet avslutas
				System.out.println(" Sorry you lost. ");
				counter++;
			}

			}
	}

	public static boolean convert(String s) {    // en metod som anv�nds f�r att identifiera vad user skriver in och ber�ttar om det �r korrekt eller ej

		boolean correctInput = false;

		try {                            // denna metod testar user inputen och ommdet ej st�mmer �verens med den information vi vill ha s� skicka den ett retur svar att skriva in ett nummer.

			int playerChoice = Integer.parseInt(s);
			System.out.println(playerChoice);
		correctInput = true;
		} catch (Exception playerchoice) {
			 System.out.println("Sorry, please enter a number ");
			 
		}
		
		return correctInput;
	}

}
