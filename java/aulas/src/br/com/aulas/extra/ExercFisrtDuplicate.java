package br.com.aulas.extra;

public class ExercFisrtDuplicate {
public static void main(String[] args) {
	
	int a[]= {2, 1, 3, 5, 3, 2};
	
	System.out.println(firstDuplicate(a));
	
	
	

}


public static int firstDuplicate(int[] a) {
    
    int duplicado = -1;
    int index = (a.length-1);
    
    
    	for(int x=0; x< a.length; x++)
    	{
    		for(int y = x+1; y <= (a.length - 1); y++)
    		{
    			if(a[x] == a[y] && x != y && index >= y && y > x)
    			{
                duplicado = a[y];
                index = y;
    			} 
        }
        
    }
    
       
    
    return duplicado;  

}




}

