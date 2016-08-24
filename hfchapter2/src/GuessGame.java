/**
 * 
 */

/**
 * @author Michael
 *
 */
public class GuessGame {
		Player p1, p2, p3;
		private int targetNumber;
		private boolean winner= false;
		
		public void startGame() {
			//(while winner == false)
			p1 = new Player();
			p2 = new Player();
			p3 = new Player();
			setRandomNumber(20);
			getRandomNumber();
			System.out.println(targetNumber);
			PlayerGuess();
			
				/*	if (winner == true) 
				{
				break;
				}
				else {
				System.out.println("PLayers will have to try again.");
				} //else 
			 	*/
			
		//CompareGuess(winner); }	
		} // start game method
		
	/**
	 * @param args
	 */
	public int getRandomNumber() {
		
		return targetNumber;
	} //randomGenerator method
	
	void setRandomNumber(int randomNumber) {
		 targetNumber = (int) (Math.random() * randomNumber);
			System.out.println("Im thinking of a number between 0 and " + randomNumber  );
			

		//targetNumber = randomNumber;
	}
	
	public void PlayerGuess(){
		
	
			//System.out.println("Number to guess is " + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			p1.playerNumeber = p1.number;
			System.out.println("Player one guessed" + p1.playerNumeber );
			p2.playerNumeber = p2.number;
			System.out.println("Player two guessed" + p2.playerNumeber );
			p3.playerNumeber = p3.number;
			System.out.println("Player three guessed" + p3.playerNumeber );
			
	}// end of PlayerGuess
	
	/*	public boolean CompareGuess(boolean winner) {
		
		p1.playerisRight;
		p2.playerisRight;
		p3.playerisRight
		
		if  (p1.playerNumeber == targetNumber) 
			{
			p1.playerisRight = true;
			} //first if statement
		
		if  (p2.playerNumeber== targetNumber) 
			{
			player2isRight = true;
			} //second if statement
		
		if  (p3.playerNumeber == targetNumber) 
			{
			player3isRight = true;
			} //third if statement
		
			if (p1.player1isRight || p2.player2isRight || p3.player3isRight){
			System.out.println("we have a winner!");
			System.out.println("Player one got it right? " + p1.playerisRight);
			System.out.println("Player two got it right? " + p2.playerisRight);
			System.out.println("Player three got it right? " + p3.playerisRight);
			System.out.println("Game is over. ");
			winner = true;
			break;
			return winner;
			
			
			
			} //end of if statement that compares all three guesses
		
}
		*/
			
	} //end of GuessGame

	

	

	

