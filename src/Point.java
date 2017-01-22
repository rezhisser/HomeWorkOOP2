
public class Point {

	private double x;
	private double y;
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	
	/**
	 * ��������������� ����� � ���������� ������
	 * @return
	 */
	protected double [] toStr (){
		double[] array = new double [2];
		for (int i = 0; i < array.length; i++) {
			array[0] = getX();
			array[1] = getY();
			
		}
		return array;
	}
	
	/**
	 * ��������� ����� �� �����������
	 * @param a
	 * @return - ���������� true, ���� ���������� ����� ����������;
	 * � false, ���� ���������� ����� �� ����������
	 */
	
	protected boolean diffPoint (Point a){
		boolean diff = false;
		if (this.getX() == a.getX() && this.getY() == a.getY()){
			diff = true;
		}
		else diff = false;
		return diff;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	/*
	 * ������ ����� ����������� ����������� ���� ��� ������� ��������� �������������
�������
p1 =������ �����
0. ���� p1X = p2X � p1Y = p2Y - �� ������
1. ���� p1X = p2X � p1Y > p2Y - ������������ ������ ����
2. ���� p1X = p2X � p1Y < p2Y - ������������ ������ �����
3. ���� p1X > p2X � p1Y = p2Y - �������������� ����� ������
4. ���� p1X > p2X � p1Y > p2Y - ����� ���� ������
5. ���� p1X > p2X � p1Y < p2Y - ����� ����� ������
6. ���� p1X < p2X � p1Y = p2Y - �������������� ����� �������
7. ���� p1X < p2X � p1Y > p2Y - ����� ���� �������
8. ���� p1X < p2X � p1Y < p2Y - ����� ����� �������
	 * 
	protected int diffPointX (Point a){
		String st1 = Double.toString(this.getX());
		String st2 = Double.toString(a.getX());
		
		return st1.compareTo(st2);
	}
	
	protected int diffPointY (Point a){
		String st1 = Double.toString(this.getY());
		String st2 = Double.toString(a.getY());
		
		return st1.compareTo(st2);
	}
	*/
	
}
