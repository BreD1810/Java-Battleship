
public class Player {
	//This class is used for a player in the game.
	
	public Board board = new Board();
	
	//Declare the ships that the user has.
	public Ship carrier = new Ship(5);
	private Ship battleship = new Ship(4);
	private Ship cruiser = new Ship(3);
	private Ship submarine = new Ship(3);
	private Ship destroyer = new Ship(2);

	public void outputShips() {
		System.out.println("You have the following ships:");
		System.out.println("* A carrier of length " + carrier.returnLength());
		System.out.println("* A battleship of length " + battleship.returnLength());
		System.out.println("* A cruiser of length " + cruiser.returnLength());
		System.out.println("* A submarine of length " + submarine.returnLength());
		System.out.println("* A destroyer of length " + destroyer.returnLength());
	}
}
