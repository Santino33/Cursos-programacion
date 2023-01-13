	import java.util.Scanner;
	
	public class waterRate{
	  public static void main(String[]args){
	     //Programa para calcular el precio del agua
		 
		 //Declaro variables
		 String name;
		 String condition = null;
		 String valid = "V";
		 String discontinued = "S";
		 int stratum;
		 double spent;
		 double total;
		 
		 //Pedir datos
		 
		 Scanner lector = new Scanner(System.in);
		 
		 System.out.println("Programa para calcular el precio del agua");
		 System.out.println("Digite su nombre");
		  name=lector.nextLine();
		 System.out.println("Digite su estado (V mayuscula para vigente, S mayuscula para suspendido");
		  stratum = lector.nextInt();
		 System.out.println("Digite su estrato 1-6");
		 stratum = lector.nextInt();
		 System.out.println("Digite su consumo al mes en cm3");
		 spent = lector.nextDouble();
		 
		 //Proceso
		 
		 if (condition == valid){
	        while (stratum < 1 && stratum > 6){
				System.out.println("Error, digite nuevamente su estrato");
				stratum = lector.nextInt();
	            
			}
		    if (stratum == 1){
				total = 10000 + spent;
				System.out.print("Para el usuario " + name + " ,");
				System.out.print("El valor total a pagar en el mes es " + total + " ");
				System.out.println("La tarifa basica para su estrato es de $10000");
				
			}
			if (stratum == 2){
				total = 20000 + spent;
				System.out.print("Para el usuario " + name + " ,");
				System.out.print("El valor total a pagar en el mes es " + total + " ");
				System.out.println("La tarifa basica para su estrato es de $20000");
				
			}
			if (stratum == 3){
				total = 30000 + spent;
				System.out.print("Para el usuario " + name + " ,");
				System.out.print("El valor total a pagar en el mes es " + total + " ");
				System.out.println("La tarifa basica para su estrato es de $30000");
				
			}
			if (stratum == 4){
				total = 45000 + spent;
				System.out.print("Para el usuario " + name + " ,");
				System.out.print("El valor total a pagar en el mes es " + total + " ");
				System.out.println("La tarifa basica para su estrato es de $45000");
				
			}
			if (stratum == 5){
				total = 60000 + spent;
				System.out.print("Para el usuario " + name + " ,");
				System.out.print("El valor total a pagar en el mes es " + total + " ");
				System.out.println("La tarifa basica para su estrato es de $60000");
				
			}
			if (stratum == 6){
				total = 70000 + spent;
				System.out.print("Para el usuario " + name + " ,");
				System.out.print("El valor total a pagar en el mes es " + total + " ");
				System.out.println("La tarifa basica para su estrato es de $70000");
				
			}		
	  }
	  else {
			 System.out.println("Usuario suspendido, gracias por su tiempo");
		 }
	  }}