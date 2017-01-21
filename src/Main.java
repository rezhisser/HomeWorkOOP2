import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point();
		p1.setX(0);
		p1.setY(0);
		Point p2 = new Point();
		p2.setX(5);
		p2.setY(0);
		Point p3 = new Point();
		p3.setX(5);
		p3.setY(5);
		Point p4 = new Point();
		p4.setX(0);
		p4.setY(5);
		Point p5 = new Point();
		p5.setX(0);
		p5.setY(0);
		
		Triangle tr = new Triangle(p1, p2, p3);
		if(tr.isTriangle() == true){
			System.out.println("Area Triangle = " + tr.getArea());
			System.out.println(tr.toString());
		}
		else System.out.println("Shape is not Triangle");
		
		Triangle tr2 = new Triangle(p2, p3, p4);
		if(tr2.isTriangle() == true){
			System.out.println("Area Triangle = " + tr2.getArea());
			System.out.println(tr2.toString());
		}
		else System.out.println("Shape is not Triangle");
		
		Triangle tr3 = new Triangle(p1, p2, p3);
		
		
		
		Circle cr = new Circle(p1,p2);
		System.out.println("Area Circle = " + cr.getArea());
		System.out.println(cr.toString());
		
		Square sq = new Square(p1,p2,p3,p4);
		
		if (sq.isSquare() == true){
			System.out.println("Area Square = " + sq.getArea());
			System.out.println(sq.toString());
		}
		else System.out.println("Shape is not Square или введите координаты последовательно");
		
		Board brd = new Board();
		brd.addShape(tr);
		brd.addShape(tr2);
	//	brd.addShape(cr);
	//	brd.addShape(sq);
	//	brd.addShape(tr);
		System.out.println("! - " + Arrays.toString(brd.viewBoard()));
		
		brd.delShape(tr);
		System.out.println("!! - " + Arrays.toString(brd.viewBoard()));
		
		System.out.println(brd.isContains(sq));
		
		System.out.println(brd.getAreFull());
		
		System.out.println(p1.getX() + " " + p1.getY());
		System.out.println(p3.getX() + " " + p3.getY());
		
		System.out.println(p1.diffPoint(p5));
		

	}

}
