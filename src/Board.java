
public class Board {

	Shape [] sh = new Shape [4];
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public void addShape (Shape a){
			
		for (int i = 0; i < sh.length; i++) {
				if(sh[i] != null){
					continue;
				}
//				if (isContains(a) == true){
//					System.out.println("Такая фигура уже существует");
//					break;
//				}
				if (sh[i]==null)
					sh[i] = a;
			break;
			}
			if(isFull() == true){
				System.out.println("Нет места. Доска уже полностью заполнена");
			}
		
	}
	
	public void delShape (Shape a){
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null && sh[i].getClass().equals(a.getClass())   && (sh[i]).diffShape(a)==true ){
				sh[i] = null;
			}
		}
		
	}
	
	public Shape [] viewBoard(){
		return sh;
		
	}
	
	private boolean isFull(){
		boolean b = false;
		for (int i = 0; i < sh.length; i++) {
			if (sh[i] !=null){
				b = true;
			}
			else b = false;
		
	}
		return b;
	}
	
	public boolean isContains(Shape a){
		boolean b = false;
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null && sh[i].getClass().equals(a.getClass())== true){
				b = true;
			}
		}
		return b;
		
	}
	
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

