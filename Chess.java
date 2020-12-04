package game.chess;
import java.util.Scanner;
import java.util.ArrayList;

public class Chess 
{
	CheckConditions checkObject = new CheckConditions();
	public static char[] getCoordinates(String position)
	{
		char[] coordinate = new char[2];
		coordinate[0] = position.charAt(0);
		coordinate[1] = position.charAt(1);
		return coordinate;
	}
	Movements movementObject = new Movements();
	public void moveKing(char coordinates[], ArrayList <String> moves)
	{
	    char column = coordinates[0], row = coordinates[1];
	    int limit = 2;
	    moves.addAll(movementObject.moveOnFrontDiagonal(column, row, limit));
	    moves.addAll(movementObject.moveOnBackDiagonal(column, row, limit));
	    moves.addAll(movementObject.moveVertical(column, row, limit));
	    moves.addAll(movementObject.moveHorizontal(column, row, limit));
	}

	public void moveQween(char coordinates[], ArrayList <String> moves)
	{
		char column = coordinates[0], row = coordinates[1];
		int limit = 9;
		moves.addAll(movementObject.moveOnFrontDiagonal(column, row, limit));
	    moves.addAll(movementObject.moveOnBackDiagonal(column, row, limit));
	    moves.addAll(movementObject.moveVertical(column, row, limit));
	    moves.addAll(movementObject.moveHorizontal(column, row, limit));
	}
	
	public void moveBishop(char coordinates[], ArrayList <String> moves)
	{
		char column = coordinates[0], row = coordinates[1];
		int limit = 9;
		moves.addAll(movementObject.moveOnFrontDiagonal(column, row, limit));
	    moves.addAll(movementObject.moveOnBackDiagonal(column, row, limit));
	}
	
	public void moveRook(char coordinates[], ArrayList <String> moves)
	{
		char column = coordinates[0], row = coordinates[1];
		int limit = 9;
		moves.addAll(movementObject.moveVertical(column, row, limit));
		moves.addAll(movementObject.moveHorizontal(column, row, limit));
	}
	
	void moveHorse(char coordinates[], ArrayList <String> moves)
	{
		char column = coordinates[0], row = coordinates[1];
		int limit = -1;
		moves.addAll(movementObject.moveHorseOnly(column, row, limit));
	}
	
	public void movePawn(char coordinates[], ArrayList <String> moves)
	{
		char column = coordinates[0], row = coordinates[1];
		int limit = 9;
		column = (char)(column+1);
		if(checkObject.checkBoundry(column, row));
	    	moves.add(""+column+row);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String piece = input.nextLine();  // TAKING INPUT FOR CHESS PIECE AND ITS POSITION INTO ONE VARIABLE.
	 	       piece = piece.replaceAll("\\s", "");
	 	       
		String position = piece.substring(piece.length() - 2);
		
		String type = piece.substring(0,piece.length()-2);
			   type = type.toLowerCase();
		
	    Chess chessObject = new Chess();
	    CheckConditions checkObject = new CheckConditions();
	    
		if(checkObject.checkValidity(position) == 0)
		{
			System.out.println("Invalid Input!");
			return;
		}
		char[] coordinates = getCoordinates(position);
		
		ArrayList <String> moves = new ArrayList <String> ();
		if(type.equals("king"))  chessObject.moveKing(coordinates, moves);
	    else if(type.equals("qween"))  chessObject.moveQween(coordinates, moves);
	    else if(type.equals("bishop"))  chessObject.moveBishop(coordinates, moves);
	    else if(type.equals("horse"))  chessObject.moveHorse(coordinates, moves);
	    else if(type.equals("rook"))  chessObject.moveRook(coordinates, moves);
	    else if(type.equals("pawn"))  chessObject.movePawn(coordinates, moves);
	    else  System.out.println("Invalid Input!");

		for(String cells:moves)
			System.out.print(cells+" ");
 	}
}
