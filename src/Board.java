
public class Board {

	Shape [] sh = new Shape [4];
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * ����� ��������� ������ Shape �� ����� Board
	 * @param a - �������� �������� - ������ Shape
	 * ����� ���������, ������ �� "������" ������� - ���� ������, ��������� � ���������
	 * ����� ����� ���������, ����� �� ������, ���� ��, �� ��������� �� �������� Shape � ��������� ������ � ������� return
	 * ��� ������� �������� ������ �����, ��� ��������, ����� ������ ��������������.
	 */
	public void addShape (Shape a){
			
		for (int i = 0; i < sh.length; i++) {
				if(sh[i] != null){
					continue;
				}
				if (sh[i]==null)
					sh[i] = a;
				return;

			}

		System.out.println("��� �����. ����� ��� ��������� ���������");
		
	}
	
	/**
	 * ����� ������� ������ Shape �� ����� Board
	 * @param a - �������� �������� - ������ Shape
	 * ����� ��������� ������ ������ ������� �� null, � ������� ������ ����:
	 * �������������� ������ �������� ���� �� ������, ��� � ��������� ������, 
	 * ���������� �������������� � ��������� ������ ���������, ��. ������ diffShape � diffPoint
	 */
	
	public void delShape (Shape a){
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null && sh[i].getClass().equals(a.getClass())   && (sh[i]).diffShape(a)==true ){
				sh[i] = null;
			}
		}
		
	}
	
	/**
	 * ����� ���������� ���������� ����� Board
	 * @return - ���������� ������ �������� Shape
	 */
	
	public Shape [] viewBoard(){
		return sh;
		
	}
	
	
	public boolean isContains(Shape a){
		boolean b = false;
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null && sh[i].getClass().equals(a.getClass())   && (sh[i]).diffShape(a)==true ){
				b = true;
			}
		}
		return b;
		
	}
	
	/**
	 * ����� ������� ������� ���� ����� �� �����
	 * @return
	 */
	
	public double getAreFull(){
		double areFull = 0;
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null){
				areFull = areFull + sh[i].getArea(); 
			}
		}
		return areFull;
		
	}
	
}

