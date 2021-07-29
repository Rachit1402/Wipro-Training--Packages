package Automobile;
import java.util.*;
public class compartment{
	private int height;
	private int width;
	private int breadth;
	Scanner scan = new Scanner(System.in);
	public compartment(int height, int breadth, int width) {
		super();
		System.out.println("Enter the height: ");
		this.height = scan.nextInt();
		System.out.println("Enter the breadth: ");
		this.breadth = scan.nextInt();
		System.out.println("Enter the width: ");
		this.width = scan.nextInt();
	}
	@Override
	public String toString(){
		return "Compartment[height: "+height+" width: "+width+" breadth: "+breadth+"]";
	}
}