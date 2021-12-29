/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedio = new double[3];
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int columna = 0; columna <= notas.length; columna++) {
                suma = suma + notas[i][columna];
            }
            promedio[i] = suma / 4;
            suma = 0;
        }
        for (int i = 0; i < promedio.length; i++) {
            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n",
                    estudiantes[i],
                    promedio[i]);
        }
    }

}
