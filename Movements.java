package aamir;
import java.util.ArrayList;

public class Movements 
{
	CheckConditions checkObject = new CheckConditions();
	public ArrayList <String> moveHorseOnly(char column, char row, int limit)
	{
		ArrayList <String> moves = new ArrayList <String> ();
		char xCoord, yCoord;
		xCoord = (char)(column+2);
		yCoord = (char)(row+1);
	    if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	        
	    yCoord = (char)(row-1);
	    if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	    
	    xCoord = (char)(column-2);
	    yCoord = (char)(row+1);
	    if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	    
	    yCoord = (char)(row-1);
	    if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	    
	    xCoord = (char)(column+1);
	    yCoord = (char)(row+2);
	    if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	        
	    xCoord = (char)(column-1);
	    if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	        
	    xCoord = (char)(column+1);
	    yCoord = (char)(row-2);
	    if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	        
	    xCoord = (char)(column-1);
	    if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
		
	    return moves;
	}
	public ArrayList <String> moveOnFrontDiagonal(char column, char row, int limit)
	{
		ArrayList <String> moves = new ArrayList <String> ();
		char xCoord, yCoord;
		for(int steps = 1;steps < limit;steps++)
		{
			xCoord = (char)(column + steps);
			yCoord = (char)(row + steps);
			if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
			
			xCoord = (char)(column - steps);
	        yCoord = (char)(row - steps);
	        if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
		}
		return moves;
	}
	public ArrayList <String> moveOnBackDiagonal(char column, char row, int limit)
	{
		ArrayList <String> moves = new ArrayList <String> ();
		char xCoord, yCoord;
		for(int steps=1;steps<limit;steps++)  
	    {
	        xCoord = (char)(column + steps);
	        yCoord = (char)(row - steps);
	        if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	        
	        xCoord = (char)(column - steps);
	        yCoord = (char)(row + steps);
	        if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	    }
		return moves;
	}
	public ArrayList <String> moveVertical(char column, char row, int limit)
	{
		ArrayList <String> moves = new ArrayList <String> ();
		char xCoord = column, yCoord;
		for(int steps=1;steps < limit;steps++)  
	    {
	        yCoord = (char)(row - steps);
	        if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	             
	        yCoord = (char)(row + steps);
	        if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	    }
		return moves;
	}
	public ArrayList<String> moveHorizontal(char column, char row, int limit)
	{
		ArrayList <String> moves = new ArrayList <String> ();
		char xCoord, yCoord = row;
		for(int steps = 1;steps < 2;steps++)  
	    {
	        xCoord = (char)(column + steps);
	        if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	             
	        xCoord = (char)(column - steps);
	        if(checkObject.checkBoundry(xCoord, yCoord))  moves.add(""+xCoord+yCoord);
	    }
		return moves;
	}
}