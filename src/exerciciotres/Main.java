package exerciciotres;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Em que turno você trabalha?");
        System.out.println("Escolha as opções:");
        System.out.println("M-matutino\nV-vespertino\nN-noturno");

        String turno = teclado.nextLine();
        String m = "M";
        String v = "V";
        String n = "N";



        if(turno == m) {
            System.out.println("Bom dia!");
        } else if (turno == v) {
            System.out.println("Boa tarde!");
        } else if (turno == n) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor Invalido");
        }
    }
}
