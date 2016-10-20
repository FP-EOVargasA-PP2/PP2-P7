/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p7;
import java.util.Scanner;

/**
 *
 * @author osiri
 */
public class PP2P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        float c;
        //Procesos
        c = pedir();
        mostrar (c);
    }
    public static float pedir (){
        float c;
        Scanner teclado = new Scanner (System.in);
        System.out.println("*****   Velocidad   *****");
        System.out.println("Introduce la velocidad en Km/h");
        c = teclado.nextFloat();
        return c;
    }
    public static void mostrar (float c){
        System.out.println("La conversion a m/s es "+(c*1000/3600));
    }
}
