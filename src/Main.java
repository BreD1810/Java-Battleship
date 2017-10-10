
public class Main {
	//This class is purely for a main method for program flow.
	
	//Start with computer generated ships that the player has to guess.
	
	public static void main(String[] args) {
		Player player1 = new Player();
		player1.outputShips();
		player1.board.outputBoard();
		player1.board.placeShip(player1.carrier);
	}
	
}
