/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String cadena = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < 2; j++) {
                if ("S".equals(estudiantes[i][j].charAt(0))
                        || "P".equals(estudiantes[i][j].charAt(0))
                        || "T".equals(estudiantes[i][j].charAt(0))) {
                    cadena = String.format("%s %s\n", cadena, estudiantes[i][j]);
                }

            }
        }
        System.out.println(cadena);
    }
}
//No me aparece la cadena 