package aamir;
import java.util.ArrayList;

public class Movements 
{
	static ArrayList<Pair<Character,Character>> xymoves = new ArrayList<Pair<Character,Character>>();
	public void moveOnFrontDiagonal(char column, char row, int limit)
	{
		char xCoord, yCoord;
		for(int steps = 1;steps < limit;steps++)
		{
			xCoord = (char)(column + steps);
			yCoord = (char)(row + steps);
			if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
			
			xCoord = (char)(column - steps);
	        yCoord = (char)(row - steps);
	        if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
		}
	}
	public void moveOnBackDiagonal(char column, char row, int limit)
	{
		char xCoord, yCoord;
		for(int steps=1;steps<limit;steps++)  
	    {
	        xCoord = (char)(column + steps);
	        yCoord = (char)(row - steps);
	        if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	        
	        xCoord = (char)(column - steps);
	        yCoord = (char)(row + steps);
	        if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	    }
	}
	public void moveVertical(char column, char row, int limit)
	{
		char xCoord = column, yCoord;
		for(int steps=1;steps < limit;steps++)  
	    {
	        yCoord = (char)(row - steps);
	        if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	             
	        yCoord = (char)(row + steps);
	        if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	    }
	}
	public void moveHorizontal(char column, char row, int limit)
	{
		char xCoord, yCoord = row;
		for(int steps = 1;steps < 2;steps++)  
	    {
	        xCoord = (char)(column + steps);
	        if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	             
	        xCoord = (char)(column - steps);
	        if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	    }
	}
}