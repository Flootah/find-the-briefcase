/**
 * 
 */
package edu.cpp.cs.cs141.prog_final;

/**
 * @author Corey Perez
 *
 */
public class MainLaunch {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	   // GameBoard gameBoard = new GameBoard();
	   // gameBoard.printBoard();
		UserInterface ui = new UserInterface(1, new GameEngine());
		ui.mainMenu();
	}

}
