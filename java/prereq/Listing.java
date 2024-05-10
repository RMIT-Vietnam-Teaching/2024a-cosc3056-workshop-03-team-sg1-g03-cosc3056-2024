package prereq;

public class Listing {
  
   private String title;
   private double price;
   private String description;
   

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   
   public String getTitle() {
      return title;
   }
   public double getPrice() {
      return price;
   }
   public void setPrice(int price) {
      this.price = price;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   
   public void printInfo() {
      // TODO: Complete this to print out the information of the Listing
      System.out.println("Item: " + title);
      System.out.println("\tPrice: " + price);
   }

   public void setTitle(String title) {
      this.title = title;
   }
   public void setPrice(double price) {
      this.price = price;
   }
}