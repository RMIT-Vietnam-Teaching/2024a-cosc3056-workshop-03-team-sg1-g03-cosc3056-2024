package prereq;

public class Listing {
   // These are examples properties
   private String title;
   private double price;
   private String description;
   // TODO: Add more properties

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   // TODO: Add your setter/getter here
   public String getTitle() {
      return title;
   }
   public double getPrice() {
      return price;
   }
   public void setPrice(int price) {
      this.price = price;
   }
   //public void setTitle(String title) {
   //   this.title = title;
   //}
   
   public void printInfo() {
      // TODO: Complete this to print out the information of the Listing
      System.out.println("Item: " + title);
      System.out.println("\tPrice: " + price);
   }
}