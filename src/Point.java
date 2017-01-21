
public class Point {

	double x;
	double y;
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
	
	protected double [] toStr (){
		double[] array = new double [2];
		for (int i = 0; i < array.length; i++) {
			array[0] = getX();
			array[1] = getY();
			
		}
		return array;
	}
	protected String toStrTwo (){
		String arr;
		String[] array = new String [2];
		for (int i = 0; i < array.length; i++) {
			array[0] = Double.toString(getX());
			array[1] = Double.toString(getY());
			
		}
		arr = array.toString();
		return arr;
	}
	
	protected boolean diffPoint (Point a){
		boolean diff = false;
		if (this.getX() == a.getX() && this.getY() == a.getY()){
			diff = true;
		}
		else diff = false;
		return diff;
	}
	
	
}
