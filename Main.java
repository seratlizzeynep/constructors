package constructors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//parametreli constructor
		Car araba = new Car("Toyota", "Corolla", 2020);
		araba.arabaBilgileri();
		
		//varsayilan constructor
		Car araba2 = new Car();
		araba2.arabaBilgileri();
		
	

}
}