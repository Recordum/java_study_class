import java.util.Scanner;

import javax.swing.text.BadLocationException;

public class Circle {
	public static void main(String[] args) {
	
	Scanner	scanner = new Scanner(System.in);
	
	GetArea donut = new GetArea();
	GetArea pizza = new GetArea();
	GetArea bagle = new GetArea(1);
	
	System.out.println("반지름을 입력하시오");
	donut.radius = scanner.nextInt();
	pizza.radius = scanner.nextInt();
	donut.calArea();
	pizza.calArea();
	bagle.calArea();
    
	System.out.println(donut.area + ", " + pizza.area + ", " + bagle.area);
	scanner.close();
	
	}
}
	
	
