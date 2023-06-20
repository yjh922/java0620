package use;//컴파일시 use패키지에 넣어라
//수박의 위치를 알려줘야 사용할 수 있다
import fruit.WaterMelon;
class UseMelon {
	public static void main(String[] args){
		WaterMelon wm=new WaterMelon();
		int price=wm.getPrice();
		System.out.println("수박 가격은"+price);
	}
		
}
