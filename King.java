package aamir;

public class King 
{
	public static void moveKing(char coordinates[])
	{
		Movements movementObject = new Movements();
	    char column = coordinates[0], row = coordinates[1];
	    int limit = 2;
	    movementObject.moveOnFrontDiagonal(column, row, limit);
	    movementObject.moveOnBackDiagonal(column, row, limit);
	    movementObject.moveVertical(column, row, limit);
	    movementObject.moveHorizontal(column, row, limit);
	}
}
