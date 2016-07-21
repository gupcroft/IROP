/* Course/Sec: SDEV200/00C - Java Programming
   Instructor: Kris Roberts 
   Session   : 12
   Assignment: Group Programming Assignment - Italian Restaurant Ordering Program
   Student   : Mike Dumm
   Date      : 7/17/2016
  
  Purpose   : "MenuItem" is an abstract method for the Italian Restaurant Ordering
              Program.  Pizza, Sandwich and Appetizers will be derived from this class.
              
              
  Modification log: 
  07/17/16 - Class initial coding.
  07/18/16 - Removed variable definition of price and all references
  07/19/16 - Removed variable definition of description and all references
  07/19/16 - changed toString to be abstract.            
                
*/


public abstract class MenuItem {
  private String itemName = " ";
  

  /** Construct a default geometric object */
  protected MenuItem() {
  }

  /** Construct a MenuItem object with Item name, Description and price */
  protected MenuItem(String name) {
    itemName = name;  }

  /** Return Item Name */
  public String getItemName() {
    return itemName;
  }

  /** Set Item Name */
  public void setItemName(String name) {
    this.itemName = name;
  }

  /** toString describing menu item */
  //** abstract methot toStringe
  public abstract String toString();

  /** Abstract method getDescription */
  public abstract String getDescription();
  
  /** Abstract method getPrice */
  public abstract double getPrice();

 
}