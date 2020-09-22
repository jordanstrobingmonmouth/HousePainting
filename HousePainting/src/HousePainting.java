import java.util.Scanner;
public class HousePainting {
	
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		
		//Get building length from user
		System.out.println("Please enter building length: ");
		int buildinglength = in.nextInt();
		
		//Get building width from user
		System.out.println("Please enter building width: ");
		int buildingwidth = in.nextInt();
		
		//Get building height from user
		System.out.println("Please enter building height: ");
		int buildingheight = in.nextInt();
		
		//Get the number of windows from the user
		System.out.println("Please enter the number of windows: ");
		int numwindows = in.nextInt();
		
		//Get the length of the windows from the user
		System.out.println("Please enter the length of the window(s): ");
		int windowlength = in.nextInt();
		
		//Get the width of the windows from the user
		System.out.println("Please enter the width of the window(s): ");
		int windowwidth = in.nextInt();
		
		//Get the number of doors from the user
		System.out.println("Please enter the number of doors: ");
		int numdoors = in.nextInt();
		
		//Get the length of doors from the user
		System.out.println("Please enter the length of the door(s): ");
		int doorlength = in.nextInt();
		
		//Get the width of doors from the user
		System.out.println("Please enter the width of the door(s): ");
		int doorwidth = in.nextInt();

		//Ask the user how much the paint will cost per square foot
		System.out.println("How much will the paint cost per square foot? (in dollars) ");
		double costpersqft = in.nextInt();
		
		//Computations to find the area of the doors and windows
		int doorsqft = doorlength*doorwidth;
		int windowsqft = windowlength*windowwidth;
		
		//Computations to find the area of all the building sides (peak and normal)
		int buildingnormalside = buildinglength*buildingwidth;
		double buildingpeakside = buildinglength*buildingwidth + (.5*(buildinglength*(buildingheight-buildingwidth)));
		
		//Computation to find the total square footage of the building and display that number to the user
		double totalsquarefootage = (buildingnormalside * 2) + (buildingpeakside * 2) - (windowsqft * numwindows) - (doorsqft * numdoors);
		System.out.println("The total square footage is "+totalsquarefootage);
		
		//Computation of how much the house painting will cost and display  that number to the user
		double paintingcost = costpersqft * totalsquarefootage;
		System.out.println("The cost estimate to paint this house is " +paintingcost);
	
	}

}
