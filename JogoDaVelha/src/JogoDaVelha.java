// oi
import java.util.Scanner;

public class JogoDaVelha {

    Mapa jogoMapa;
    PC jogoPC;
    Jogador jogoJogador;
   
    private JogoDaVelha() {       
        Scanner teclado = new Scanner(System.in);
        jogoMapa = new Mapa();
        jogoPC = new PC(jogoMapa);
        jogoJogador = new Jogador(jogoMapa);
       
        char resposta;
    
        do {
            Jogar(teclado);
            System.out.println("________________________");
            System.out.println("Deseja jogar novamente (s/n)?");
            resposta = teclado.next().charAt(0);
        } while(resposta == 's');

        teclado.close();
    }
   
    private void Jogar(Scanner teclado) {
        jogoMapa.limpar();
        boolean ganhou = false;
        int jogada = 0;
        int sorteio = jogoMapa.sortear(0, 2);
        do {
            jogoMapa.desenhar(jogada);
            for (int i = 0 ; i < 9 ; i++) {
                if (sorteio == 1) {
                    jogada++;
                    ganhou = jogoJogador.jogar(teclado);
                    jogoMapa.desenhar(jogada);
            
                } else {
                    jogada++;
                    ganhou = jogoPC.jogar();
                    jogoMapa.desenhar(jogada);
                }
                if (sorteio == 1) {
                    sorteio = 0;
                } else {
                    sorteio = 1;
                }
                if (ganhou) {
                    i = 10;
                }
                if (i == 8) {
                    ganhou = true;
                    System.out.println(" ... EMPATOU!");
                }
        }
        } while (ganhou == false);
        
    }
   
    public static void main(String[] args) throws Exception {
        new JogoDaVelha();
    }
}
