import java.util.Arrays;

public class Triangle extends Shape{

	private Point a;
	private Point b;
	private Point c;
	
	

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	



	public Point getA() {
		return a;
	}



	public Point getB() {
		return b;
	}



	public Point getC() {
		return c;
	}



	/**
	 * Метод расчитывает площадь треугольника
	 */
	
	@Override
	public double getArea() {
		double ab = abSize();
		double bc = bcSize();
		double ca = caSize();
		double pp = getPerimetr()/2;
		double s = Math.sqrt((pp*(pp-ab)*(pp-bc)*(pp-ca)));
		
		return s;
		
		
	}
	
	/**
	 * Метод расчитывает периметр треугольника
	 */
	@Override
	public double getPerimetr() {
		double ab = abSize();
		double bc = bcSize();
		double ca = caSize();
		double p = ab+bc+ca;
		
		return p;
		
		
	}
	
	/**
	 * Метод вычисляет длинну стороны ab треугольника 
	 * @return
	 */
	private double abSize(){
		double ax = a.getX(); //aX
		double bx = b.getX(); //bX
		double ay = a.getY(); //aY
		double by = b.getY(); //bY
		double ab = Math.sqrt((ax-bx)*(ax-bx) +(ay-by)*(ay-by));
		
		return ab;
		
	}
	/**
	 * Метод вычисляет длинну стороны bc треугольника 
	 * @return
	 */
	private double bcSize(){
		double bx = b.getX(); //bX
		double cx = c.getX(); //cX
		double by = b.getY(); //bY
		double cy = c.getY(); //cY
		double bc = Math.sqrt((bx-cx)*(bx-cx) +(by-cy)*(by-cy));
		
		return bc;
		
	}
	/**
	 * Метод вычисляет длинну стороны ca треугольника 
	 * @return
	 */
	private double caSize(){
		double cx = c.getX(); //cX
		double ax = a.getX(); //aX
		double cy = c.getY(); //cY
		double ay = a.getY(); //aY
		double ca = Math.sqrt((cx-ax)*(cx-ax) +(cy-ay)*(cy-ay));
		
		return ca;
		
	}
	
	/**
	 * Метод определяет, является ли фигура треугольником 
	 * @return - возвращает true - если ДА, и false - если НЕТ
	 */
	public boolean isTriangle (){
		double ab = abSize();
		double bc = bcSize();
		double ca = caSize();
		if (ab<(bc+ca) && bc<(ab+ca) && ca<(ab+bc)){
			return true;
		}
		else return false;
	}

	/**
	 * Метод сравнивает координаты точек двух объектов Triangle 
	 * Создаем массив объектов, в который помещаем объект Point, из которых состоят объекты Triangle
	 * Входящий параметр - объект Shape, который приводим к объекту Triangle
	 * Сравниваем координаты двух объектов Triangle с помощью метода diffPoint
	 * Возвращаем true - если координаты равны
	 * Возвращаем false - если координаты НЕ равны
	 * 
	 */
	
	public boolean diffShape(Shape sh) {
		
		boolean diff = false;
		Object [] o = new Object [3];
		for (int i = 0; i < o.length; i++) {
			if (sh instanceof Triangle){
			Triangle tr = new Triangle();
			tr = (Triangle) sh;
			o[0] = tr.getA();
			o[1] = tr.getB();
			o[2] = tr.getC();
			if( tr.getA().diffPoint(this.getA()) && tr.getB().diffPoint(this.getB()) && tr.getC().diffPoint(this.getC())){
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
		return "Triangle [getA()=" + Arrays.toString(getA().toStr()) + ", getB()=" + Arrays.toString(getB().toStr()) + ", getC()=" + Arrays.toString(getC().toStr()) + ", getArea()=" + getArea()
				+ ", getPerimetr()=" + getPerimetr() + "]";
	}
	
	
}
