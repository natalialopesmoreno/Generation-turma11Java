package aplicacoes;

public class ExtraCode {

	public static void main(String[] args) {
		
		int sequence [] = {1, 2, 1, 2};
		//System.out.println(almostIncreasingSequence(sequence) );
		
		
		
		boolean resposta = false;
        
        int contador = 0;
        int comparador =1;
        int comparador2 =1;
        int comparador3 =0;
        
        int vetor [] = new int[(sequence.length -1)];

            for(int x=0 ; x < sequence.length -1; x++)
            {
                if(sequence[x+1] > sequence[x]) 
                {
            	vetor[x] =  sequence[x+1] - sequence[x]; 
            	System.out.println(vetor[x]);
                }else 
                {
                	vetor[x] = 0;
                }
            }
            
            for(int y=0 ; y < vetor.length -1; y++)
	}
}
	
//	public static boolean almostIncreasingSequence(int[] sequence) 
//	{
//	        
//	        boolean resposta = false;
//	        
//	        int contador = 0;
//	        int comparador =1;
//	        int comparador2 =1;
//	        int comparador3 =0;
//	        
//	        int vetor [] = new int[(sequence.length -1)];
//
//	            for(int x=0 ; x < sequence.length -1; x++)
//	            {
//	                
//	            	vetor[x] =  sequence[x+1] - sequence[x]; 
//	            	System.out.println(vetor[x]);
//	            	
////	            	if(x+2 < sequence.length)
////	            	{
////	                    comparador =  sequence[x+1] - sequence[x];
////	                    comparador2 = sequence[x+2] - sequence[x];
////	                   
////	                    if(comparador2 == comparador*2)
////	                    {
////	                    	resposta = true;
////	                    }else
////	                    {
////	                    	 for(int y=1 ; y<= sequence.length; y++)
////	 	                    {
////	 	                        if( (y + 2) <= sequence.length)
////	 	                        {
////	 	                            comparador3 = sequence[y] - sequence[y+2];
////	 	                            
////	 	                        if(comparador3 == comparador)
////	 	                        {
////	 	                            contador++;
////	 	                        }
////	 	                        }
////	 	                    }
////	                    }
////	                    
//	                    
//	                   
//
//	            	}    
//	            }
//	            
//	    return resposta;
//	}
//
//
//
//}
