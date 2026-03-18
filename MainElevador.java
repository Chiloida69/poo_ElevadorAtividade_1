public class MainElevador {
    public static void main(String[] args) {
        Elevador p = new Elevador();
        //Abrindo a porta
        p.portaAberta();
        //tentando subir de andar com a porta aberta 
        p.subirAndar();
        //fechando a porta 
        p.fecharPorta();
        //Subindo o andar
        p.subirAndar();
        p.subirAndar();
        p.subirAndar();
        p.subirAndar();
        //Abrindo a porta para sair do andar 
        p.portaAberta();
        //tentando descer sem fechar a porta 
        p.descerAndar();
        //Fechadno a porta 
        p.fecharPorta();
        //descendo andar 
        p.descerAndar();
        p.descerAndar();
        //abrindo a porta 
        p.portaAberta();
        //mostrando andar 
        p.mostrarAndar();
        //Mostrando status da porta 
        p.statusPorta();
        


    }
}