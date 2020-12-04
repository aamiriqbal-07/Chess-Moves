package aamir;

public class CheckConditions 
{
	public int checkValidity(String Position)
	{
		int  flag1 = 0, flag2 = 0;
		if(Position.charAt(0)>='A' && Position.charAt(0)<='H')  
			flag1 = 1;
		if(Position.charAt(1)>='1' && Position.charAt(1)<='8')
			flag2 = 1;
		return (flag1 & flag2);
	}
	public boolean checkBoundry(char column, char row)
	{
		return (column>='A' && column<='H') && (row>='1' && row<='8');
	}
}
