import java.util.Arrays;

public class Circle extends Shape {

	private Point a;
	private Point b;
	
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	


	public Point getA() {
		return a;
	}


	public void setA(Point a) {
		this.a = a;
	}


	public Point getB() {
		return b;
	}


	public void setB(Point b) {
		this.b = b;
	}


	/**
	 * Метод вычисляет площадь Круга
	 */
	
	@Override
	public double getArea() {
		double p = getPerimetr();
		double s = (Math.pow(p, 2))/(4*Math.PI);
		return s;
	}
	
	/**
	 * Метод вычисляет периметр круга
	 */
	
	@Override
	double getPerimetr(){
		double p = 2*Math.PI*radius();
		return p;
		
	}
	
	/**
	 * метод вычисляет радиус круга по заданным координатам двух точек
	 * @return
	 */
	private double radius(){
		double ax = a.getX(); //aX
		double bx = b.getX(); //bX
		double ay = a.getY(); //aY
		double by = b.getY(); //bY
		double r = Math.sqrt((ax-bx)*(ax-bx) +(ay-by)*(ay-by));
		
		return r;
		
	}
	
	/**
	 * Метод сравнивает координаты точек двух объектов Circle 
	 * Создаем массив объектов, в который помещаем объект Point, из которых состоят объекты Circle
	 * Входящий параметр - объект Shape, который приводим к объекту Circle
	 * Сравниваем координаты двух объектов Circle с помощью метода diffPoint
	 * Возвращаем true - если координаты равны
	 * Возвращаем false - если координаты НЕ равны
	 * 
	 */
	
	public boolean diffShape(Shape sh) {
		boolean diff = false;
		Object [] o = new Object [2];
		for (int i = 0; i < o.length; i++) {
			if (sh instanceof Circle){
				Circle cl = new Circle();
				cl = (Circle) sh;
			o[0] = cl.getA();
			o[1] = cl.getB();
			if( cl.getA().diffPoint(this.getA()) && cl.getB().diffPoint(this.getB())){
				diff = true;
			}
			else diff = false;
		}
		}
		return diff;
	}
	
	
	 // Arrays.toString(getA().toStr()) - выводит координаты точек в виде двумерного массива

	@Override
	public String toString() {
		return "Circle [getA()=" + Arrays.toString(getA().toStr()) + ", getB()=" + Arrays.toString(getB().toStr()) + ", getArea()=" + getArea() + ", getPerimetr()="
				+ getPerimetr() + ", radius()=" + radius() + "]";
	}


	
	



	
	

}
