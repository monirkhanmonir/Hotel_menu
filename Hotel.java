import java.lang.*;
import java.util.Scanner;
public class Hotel{
	public static void main(String[] args){
		Hotel obj = new Hotel();
		Scanner input = new Scanner(System.in);
		 System.out.println("welcome our hottel>>>>.........");
		 System.out.println("1. Kacchi Birani.");
		 System.out.println("2. Chicken Birani.");
		 System.out.println("3. Plain Plaw .");
		 System.out.println("4. Chicken Bhuna Khecuri .");
		 System.out.println("5. Mutton Bhuna Khecuri .");
		 System.out.println("6. Mutton Tehari .");
		 System.out.println("7. Plain rice .");
		 System.out.println("8. Pabda fish .");
		 System.out.println("");
		 
		 
		while(true){
			obj.menu();
		}
		 
	}
	
	
	public void menu(){
		Scanner input1 = new Scanner(System.in);
		System.out.print("Select Your choyes  : ");
		 int num = input1.nextInt();
		
		switch (num){
			case 1:
				
				System.out.println("Kacchi Birani full 220tk Half 130TK.");
				System.out.println("Kacchi Birani (with kabab). Full : 255Tk, Half : 130tk.");
				System.out.println("Kacchi Birani (with agg). Full : 240Tk, Half : 120tk.");
				System.out.println("Kacchi Birani (with kabab and agg). Full : 255Tk, Half : 140tk.");
				System.out.println("");
				break;
			case 2:
				System.out.println("");
				System.out.println("Chicken Birani full 220tk Half 130TK.");
				System.out.println("Chicken Birani (with kabab). Full : 255Tk, Half : 130tk.");
				System.out.println("Chicken Birani (with agg). Full : 240Tk, Half : 120tk.");
				System.out.println("Chicken Birani (with kabab and agg). Full : 255Tk, Half : 140tk.");
				System.out.println("");
				break;
			case 3:
				System.out.println("");
				System.out.println("Plain Plaw full 60tk,  half 35tk.");
				System.out.println("");
				break;
				
			case 4:
				System.out.println("");
				System.out.println("Chicken Bhuna Khecuri full 230tk,  half 155tk.");
				System.out.println("Chicken Bhuna Khecuri (with kabab) full 250tk,  half 130tk.");
				System.out.println("Chicken Bhuna Khecuri (with agg) full 240tk,  half 115tk.");
				System.out.println("Chicken Bhuna Khecuri (with agg + kabab ) full 255tk,  half 140tk.");
				System.out.println("");
				break;
				
				
			case 5:
				System.out.println("");
				System.out.println("Mutton Bhuna Khecuri full 230tk,  half 115tk.");
				System.out.println("Mutton Bhuna Khecuri (with kabab) full 245tk,  half 140tk.");
				System.out.println("Mutton Bhuna Khecuri (with agg) full 240tk,  half 115tk.");
				System.out.println("Mutton Bhuna Khecuri (with agg + kabab ) full 235tk,  half 120tk.");
				System.out.println("");
				break;
				
			
			case 6:
				System.out.println("");
				System.out.println("Mutton Tehari full 255tk,  half 140tk.");
				System.out.println("");
				break;
				
				
			case 7:
				System.out.println("");
				System.out.println("Plain rice full 25tk,  half 15tk.");
				System.out.println("");
				break;
				
			case 8:
				System.out.println("");
				System.out.println("Pabda fish full 80tk,  half 50tk.");
				System.out.println("");
				break;
			default :
				System.out.println("");
				System.out.println("Menu should not match. Thank You.");
				System.exit(0);
				break;
				
				
		}
		
		
	}
	
}