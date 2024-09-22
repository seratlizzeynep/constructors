package constructors;

public class Car {
	String marka;
    String model;
    int yil;
    
    // parametreli cons. girilen degeri atar
    public Car(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }
    // varsayilan cons. varsayilan degeri atar
    public Car(){
        this.marka = "Bilinmiyor";
        this.model = "Bilinmiyor";
        this.yil = 0;
    }
    
    public void arabaBilgileri() {
    	System.out.println("Marka: " + marka + ", Model: " + model + ", Yıl: " + yil);
    
	}
}
