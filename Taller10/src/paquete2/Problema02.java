/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        double sumatotal = 0;
        
        for (int i = 0; i < vendedores.length; i++) {
            System.out.printf("Vendedor(a) %s\n", vendedores[i]);
        }
        System.out.printf("Ha realizado un total de %.2f en ventas.\n",
                sumatotal);
    }
}
