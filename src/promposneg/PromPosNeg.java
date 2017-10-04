
package promposneg;

import java.util.Scanner;

public class PromPosNeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0;  //contadores para positivos y negativos
        int i;
        double sumaPos = 0, sumaNeg = 0;  //suma de positivos y negativos
        
        //Leer valores ingresados por teclado y guardar en un arreglo
        System.out.println("Ingrese 10 números entre positivos y negativos :");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }
        //recorrer arreglo para sumar positivos y negativos
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0){ //sumar positivos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ //sumar negativos
                sumaNeg += numeros[i];
                neg++;
            }
        }
        //mostrar resultados
        System.out.println("-----------------------------------------------");
        if (pos != 0) {
            System.out.println("El promedio de los números positivos: " + sumaPos / pos);
        } else {
            System.out.println("No se ha insertado números positivos");
        }
        if (neg != 0) {
            System.out.println("El promedio de los números negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No se ha insertado números negativos");
        }
    }
    
}
