public class Elevador {
    private int andar; // contar os andares 
    private boolean portaAberta; //armazenar status da porta
    private final int MAX_ANDAR = 5; //Ultimo andar
    private final int MIN_ANDAR = 0; // Térreo
    public Elevador (){
        this.andar = 0; //inicia o andar no terreo ou andar 0
        this.portaAberta = false; //Inicia a porta fechada 
    }
    //Porta Aberta
    public void portaAberta(){
        this.portaAberta= true; // muda o status da porta para aberto 
        System.out.println("Porta está aberta!");
    }

    //Porta fechada
    public void fecharPorta(){
        this.portaAberta=false; // muda  o status da porta para fechada 
        System.out.println("A porta está fechada!");
    }

    public void subirAndar(){
      if (portaAberta) {
        System.out.println("Feche a porta, para subir de andar. ");/*porta está aberta não deve fazer a ação */
      }
      else if (andar == MAX_ANDAR) {
         System.out.println("Já está no ultimo andar! "); // não sobe pois não tem como subir mais 
      }
      else {
        andar ++; // sobe o andar 
        System.out.println("Subimos para o andar "+andar);
      }
    }
    public void descerAndar(){
           if (portaAberta) {
        System.out.println("Feche a porta, para descer de andar. ");/*porta está aberta não deve fazer a ação */
      }
      else if (andar == MIN_ANDAR) {
         System.out.println("Já está no terreo! "); // não desce por não ter como descer mais 
      }
      else {
        andar --; //desce o andar 
        System.out.println("Descemos para o andar "+andar);
      }
    }
    public void mostrarAndar(){  // Apontar em qual andar está 
        System.err.println("Estamos no andar de N°: "+andar);
    }

    public void statusPorta(){
        if (portaAberta == false) { // Verifica se a porta ta fechada 
            System.out.println( "A porta está fechada! " );
        }
        else { // a porta esta aberta 
            System.out.println( "A porta está aberta! " );
        }
        
    }
}
