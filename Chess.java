package game.chess;
import java.util.Scanner;
import java.util.ArrayList;

public class Chess 
{
	static ArrayList<Pair<Character,Character>> xymoves = new ArrayList<Pair<Character,Character>>();
	public static char[] getCoordinates(String position)
	{
		char[] coordinate = new char[2];
		coordinate[0] = position.charAt(0);
		coordinate[1] = position.charAt(1);
		return coordinate;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String piece = input.nextLine();  // TAKING INPUT FOR CHESS PIECE AND ITS POSITION INTO ONE VARIABLE.
	 	       piece = piece.replaceAll("\\s", "");
	 	       
		String position = piece.substring(piece.length() - 2);
		
		String type = piece.substring(0,piece.length()-2);
			   type = type.toLowerCase();
	    
		if(InputValidity.checkBoundry(position) == 0)
		{
			System.out.println("Invalid Input!");
			return;
		}
		char[] coordinates = getCoordinates(position);
		
		if(type.equals("king")) King.moveKing(coordinates);
	    else if(type.equals("qween"))  Qween.moveQween(coordinates);
	    else if(type.equals("bishop"))  Bishop.moveBishop(coordinates);
	    else if(type.equals("horse"))  Horse.moveHorse(coordinates);
	    else if(type.equals("rook"))  Rook.moveRook(coordinates);
	    else if(type.equals("pawn"))  Pawn.movePawn(coordinates);
	    else  
	    {
	    	System.out.println("Invalid Input!");
	    	return;
	    }
		
		Chess.xymoves = Movements.xymoves;
		for(Pair p:xymoves)
			System.out.println(p.getL()+""+p.getR());
 	}
}
