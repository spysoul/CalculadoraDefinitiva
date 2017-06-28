package calculadorafinalisima;

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

    int num1, num2;
    Scanner teclado = new Scanner(System.in);

    System.out.print("Mete numero1");
    num1 = teclado.nextInt();
    System.out.print("Mete numero1");
    num2 = teclado.nextInt();

  }
  
  //Metodo que recibe dos numeros y devuleve la suma de ambos
  Public double Suma (double n1, double n2)
  {
    double resultado; //variable para almacenar el resultado
    
    resultado = n1 + n2; //operacion de suma
    
    return resultado; //devolvemos el resultado
  }

}
