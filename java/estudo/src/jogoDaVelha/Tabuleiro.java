package jogoDaVelha;

import java.util.Arrays;

public class Tabuleiro 

{
	
	String[][] campos = new String[3][3];
	
	
	public Tabuleiro() 
	{
		for(int x=0; x< 3; x++) 
		{
			for(int y =0; y<3; y++) 
			{
				campos[x][y]= "_";
			}
		}
	}


	
	public void imprimir() 
	{
		for(int x=0; x< 3; x++) 
		{
			for(int y =0; y<3; y++) 
			{
				System.out.print(campos[x][y]+ "-");
			}
			System.out.println();
		}
	}
	
	
	public boolean isWinner() 
	{
		boolean resp = false;
		//REVER ESTE MÉTODO
		for(int x=0; x< 3; x++) 
		{
			
			if(x==0 ) 
			{
				if(campos[x][x] == campos[x+1][x+1] && campos[x+1][x+1] == campos[x+2][x+2]) 
				{
					resp = true;
				}
			}else if(x==2) 
			{
				if(campos[x][x] == campos[x-1][x-1] && campos[x-1][x-1] == campos[x-2][x-2]) 
				{
					resp = true;
				}
			}
			
			
			if(campos[x][x] == campos[x+1][x] && campos[x+1][x] == campos[x+2][x]) 
			{
				resp = true;

			}else if(campos[x][x] == campos[x][x+1] && campos[x][x+1] == campos[x][x+2]) 
			{
				resp = true;
			} 
					
			
			
		}
		
		
		return resp;
		
	}
	
	
	
	
}
