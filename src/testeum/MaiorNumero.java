package testeum;

import java.util.Scanner;

import static java.lang.Math.*;

public class MaiorNumero {
        public static void main (String[]args){
            Scanner teclado = new Scanner(System.in);
            int a = 7;
            int b = 14;
            int c = 106;

            int maiorAB = (a+b+Math.abs(a-b))/2;
            int maiorBC = (maiorAB + c + Math.abs(maiorAB -c)) / 2;
            System.out.printf(maiorBC +" eh o maior\n");



        }
    }

