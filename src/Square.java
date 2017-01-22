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
	 * ����� ����������� ��������� ����� ����� �������
	 * @param a
	 * @param b
	 * @return
	 */
	
	private double getSize(Point a, Point b){
		return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY() - b.getY(),2));
		
		
	}

	/**
	 * ����� ��������� ������� ��������
	 */
	
	@Override
	public double getArea() {
		double ab = getSize(a,b);
		double s = ab*ab;
		return s;
	}
	
	/**
	 * ����� ��������� �������� ��������
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
	 * ����� ����������, �������� �� ������ ��������� 
	 * @return - ���������� true - ���� ��, � false - ���� ���
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
	 * ����� ���������� ���������� ����� ���� �������� Square 
	 * ������� ������ ��������, � ������� �������� ������ Point, �� ������� ������� ������� Square
	 * �������� �������� - ������ Shape, ������� �������� � ������� Square
	 * ���������� ���������� ���� �������� Square � ������� ������ diffPoint
	 * ���������� true - ���� ���������� �����
	 * ���������� false - ���� ���������� �� �����
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
	

	// Arrays.toString(getA().toStr()) - ������� ���������� ����� � ���� ���������� �������

	@Override
	public String toString() {
		return "Square [getA()=" + Arrays.toString(getA().toStr()) + ", getB()=" + Arrays.toString(getB().toStr()) + ", getC()=" + Arrays.toString(getC().toStr()) + ", getD()=" + Arrays.toString(getD().toStr())
				+ ", getSize(a,b)=" + getSize(a,b) + ", getSize(b,c)=" + getSize(b,c) + ", getSize(c,d)" + getSize(c,d) + ", getSize(d,a)="
				+ getSize(d,a) + ", getArea()=" + getArea() + ", getPerimetr()=" + getPerimetr() + "]";
	}



	
	
	

}
