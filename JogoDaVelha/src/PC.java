public class PC {
    private char letra = 'O';
    Mapa mapa;
   
    public PC(Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean jogar() {
        boolean retorno =  false;
        int sortearL;
        int sortearC;
        do {
        sortearL = mapa.sortear(0, 3);
        sortearC = mapa.sortear(0, 3);
        if (mapa.jogar(sortearL, sortearC ,letra)) {
            retorno = true;
        }
        } while(retorno != true);

        System.out.println("PC["+sortearL+","+sortearC+"]");
        
        if (mapa.verificarGanhador(letra)) {
            System.out.println(" ... PC GANHOU!");
            return true;
        }
        return false;
    }

}