import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Qual a ordem da matriz? ");
       int ordem = sc.nextInt();

       double[][] matriz = new double[ordem][ordem];
        
       for (int linhas = 0; linhas < ordem; linhas ++){
            for (int colunas = 0; colunas < ordem; colunas ++){
                System.out.print("Elemento [ " + linhas + " ],[" + colunas + " ]");
                matriz[linhas][colunas] = sc.nextInt();
            }
        }

       System.out.println();
       System.out.print("Diagonal Principal: ");

       for (int i = 0; i < ordem; i++){
            System.out.print(matriz[i][i] + " ");
        }

       int soma = 0;

       for (int linhas = 0; linhas < ordem; linhas ++){
            for (int colunas = 0; colunas < ordem; colunas ++){
                if (matriz[linhas][colunas] < 0){
                    soma = soma + 1;
                }
            }
        }
        System.out.println();
        System.out.print("Quantidade de negativos = " + soma);

        sc.close();
    }
}