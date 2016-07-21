/*
 * Java Programming (SDEV 200) 
 * Student: Enrique Marrufo
 * Date: Jul 19, 2016
 * Description: Group Programming Assignment - Italian Restaurant Ordering Program
 *
 */
package irop;


public abstract class Bread extends MenuItem {

    public enum BreadType{
        BreadSticks,
        CheesyBread,   
        GarlicCheesyBread
    }
    
    private BreadType breadItem;
    private double price;
    private String description;
    private String name;
    
    public Bread(){
    }
    
    public Bread(BreadType breadItem){
         this.breadItem = breadItem;
    }
    
    public BreadType getBreadItem() {
        return breadItem;
    }
    
 
    @Override
    public double getPrice() {
        
        switch(this.breadItem) {
            case BreadSticks:
                    price = 3.99;
                    break;
            case CheesyBread:
                    price = 4.99;
                    break;         
            case GarlicCheesyBread:
                    price = 5.99;
                    break;        
            default:
                    break;
        }
        return price;
    }
    
     public String getName() {
         
        String s = breadItem.name();
        String[] r = s.split("(?=\\p{Upper})");
        name = r[0] + " " + r[1]; 
        
        return name;
    }
    
    @Override
    public String getDescription() {
        switch(this.breadItem) {
            case BreadSticks:
                    description = "Traditional bread sticks, served with "
                            + "garlic butter dipping sauce.";
                    break;
            case CheesyBread:
                    description = "Thick cut flat bread smothered with fresh"
                            + " mozzarella cheese.";
                    break;         
            case GarlicCheesyBread:
                    description = "Thick cut flat bread topped with fresh "
                            + "roasted ground garlic salt "
                            + "smothered with fresh mozzarella cheese.";
                    break;        
            default:
                    break;
        } 
        return description;
    }
    
    @Override
    public String toString() {
        return "Menu Item = " + name + ", " + "'" + description + "'" + 
                " Price = " + "$" + price;
    }

    /*public static void main(String[] args) {
        Bread myBread = new Bread(){};
        
        // Setting all variables
        myBread.setBreadItem(BreadType.BreadSticks);
        
        // Getting all variables values
        System.out.println(myBread.getBreadItem());
        System.out.println(myBread.getName());
        System.out.println("$" + myBread.getPrice());
        System.out.println(myBread.getDescription());
        
        // Displaying toString
        System.out.println(myBread.toString());
    }// Main*/
    
}// Bread
