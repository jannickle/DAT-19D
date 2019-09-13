public class Pizza{
  private String name;
  private double price;

  public Pizza(/*String name, int price*/) {
      
  } 
  public Pizza(String createName, double createPrice){
   name = createName;
   price = createPrice;
  
  }
  public void setName(String newName){
   name = newName;
  }
  public String getName(){
   return name;
  }
  public void setPrice(double newPrice){
  price = newPrice;
  }
  public double getPrice(){
  return price;
  }
  }
