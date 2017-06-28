package proba;

import java.util.Scanner;

/**
 * @author arodrigu
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    double num1, num2;
    double resultado;
    Scanner teclado = new Scanner(System.in);

    System.out.print("Mete numero1: ");
    num1 = teclado.nextDouble();
    System.out.print("Mete numero2: ");
    num2 = teclado.nextDouble();
    resultado = Suma(num1, num2);
    System.out.print("el resultado es " + resultado);

  }

  // Metodo que recibe dos numeros y devuleve la suma de ambos
  public static double Suma(double n1, double n2) {

    double resultado; // variable para almacenar el resultado

    resultado = n1 + n2; // operacion de suma

    return resultado; // devolvemos el resultado
  }

}
