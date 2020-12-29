package aamir;

import java.util.ArrayList;

public class Horse 
{
	static ArrayList<Pair<Character,Character>> xymoves = new ArrayList<Pair<Character,Character>>();
	static void moveHorse(char coordinates[])
	{
		char column = coordinates[0], row = coordinates[1];
		int limit = -1;
		
		char xCoord, yCoord;
		xCoord = (char)(column+2);  yCoord = (char)(row+1);
	    if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	        
	    yCoord = (char)(row-1);
	    if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	    
	    xCoord = (char)(column-2);  yCoord = (char)(row+1);
	    if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	    
	    yCoord = (char)(row-1);
	    if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	    
	    xCoord = (char)(column+1);  yCoord = (char)(row+2);
	    if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	        
	    xCoord = (char)(column-1);
	    if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	        
	    xCoord = (char)(column+1);  yCoord = (char)(row-2);
	    if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	        
	    xCoord = (char)(column-1);
	    if(InputValidity.checkBoundry(xCoord, yCoord))  xymoves.add(new Pair(xCoord,yCoord));
	    
	    Movements.xymoves = Horse.xymoves;
	}
}
