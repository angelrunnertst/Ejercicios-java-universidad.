package ejercicios2.java;
import java.util.Scanner;
public class enterosjavaclass {
   
    public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner teclado = new Scanner(System.in);
   int a = 0;
   System.out.println("Introduce el primer numero");
   a = teclado.nextInt();
   int b = 0;
   System.out.println("Introduce el segundo numero");   
   b = teclado.nextInt();
   int resultado = 0;
   resultado = a + b; // lo mismo que esto :resultado=a+b;
   System.out.println("La suma es " + a + " + " + b + " = " + resultado);
		
	}

}

