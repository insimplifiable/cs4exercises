import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
      this.name = name;
      earnings = 0;
      itemList = new ArrayList();
      storeList.add(this);
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
      if(index < itemList.size()) {
          this.earnings += itemList.get(index).getCost();
          System.out.printf("%s has been sold for %.2f.%n", itemList.get(index).getName(), itemList.get(index).getCost());
      }
      else {
          System.out.println("There are only " + itemList.size() + " items in " + this.getName() + ".");
      }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
      for (Item i : itemList) {
          if (name.equals(i.getName())) {
              this.earnings += i.getCost();
              System.out.printf("%s has been sold for %.2f.%n", i.getName(), i.getCost());
              return;
          }
      }
      System.out.println(this.getName() + " does not sell the item you have inputted.");
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
      if(itemList.contains(i)){
          for(Item item : itemList) {
              if(i == item) {
                  earnings += item.getCost();
                  System.out.printf("%s has been sold for %.2f.%n", i.getName(), i.getCost());
              }
          }
      }
      else {
          System.out.printf("%s does not sell %s.%n", this.getName(), i.getName());
      }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
      itemList.add(i);
    // add Item i to store's itemList
  }
  public void filterType(String type){
      System.out.printf("These are all items with type %s:%n", type);
      for (Item i : itemList) {
          if (type.equals(i.getType()))
              System.out.printf("Name: %s, Type: %s, Cost: %.2f%n", i.getName(), i.getType(), i.getCost());
      }
      System.out.println("\n");
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
      System.out.printf("These are all items cheaper than %.2f:%n", maxCost);
      for (Item i : itemList) {
          if (maxCost >= i.getCost())
              System.out.printf("Name: %s, Type: %s, Cost: %.2f%n", i.getName(), i.getType(), i.getCost());
      }
      System.out.println("\n");
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
      System.out.printf("These are all items more expensive than %.2f:%n", minCost);
      for (Item i : itemList) {
          if (minCost <= i.getCost())
              System.out.printf("Name: %s, Type: %s, Cost: %.2f%n", i.getName(), i.getType(), i.getCost());
      }
      System.out.println("\n");
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
