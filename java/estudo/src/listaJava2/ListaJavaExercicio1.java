package listaJava2;

public class ListaJavaExercicio1 
{

	public static void main(String[] args) 
	{
		/*
		 * 
		 * Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		 * 
		 */
		
		
		int x=0;
		
		
		for(x=1000; x<2000; x++)
		{
			
			if(x % 11 == 5) 
			{
				System.out.println(x);
			}
			
		}
		
		
		
	}

}
