public class Mapa {
    private char mapa[][] = new char[3][3];

    private int sortear(int inicio, int fim) {
        return (int) ((Math.random() * fim) - inicio);
    }
    
    public void limpar() {
        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 3; j++) {
                mapa[i][j] = ' ';
            }
        }
    }

    public void desenhar(int jogada) {
            jogada = 0;
            System.out.println("------------- .. jogada:"+jogada);
            System.out.println("| "+mapa[0][0]+" | "+mapa[0][1]+" | "+mapa[0][1]+" |");
            System.out.println("-------------");
            System.out.println("| "+mapa[1][0]+" | "+mapa[1][1]+" | "+mapa[1][2]+" |");
            System.out.println("-------------");
            System.out.println("| "+mapa[2][0]+" | "+mapa[2][1]+" | "+mapa[2][2]+" |");
            System.out.println("----------------------------");
            jogada++;
    }

    public boolean jogar(int l, int c, char jogador) {
        if (mapa[l][c] == ' ') {
            return false;
        } else {
            mapa[l][c] = jogador;
        }
        return true;
    }

    public boolean verificarGanhador(char jogador) {
        if (mapa[0][0] == 'X' && mapa[0][1] == 'X' && mapa[0][2] == 'X') {
            return true;
        } else if ((mapa[1][0] == 'X' && mapa[1][1] == 'X' && mapa[1][2] == 'X')) {
            return true; 
        } else if ((mapa[2][0] == 'X' && mapa[2][1] == 'X' && mapa[2][2] == 'X')) {
            return true; 
        } else if ((mapa[0][0] == 'X' && mapa[1][0] == 'X' && mapa[2][0] == 'X')) {
            return true; 
        }else if ((mapa[0][1] == 'X' && mapa[1][1] == 'X' && mapa[2][1] == 'X')) {
            return true; 
        } else if ((mapa[0][1] == 'X' && mapa[1][1] == 'X' && mapa[2][1] == 'X')) {
            return true; 
        }
    }
    
}