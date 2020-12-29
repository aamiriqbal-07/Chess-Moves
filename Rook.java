package aamir;

public class Rook 
{
	public static void moveRook(char coordinates[])
	{
		Movements movementObject = new Movements();
		char column = coordinates[0], row = coordinates[1];
		int limit = 9;
		movementObject.moveVertical(column, row, limit);
		movementObject.moveHorizontal(column, row, limit);
	}
}
