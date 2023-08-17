public class midterm_2 {
    public static void main(String[]args) {
        things p1 =new things(null, 0)
        p1.ShowDetails();

    }
}

class things {
    private String name;
    private double Prince;
    
    things() {
        this.name = "chair";
        this.Prince = 500.0;
    }
    things(String Newname){
          this.name = Newname;
    }
    things(String name,double Prince){
         this.name = Newname;
          this.Prince = NewPrince;
    }
    public void ShowDetails(){
         System.out.println("name : " + this.name);
    System.out.println("Prince  : " + this.Prince);
    }

}
public String getName(){
    System.out.println("Chair");
}
public String setName(String name){
    System.out.println("Chair");
}
public String getPrice(){
    System.out.println("500.0");
}
public String setPrice(double Prince){
    System.out.println("500.0");
}

class Electronics extends things{
    private String Name;
    private double Prince;
    private String brand;
    private String model;

public String getName(){
    System.out.println("Television");
}
public String setName(String name){
    System.out.println("Television");
}
public String getPrice(){
    System.out.println("20000.0");
}
public String setPrice(double Prince){
    System.out.println("20000.0");
}
public String getBrand(){
    System.out.println("Samsung");
}
public String setBrand(String brand){
    System.out.println("Samsung");
}
public String getmodel(){
    System.out.println("Neo QLED");
}
public String setmodel(String model){
    System.out.println("Neo QLED");
}
}
class Electronics2 extends things{
    private String Name;
    private double Prince;
    private String brand;
    private String model;


public String getName(){
    System.out.println("Iphone");
}
public String setName(String name){
    System.out.println("Iphone");
}
public String getPrice(){
    System.out.println("40000.0");
}
public String setPrice(double Prince){
    System.out.println("40000.0");
}
public String getBrand(){
    System.out.println("Apple");
}
public String setBrand(String Brand){
    System.out.println("Apple");
}
public String getmodel(){
    System.out.println("Iphone 99");
}
public String setmodel(String model){
    System.out.println("Iphone 99");
}
}
class Smartphone extends things{
    private String OperatingSystem;

public String getOperatingSystem(){
    System.out.println("ios");
}
public String setOperatingSystem(String OperatingSystem){
    System.out.println("ios");
}
class Book extends things{
    private String Name;
    private double Prince;
    private String author;
    private int pages;

public String getName(){
    System.out.println("OOP Programming");
}
public String setName(String name){
    System.out.println("OOP Programming");
}
public String getPrice(){
    System.out.println("250.0");
}
public String setPrice(double Prince){
    System.out.println("250.0");
}
public String getAuthor(){
    System.out.println("John Doe");
}
public String setAuthor(String author){
    System.out.println("John Doe");
}
public int getPages(){
    System.out.println("300");
}
public int setPages(int pages){
    System.out.println("300");
}
}
}







