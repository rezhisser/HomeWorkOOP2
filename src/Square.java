import java.util.Arrays;

public class Square extends Shape{
	
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	
	
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Square(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
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


	public Point getC() {
		return c;
	}


	public void setC(Point c) {
		this.c = c;
	}


	public Point getD() {
		return d;
	}


	public void setD(Point d) {
		this.d = d;
	}
	
	/**
	 * Метод расчитывает растояние между двумя точками
	 * @param a
	 * @param b
	 * @return
	 */
	
	private double getSize(Point a, Point b){
		return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY() - b.getY(),2));
		
		
	}

	/**
	 * Метод вычисляет площадь квадрата
	 */
	
	@Override
	public double getArea() {
		double ab = getSize(a,b);
		double s = ab*ab;
		return s;
	}
	
	/**
	 * Метод вычисляет периметр квадрата
	 */

	@Override
	double getPerimetr() {
		double ab = getSize(a,b);
		double bc = getSize(b,c);
		double cd = getSize(c,d);
		double da = getSize(d,a);
		double p = ab+bc+cd+da;
		
		return p;
	}
	
	
	/**
	 * Метод определяет, является ли фигура квадратом 
	 * @return - возвращает true - если ДА, и false - если НЕТ
	 */
	public boolean isSquare(){
		double ab = getSize(a,b);
		double bc = getSize(b,c);
		double cd = getSize(c,d);
		double da = getSize(d,a);
		if ((ab > 0 && bc > 0 && cd > 0 && da > 0) & (ab == bc && bc == cd && cd == da && da == ab)){
			return true;
		}
		else return false;
	}
	
	/**
	 * Метод сравнивает координаты точек двух объектов Square 
	 * Создаем массив объектов, в который помещаем объект Point, из которых состоят объекты Square
	 * Входящий параметр - объект Shape, который приводим к объекту Square
	 * Сравниваем координаты двух объектов Square с помощью метода diffPoint
	 * Возвращаем true - если координаты равны
	 * Возвращаем false - если координаты НЕ равны
	 * 
	 */
	
	public boolean diffShape(Shape sh) {
		boolean diff = false;
		Object [] o = new Object [4];
		for (int i = 0; i < o.length; i++) {
			if (sh instanceof Square){
				Square sq = new Square();
				sq = (Square) sh;
			o[0] = sq.getA();
			o[1] = sq.getB();
			o[2] = sq.getC();
			o[3] = sq.getD();
			if( sq.getA().diffPoint(this.getA()) && sq.getB().diffPoint(this.getB()) && sq.getC().diffPoint(this.getC()) && sq.getD().diffPoint(this.getD())){
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
		return "Square [getA()=" + Arrays.toString(getA().toStr()) + ", getB()=" + Arrays.toString(getB().toStr()) + ", getC()=" + Arrays.toString(getC().toStr()) + ", getD()=" + Arrays.toString(getD().toStr())
				+ ", getSize(a,b)=" + getSize(a,b) + ", getSize(b,c)=" + getSize(b,c) + ", getSize(c,d)" + getSize(c,d) + ", getSize(d,a)="
				+ getSize(d,a) + ", getArea()=" + getArea() + ", getPerimetr()=" + getPerimetr() + "]";
	}



	
	
	

}
