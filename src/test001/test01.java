package test001;

import java.util.Random;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numeros = {{3,4,6},
                            {7,8,9},
                            {1,2,3}};

        for (int i = 0; i < numeros.length;i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
        }

        System.out.println(" ");

        for (int i = 0; i < numeros[0].length; i++) {
            for (int j = 0; j < numeros.length;j++){
                System.out.print(numeros[j][i] + " ");
            }
        }

        System.out.println(" ");

        System.out.println("""
                _ | _ | _
                _ | _ | _
                _ | _ | _
                """);
    }
}
