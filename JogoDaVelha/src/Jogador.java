import java.util.Scanner;

public class Jogador {
    char letra = 'X';
    Mapa mapa;

    public Jogador(Mapa mapa) {
        this.mapa = mapa;
    }
    
    public boolean jogar(Scanner teclado) {
        boolean retorno = false;
        do {
        System.out.println("Jogador ..");
        System.out.print("  linha: ");
        int l = teclado.nextInt();
        System.out.println("  coluna: ");
        int c = teclado.nextInt();
        if ((l == 0 || l == 1 || l ==2 ) && (c == 0 || c == 1 || c == 2)) {
            retorno = mapa.jogar(l , c , letra);
        } 
        } while (retorno != true);

        if (mapa.verificarGanhador(letra)) {
            System.out.println(" ... Jogador GANHOU!");
        }

        return true;
    }
}