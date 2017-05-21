/**
 * 
 */
package edu.cpp.cs.cs141.prog_final;

/**
 * @author Corey Perez
 *
 */
public class Player extends ActiveAgents {
	
	private final int maxLives = 3;
	
	private int lives;
	
	private Gun gun;
	
	private int row = 8;
	
	private int column = 0;
	
	private String playerMark = "P";
	
	public Player(Gun weapon)
	{
		gun = weapon;
		lives = maxLives;
		row = getRow();
		column = getColumn();		
	}

	public void shoot()
	{
		gun.shoot();
	}
	
	public void reloadPlayerGun()
	{
		gun.reload();
	}
	
	public int getLives()
	{
		return lives;
	}
	
	public void move(char userMove)
	{
		switch (userMove) {
		case 'W':
		case 'w':
		    row--;
		    break;
		case 'S':
		case 's':
		    row++;
		    break;
		case 'A':
		case 'a':
		    column--;
		    break;
		case 'D':
		case 'd':
		    column++;
		    break;
		default:
		    System.out.println("Invalid move selection");
		}
	}
	
	public int getRow()
	{
		return row;
	}

	public int getColumn() 
	{
		return column;
	}
	
	public String getPlayerMark()
	{
		return playerMark;
	}
}
