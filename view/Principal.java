package view;
import java.util.Random;
import controller.Processador;

public class Principal {

	public static void main(String[] args) {
	
		Random random = new Random();
		
		Processador proc = new Processador();
		int[] prato = new int[5];
	
		proc.iniciaPrato();
		
		for (int i=0; i<prato.length; i++) {
			prato[i] = 1 + random.nextInt(90); 
            System.out.println(prato[i]); 
       }
	}

}
