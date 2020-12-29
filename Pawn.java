package aamir;

import java.util.ArrayList;

public class Pawn
{
	static ArrayList<Pair<Character,Character>> xymoves = new ArrayList<Pair<Character,Character>>();
	public static void movePawn(char coordinates[])
	{
		char column = coordinates[0], row = coordinates[1];
		int limit = 9;
		column = (char)(column+1);
		if(InputValidity.checkBoundry(column, row));
	    	xymoves.add(new Pair(column,row));
	    	Movements.xymoves = Pawn.xymoves;
	}
}
