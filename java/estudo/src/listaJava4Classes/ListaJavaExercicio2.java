package listaJava4Classes;

public class ListaJavaExercicio2 {

	public static void main(String[] args) {
		
		
		Aviao av = new Aviao("Azul", "Tam", 0, "Brasil", "Disney");
		
		av.toString();
		
		av.acelerar(100);
		System.out.println("\n");
		av.desacelerar(50);
		System.out.println("\n");
		av.destinar("Itália");
		av.destinar("Disney");
		System.out.println("\n");
		av.estaPousado();
		System.out.println("\n");
		av.estaVoando();
		System.out.println("\n");
		av.rotear();
		System.out.println("\n");
		av.pousar();
		

	}

}
