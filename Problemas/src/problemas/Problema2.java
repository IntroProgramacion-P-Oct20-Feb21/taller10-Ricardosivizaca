/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;

/**
 *
 * @author Elio Sivizaca
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner entrada = new Scanner(System.in);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        int nombre;
        double suma = 0;
        String x = "";
        for (String vendedore : vendedores) {
            System.out.println("Ingrese 1 para Jessica o 2 para Robert");
            nombre = entrada.nextInt();
            if (nombre == 1){
                for (int col = 0; col < 5; col++){
                    System.out.println("Ingrese ventas de Jessica");
                    ventas[0][col] = entrada.nextDouble();
                    suma = suma + ventas[0][col];
                }
            }else{
                for (int col = 0; col < 5; col++){
                    System.out.println("Ingrese ventas de Robert");
                    ventas[0][col] = entrada.nextDouble();
                    suma = suma + ventas[0][col];
                }
            
            }
            x = String.format("%sVendedores(a) %s\n", x, vendedore);
        }
        System.out.printf("%sHan realizado un total de: $%.2f en ventas",x,
                suma);
    }
    
}
