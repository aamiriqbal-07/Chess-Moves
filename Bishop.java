package aamir;

public class Bishop 
{
	public static void moveBishop(char coordinates[])
	{
		Movements movementObject = new Movements();
		char column = coordinates[0], row = coordinates[1];
		int limit = 9;
		movementObject.moveOnFrontDiagonal(column, row, limit);
	    movementObject.moveOnBackDiagonal(column, row, limit);
	}
}
