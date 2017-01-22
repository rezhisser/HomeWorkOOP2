
public class Board {

	Shape [] sh = new Shape [4];
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * Метод добавляет фигуру Shape на доску Board
	 * @param a - входящий параметр - объект Shape
	 * Метод проверяет, занята ли "ячейка" массива - если занята, переходит к следующей
	 * потом метод проверяет, пуста ли ячейка, если да, то заполняет ее объектом Shape и завершает работу с помощью return
	 * При попытке добавить больше фигур, чем возможно, метод выдает предупреждение.
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

		System.out.println("Нет места. Доска уже полностью заполнена");
		
	}
	
	/**
	 * Метод добавляет фигуру на доску
	 * @param a - фигура
	 * @param b - место на доске (от 1 до 4)
	 */
	
	public void addShape (Shape a, int b){
		b=b-1;		
		if (b >= 0 && b <=3){
		if (sh[b]==null){
					sh[b] = a;
				}
				else System.out.println("Данное место уже занято");
		}
		else System.out.println("Введите число от 1 до 4");
	}
	
	/**
	 * Метод удаляет фигуру Shape из доски Board
	 * @param a - входящий параметр - объект Shape
	 * Метод проверяет каждую ячейку массива на null, и удаляет фигуру если такая фигура существует, См. метод isContains()
	 */
	
	public void delShape (Shape a){
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null && isContains(sh[i], a)==true ){
				sh[i] = null;
			}
		}
		
	}
	
	/**
	 * Метод сравнивает две фигуры Shape
	 * сравнивается класс фигур и координаты, см diffShape
	 * @param a - сравниваемые объекты Shape
	 * @param b - сравниваемые объекты Shape
	 * @return - возвращает true - если фигуры равны, и false - если фигуры НЕ равны
	 */
	public boolean isContains(Shape a, Shape b){
		boolean isContains = false;
			if(a.getClass().equals(b.getClass())   && (a).diffShape(b)==true ){
				isContains = true;	
			
		}
		return isContains;
		
	}
	
	/**
	 * Метод показывает содержимое доски Board
	 * @return - возвращает массив объектов Shape
	 */
	
	public Shape [] viewBoard(){
		return sh;
		
	}
	
	/**
	 * Метод считает площадь всех фигур на доске
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

