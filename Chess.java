package Chess_Piece_Movement_Simulator;
import java.util.Scanner;
public class Chess 
{
	public static boolean Empty_Cell(char x, char y)  // THIS IS A DEMO FUNCTION TO CHECK WHETHER THE CELL ON THE DIAGONAL OF PAWN IS EMPTY OF NOT
	{
	    return false;
	}
	public static int Check_Validity(String Position)
	{
		int  flag1 = 0, flag2 = 0;
		if(Position.charAt(0)>='A' && Position.charAt(0)<='H')  
			flag1 = 1;
		if(Position.charAt(1)>='1' && Position.charAt(1)<='8')
			flag2 = 1;
		return (flag1 & flag2);
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
	 	       piece = piece.replaceAll("\\s", "");
	 	       
		String position = piece.substring(piece.length() - 2);
		
		String type = piece.substring(0,piece.length()-2);
			   type = type.toLowerCase();
		
	    Chess obj = new Chess();
//		System.out.println(position+" "+type);
		if(Check_Validity(position) == 0)
		{
			System.out.println("Invalid Input!");
			return;
		}
		if(type.equals("king"))  obj.Move_King(position);
	    else if(type.equals("qween"))  obj.Move_Qween(position);
	    else if(type.equals("bishop"))  obj.Move_Bishop(position);
	    else if(type.equals("horse"))  obj.Move_Horse(position);
	    else if(type.equals("rook"))  obj.Move_Rook(position);
	    else if(type.equals("pawn"))  obj.Move_Pawn(position);
	    else  System.out.println("Invalid Input!");
 	}
}

