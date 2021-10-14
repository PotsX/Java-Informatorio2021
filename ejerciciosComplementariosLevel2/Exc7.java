package ejerciciosComplementariosLevel2;

import java.util.*;

public class Exc7 {
	

	 public static void main(String args[]){
	        int num1;
	        int num2;
	        
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Ingrese el numero de inicio: ");
	        num1 = scan.nextInt();
	        scan.nextLine();
	        System.out.println("Ingrese el numero final: ");
	        num2 = scan.nextInt();
	        scan.close();
	        
	        calculo(num1, num2);
	        
	 }
	 public static void calculo(int num1, int num2) {
		 for (int i = num1; i < num2; i++){
	            if(i%2==0 && i%3 == 0){
	            	System.out.println("FizzBuzz");
	            }
	            else if (i%3 == 0){
	            	System.out.println("Buzz");
	            }
	            else if(i%2 == 0){
	            	System.out.println("Fizz");
	            }
	            else{
	            	System.out.println(i);
	            }
	        }
	}
}