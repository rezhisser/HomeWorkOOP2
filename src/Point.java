
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
	 * Преобразовывает точку в двухмерный массив
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
	 * Сравнение точек по координатам
	 * @param a
	 * @return - возвращает true, если координаты точек одинаковые;
	 * и false, если координаты точек НЕ одинаковые
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
	 * методы нужны определения направления лини для обсчета выпуклого многогольника
правила
p1 =первая точка
0. Если p1X = p2X и p1Y = p2Y - не фигура
1. Если p1X = p2X и p1Y > p2Y - вертикальная линиия вниз
2. Если p1X = p2X и p1Y < p2Y - вертикальная линиия вверх
3. Если p1X > p2X и p1Y = p2Y - горизонтальная линия налево
4. Если p1X > p2X и p1Y > p2Y - линия вниз налево
5. Если p1X > p2X и p1Y < p2Y - линия вверх налево
6. Если p1X < p2X и p1Y = p2Y - горизонтальная линия направо
7. Если p1X < p2X и p1Y > p2Y - линия вниз направо
8. Если p1X < p2X и p1Y < p2Y - линия вверх направо
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
