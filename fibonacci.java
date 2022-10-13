package ejercicios2.java;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Numero:");
	int numero=entrada.nextInt();
	int F,ultimo,penultimo;
	if(numero==0){
		F = 0;
		
	}
	else if (numero == 1) {
    F = 1;
	}
	else {
	penultimo = 0;
	ultimo= 1;
	F=0;
	for (int i=1; i<=numero; i++) {
		F= ultimo+penultimo;
		penultimo=ultimo;
		ultimo=F;
	}
	}
System.out.println("F(" + numero + ")="+F);
	}

}

