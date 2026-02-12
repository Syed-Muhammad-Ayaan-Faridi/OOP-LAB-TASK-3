import java.util.Scanner;

class Item{
    public String itemName;
    public int itemID;
    private double price;
    private int stock;

    public void setPrice(double price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void deductStock(int purchased){
        this.stock -=  purchased;
    }

}
public class Task2 {
    public static void main(String[] args) {
        Item Item1 = new Item();
        Item1.itemName = "Lays";
        Item1.itemID = 1;
        Item1.setPrice(100);
        Item1.setStock(50);
        
        Item Item2 = new Item();
        Item2.itemName = "Chocolate Cake";
        Item2.itemID = 2;
        Item2.setPrice(1000);
        Item2.setStock(50);
        
        Item Item3 = new Item();
        Item3.itemName = "Cookies";
        Item3.itemID = 3;
        Item3.setPrice(600);
        Item3.setStock(50);

        //Display the Items
        System.out.println("Displaying the Items");
        System.out.println(Item1.itemID+"->"+Item1.itemName);
        System.out.println(Item2.itemID+"->"+Item2.itemName);
        System.out.println(Item3.itemID+"->"+Item3.itemName);

        //Searching
        Item Selected = new Item();
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an ItemID to Purchase: ");
        int itemPurchase = inp.nextInt(); 
        if (itemPurchase == Item1.itemID) {
            Selected = Item1;
        } else if (itemPurchase == Item2.itemID) {
            Selected = Item2;
        } else if (itemPurchase == Item3.itemID) {
            Selected = Item3;
        } else {
            System.out.println("Invalid item ID");
        }
        System.out.print("Price of "+Selected.itemName+" is "+Selected.getPrice());

        //Enter the Quantity of Item
        System.out.print("Enter the Quantity: ");
        int Quantity = inp.nextInt();
        
        //Check Stock
        if (Quantity > Selected.getStock()) {
            System.out.println("Quantity exceeded...");
        } else {
            //Calculate Total Bill
            double Bill = Quantity*Selected.getPrice();
            Selected.deductStock(Quantity);

            System.out.println("You have purchased "+Quantity+" "+Selected.itemName+" for "+Bill);
        }
    
        inp.close();
    }
}
