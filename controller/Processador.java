//qnd processou: semáforo
//carregando: n tem semaforo

package controller;

public class Processador {

	int posicao = 0;
	int[] classificacao = new int[5];

	public Processador() {
		super();
	}

	public void iniciaPrato() {

	    	int tempoMaximo = 500;
	    	
	        for (int t = 0; t < 5; t++) {
	            int prato = t + 1;
	            Thread thread = new ThreadPrato(prato, prato);
	        }
	        
	}

	    public void pratoFinal(int prato){
	        classificacao[posicao] = prato;
	        System.out.println("prato " + prato + " chegou em " + ( posicao + 1 ) + "posicao.");
	        posicao++;
	    }

	    class ThreadPrato extends Thread {

	        int puloMaximo;
	        int tempoMaximo;
	        int tempoPercorrido;
	        int puloPercorrido;
	        int prato;

	        public ThreadPrato(int distanciaMaxima, int prato){
	            this.tempoMaximo = tempoMaximo;
	            this.puloMaximo = 100;
	            this.prato = prato;
	        }

	        public void run() {
	            while (verificaChegada() == false){
	                pula();
	            }pratoFinal();
	        }

	        public void pula(){
	            int tamanhoSalto = (int)(Math.random()*puloMaximo);
	            tempoPercorrido += tamanhoSalto;
	            System.out.println("O sapo " + prato + " deu um salto de " + tamanhoSalto + " metros e percorreu " + tempoPercorrido + " metros.");
	        }

	        public boolean verificaChegada(){
	            return tempoPercorrido >= tempoPercorrido;
	        }

	        public void pratoFinal(){
	        	Processador.this.pratoFinal(prato);
	        }

	    }
}

