public class MyPizzaApp{

   public static void main(String[] args)
   {   
   Pizza p1 = new Pizza();
   p1.setName("Magarita");
   p1.setPrice(69);
         System.out.println("1st Pizza created...");
         String name = p1.getName();
         double price = p1.getPrice();
         System.out.println(name);
         System.out.println(price+",-");
         
         Pizza p2 = new Pizza("Napoli",70);
   p2.setName("Napoli");
   p2.setPrice(71);
         System.out.println("2st Pizza created...");
         String name2 = p2.getName();
         double price2 = p2.getPrice();
         System.out.println(name2);
         System.out.println(price2+",-");

         
         //Pizza p2 = new Pizza("Napoli");
   }
}