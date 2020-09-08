import java.util.Scanner;
public class Observe{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.println("first number");
		int firstnumber = input.nextInt();

		System.out.println("second number");
		int secondnumber = input.nextInt();

		System.out.println("third number");
		int thirdnumber = input.nextInt();

		System.out.println("fourth number");
		int fourthnumber = input.nextInt();

		if(firstnumber > 2){
		System.out.printf("%s %d is coused by stress", firstnumber);
		}
		
		if(secondnumber > 5){
		System.out.printf("%s %d hydrate Properly", secondnumber);	
		}		
		
		if(thirdnumber > 12){
		System.out.printf("%s %d consult a Doctor ", thirdnumber);
		}
		
		if(fourthnumber > 20){
		System.out.printf("%s %d call NCDC for help", fourthnumber);
		}	


	}

}