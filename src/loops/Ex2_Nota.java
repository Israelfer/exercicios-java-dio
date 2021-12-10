package loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        int nota;

        System.out.println("Digite uma Nota de 0 a 10: "); //Peça uma nota de 0 a 10
        nota = scan.nextInt(); // Entrada de dados, neste caso de um int

        while(nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

        System.out.println("Nota: " + nota); //imprimindo a nota válida
    }
}
