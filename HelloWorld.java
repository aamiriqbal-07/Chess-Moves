package aamir;
import java.util.Scanner;
public class HelloWorld 
{
	public static boolean Empty_Cell(char x, char y)
	{
	    return false;
	}
	
	public void Move_King(String position)
	{
	    char column = position.charAt(0), row = position.charAt(1), x, y;
	    for(int i = 1;i < 2;i++)  
	    {
	        x = (char)(column + i); 
	        y = (char)(row + i);
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");
	            
	        x = (char)(column-i);
	        y = (char)(row-i);
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");
	    }
	    for(int i=1;i<2;i++)  
	    {
	        x = (char)(column+i);
	        y = (char)(row-i);
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");
	        
	        x = (char)(column-i);
	        y = (char)(row+i);
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");
	    }
	    for(int i=1;i<2;i++)  
	    {
	        x = (char)(column);
	        y = (char)(row-i);
	        if(y>='1' && y<='8')
	            System.out.print(x+""+y+" ");
	             
	        x = (char)column;
	        y = (char)(row+i);
	        if(y>='1' && y<='8')
	            System.out.print(x+""+y+" ");
	    }
	    for(int i=1;i<2;i++)  
	    {
	        x = (char)(column+i);
	        y = (char)row;
	        if(x>='A' && x<='H')
	            System.out.print(x+""+y+" ");
	             
	        x = (char)(column-i);
	        y = (char)row;
	        if(x>='A' && x<='H')
	            System.out.print(x+""+y);
	    }
	}

	public void Move_Qween(String position)
	{
		char column = position.charAt(0), row = position.charAt(1), x, y;
	    for(int i=1;i<=8;i++)  
	    {
	        x = (char)(column+i);
	        y = (char)(row+i);
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");
	        
	        x = (char)(column-i);
	        y = (char)(row-i);        
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");;
	    }
	    for(int i=1;i<=8;i++)  
	    {
	        x = (char)(column+i);
	        y = (char)(row-i);
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");;
	        
	        x = (char)(column-i);
	        y = (char)(row+i);        
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");;
	    }
	    for(int i=1;i<=8;i++)  
	    {
	        x = column;
	        y = (char)(row-i);
	        if(y>='1' && y<='8')
	            System.out.print(x+""+y+" ");;
	                
	        y = (char)(row+i);
	        if(y>='1' && y<='8')
	            System.out.print(x+""+y+" ");;
	    }
	    for(int i=1;i<=8;i++)  
	    {
	        x = (char)(column+i);
	        y = row;
	        if(x>='A' && x<='H')
	            System.out.print(x+""+y+" ");;
	                
	        x = (char)(column-i);
	        if(x>='A' && x<='H')
	            System.out.print(x+""+y+" ");
	    }
	}
	
	public void Move_Bishop(String position)
	{
		char column = position.charAt(0), row = position.charAt(1), x, y;
	    for(int i=1;i<=8;i++)  
	    {
	        x = (char)(column+i);
	        y = (char)(row+i);
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");
	        
	        x = (char)(column-i);
	        y = (char)(row-i);        
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");
	    }
	    for(int i=1;i<=8;i++)  
	    {
	        x = (char)(column+i);
	        y = (char)(row-i);
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");
	        
	        x = (char)(column-i);
	        y = (char)(row+i);        
	        if((x>='A' && x<='H') && (y>='1' && y<='8'))
	            System.out.print(x+""+y+" ");
	    }
	}
	
	public void Move_Rook(String position)
	{
		char column = position.charAt(0), row = position.charAt(1), x, y;
	    for(int i=1;i<=8;i++)  
	    {
	        x = column;
	        y = (char)(row-i);
	        if(y>='1' && y<='8')
	            System.out.print(x+""+y+" ");
	                
	        y = (char)(row+i);
	        if(y>='1' && y<='8')
	            System.out.print(x+""+y+" ");
	    }
	    for(int i=1;i<=8;i++)  
	    {
	        x = (char)(column+i);
	        y = row;
	        if(x>='A' && x<='H')
	            System.out.print(x+""+y+" ");
	                
	        x = (char)(column-i);
	        if(x>='A' && x<='H')
	            System.out.print(x+""+y+" ");
	    }
	}
	
	void Move_Horse(String position)
	{
		char column = position.charAt(0), row = position.charAt(1), x, y;
	    x = (char)(column+2);
	    y = (char)(row+1);
	    if((x>='A' && x<='H') && (y>='1' && y<='8'))
	        System.out.print(x+""+y+" ");
	        
	    y = (char)(row-1);
	    if((x>='A' && x<='H') && (y>='1' && y<='8'))
	        System.out.print(x+""+y+" ");
	    
	    x = (char)(column-2);
	    y = (char)(row+1);
	    if((x>='A' && x<='H') && (y>='1' && y<='8'))
	        System.out.print(x+""+y+" ");
	    
	    y = (char)(row-1);
	    if((x>='A' && x<='H') && (y>='1' && y<='8'))
	        System.out.print(x+""+y+" ");
	    
	    x = (char)(column+1);
	    y = (char)(row+2);
	    if((x>='A' && x<='H') && (y>='1' && y<='8'))
	        System.out.print(x+""+y+" ");
	        
	    x = (char)(column-1);
	    if((x>='A' && x<='H') && (y>='1' && y<='8'))
	        System.out.print(x+""+y+" ");
	        
	    x = (char)(column+1);
	    y = (char)(row-2);
	    if((x>='A' && x<='H') && (y>='1' && y<='8'))
	        System.out.print(x+""+y+" ");
	        
	    x = (char)(column-1);
	    if((x>='A' && x<='H') && (y>='1' && y<='8'))
	        System.out.print(x+""+y+" ");
	}
	
	public void Move_Pawn(String position)
	{
		char column = position.charAt(0), row = position.charAt(1), x, y;
	    x = (char)(column+1);
	    y = row;
	    if(x>='A' && x<='H')  
	    	System.out.print(x+""+y+" ");
	    x = (char)(column+1);
	    y = (char)(row-1);
	    if((x>='A' && x<='H') && (y>='1' && y<='8') && !Empty_Cell(x,y))
	        System.out.print(x+""+y+" ");
	    y = (char)(row+1);
	    if((x>='A' && x<='H') && (y>='1' && y<='8') && !Empty_Cell(x,y))
	        System.out.print(x+""+y+" ");
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String piece = input.nextLine();  // TAKING INPUT FOR CHESS PIECE AND ITS POSITION INTO ONE VARIABLE.
		String position = piece.substring(piece.length() - 2);
		String type = piece.substring(0,piece.length()-3);
		HelloWorld obj = new HelloWorld();
		
		if(type.equals("King"))  obj.Move_King(position);
	    else if(type.equals("Qween"))  obj.Move_Qween(position);
	    else if(type.equals("Bishop"))  obj.Move_Bishop(position);
	    else if(type.equals("Horse"))  obj.Move_Horse(position);
	    else if(type.equals("Rook"))  obj.Move_Rook(position);
	    else if(type.equals("Pawn"))  obj.Move_Pawn(position);
 	}
}
