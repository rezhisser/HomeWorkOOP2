
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
	 * Метод удаляет фигуру Shape из доски Board
	 * @param a - входящий параметр - объект Shape
	 * Метод проверяет каждую ячейку массива на null, и удаляет фигуру если:
	 * обрабатываемая фигура является того же класса, что и удаляемая фигура, 
	 * координаты обрабатываемой и удаляемой фигуры одинковые, См. методы diffShape и diffPoint
	 */
	
	public void delShape (Shape a){
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null && sh[i].getClass().equals(a.getClass())   && (sh[i]).diffShape(a)==true ){
				sh[i] = null;
			}
		}
		
	}
	
	/**
	 * Метод показывает содержимое доски Board
	 * @return - возвращает массив объектов Shape
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

