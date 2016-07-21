/* Course/Sec: SDEV200/00C - Java Programming
   Instructor: Kris Roberts 
   Session   : 12
   Assignment: Group Programming Assignment - Italian Restaurant Ordering Program
   Student   : Mike Dumm
   Date      : 7/17/2016
  
  Purpose   : "Appetizer" is an abstract method that extends "MenuItem" of the Italian Restaurant Ordering
              Program.  Breads and Wings this class.
              
              
  Modification log: 
  07/19/16 - Class initial coding.
              
                
*/


public abstract class Appetizer extends MenuItem {
   public String apptzrDesc = " ";

  /** Construct a default geometric object */
  protected Appetizer() {
  }

  /** Construct a MenuItem object with Item name, Description and price */
  protected Appetizer( String desc) {
     apptzrDesc = desc;
    
  }

  /** Return Item Name */
  public String getAppetizerDesc() {
    return apptzrDesc;
  }

  /** Set Item Name */
  public void setAppetizerDesc(String desc) {
    this.apptzrDesc = desc;
  }

  /** toString describing menu item */
  @Override
  public String toString() {
    return "Menu Item = " + getItemName() + ", " + apptzrDesc;
  }

  /** Abstract method getDescription */
  public abstract String getType();
  
  /** Abstract method getPrice */
  public abstract Integer getQty();

 
}