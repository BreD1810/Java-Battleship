import java.util.Random;

public class Board {
	//This class is for the board for the game.

	private char grid[][]= new char[10][10];

	private void setupBoard() {
		 for(int i=0; i<10; i++) {
		        for(int j=0; j<10; j++) {
		            grid[i][j] = '?';
		        }
		 }
	}
	
	public void outputBoard() {
		//Output the board for the game to the console.
		 for(int i=0; i<10; i++) {
		        for(int j=0; j<10; j++) {
		            System.out.print(grid[i][j]);
		            System.out.print("  ");
		        }
		 System.out.println();
		 }
		 System.out.println();
	}
	
	public void placeShip(Ship inputShip) {
		//Grid is 10x10
		//Place a ship on the grid
		Random rand = new Random();
		int orientation = rand.nextInt(2) + 1; //1 = vertical, 2 = horizontal.
		boolean placed = false;
		while(!placed) {
			int x = rand.nextInt(10);
			int y = rand.nextInt(10);
			
			//TODO: Currently works for horizontal, add vertical and checking for other ships.
			
			if(grid[x][y] != '?' || !(y + inputShip.returnLength() >= 10)) {
				for(int i = 0; i < inputShip.returnLength(); i++) {
					if (grid[x][y + i] == '?') {
						break;
					}
				}
				for(int i = 0; i < inputShip.returnLength() - 1; i++) {
					grid[x][y + i] = 'S';
				}
				placed = true;
			}
		}
		outputBoard();
	}
	
	Board() {
		setupBoard();
	}
}
