
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
	 * ����� ��������� ������ �� �����
	 * @param a - ������
	 * @param b - ����� �� ����� (�� 1 �� 4)
	 */
	
	public void addShape (Shape a, int b){
		b=b-1;		
		if (b >= 0 && b <=3){
		if (sh[b]==null){
					sh[b] = a;
				}
				else System.out.println("������ ����� ��� ������");
		}
		else System.out.println("������� ����� �� 1 �� 4");
	}
	
	/**
	 * ����� ������� ������ Shape �� ����� Board
	 * @param a - �������� �������� - ������ Shape
	 * ����� ��������� ������ ������ ������� �� null, � ������� ������ ���� ����� ������ ����������, ��. ����� isContains()
	 */
	
	public void delShape (Shape a){
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null && isContains(sh[i], a)==true ){
				sh[i] = null;
			}
		}
		
	}
	
	/**
	 * ����� ���������� ��� ������ Shape
	 * ������������ ����� ����� � ����������, �� diffShape
	 * @param a - ������������ ������� Shape
	 * @param b - ������������ ������� Shape
	 * @return - ���������� true - ���� ������ �����, � false - ���� ������ �� �����
	 */
	public boolean isContains(Shape a, Shape b){
		boolean isContains = false;
			if(a.getClass().equals(b.getClass())   && (a).diffShape(b)==true ){
				isContains = true;	
			
		}
		return isContains;
		
	}
	
	/**
	 * ����� ���������� ���������� ����� Board
	 * @return - ���������� ������ �������� Shape
	 */
	
	public Shape [] viewBoard(){
		return sh;
		
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

