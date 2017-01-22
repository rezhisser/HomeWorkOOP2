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
	 * ����� ����������� ������� ������������
	 */
	
	@Override
	public double getArea() {
		double ab = getSize(a,b);
		double bc = getSize(b,c);
		double ca = getSize(c,a);
		double pp = getPerimetr()/2;
		double s = Math.sqrt((pp*(pp-ab)*(pp-bc)*(pp-ca)));
		
		return s;
		
		
	}



	/**
	 * ����� ����������� �������� ������������
	 */
	@Override
	public double getPerimetr() {
		double ab = getSize(a,b);
		double bc = getSize(b,c);
		double ca = getSize(c,a);
		double p = ab+bc+ca;
		
		return p;
		
		
	}
	
	/**
	 * ����� ����������� ��������� ����� ����� �������
	 * @param a
	 * @param b
	 * @return
	 */

	
	private double getSize(Point a, Point b){
		return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY() - b.getY(),2));
		
		
	}

	
	/**
	 * ����� ����������, �������� �� ������ ������������� 
	 * @return - ���������� true - ���� ��, � false - ���� ���
	 */
	public boolean isTriangle (){
		double ab = getSize(a,b);
		double bc = getSize(b,c);
		double ca = getSize(c,a);
		if (ab<(bc+ca) && bc<(ab+ca) && ca<(ab+bc)){
			return true;
		}
		else return false;
	}

	/**
	 * ����� ���������� ���������� ����� ���� �������� Triangle 
	 * ������� ������ ��������, � ������� �������� ������ Point, �� ������� ������� ������� Triangle
	 * �������� �������� - ������ Shape, ������� �������� � ������� Triangle
	 * ���������� ���������� ���� �������� Triangle � ������� ������ diffPoint
	 * ���������� true - ���� ���������� �����
	 * ���������� false - ���� ���������� �� �����
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
	
	// Arrays.toString(getA().toStr()) - ������� ���������� ����� � ���� ���������� �������
	
	@Override
	public String toString() {
		return "Triangle [getA()=" + Arrays.toString(getA().toStr()) + ", getB()=" + Arrays.toString(getB().toStr()) + ", getC()=" + Arrays.toString(getC().toStr()) + ", getArea()=" + getArea()
				+ ", getPerimetr()=" + getPerimetr() + "]";
	}
	
	
}
