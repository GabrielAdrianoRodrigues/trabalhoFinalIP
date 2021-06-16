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
        
            do {
                System.out.println("________________________");
                System.out.println("Deseja jogar novamente (s/n)?");
                resposta = teclado.next().charAt(0);
            } while();
        } while (resposta == 's');

        
        boolean ganhou = jogoJogador.jogar(teclado);
    }

    private void Jogar(Scanner teclado) {
        jogoMapa.Limpar();
         
    }
    
    public static void main(String[] args) throws Exception {
        new JogoDaVelha();
    }
}
