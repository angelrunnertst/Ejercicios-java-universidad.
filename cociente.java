package ejercicios2.java;
import java.util.Scanner;
public class cociente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int numero1=0;
        System.out.println("Introduce el primer numero: ");
        numero1= teclado.nextInt();
        int numero2=0;
        System.out.println("Introduce el segundo numero: ");
        numero2= teclado.nextInt();
        int resultado = 0;
        resultado= numero1%numero2;
        System.out.println("el resto es " + numero1 + " % " + numero2 + " = " + resultado);
		
        while(numero2==0) {
		System.out.println("no existe el cociente");
		

	}

}
}