public class Dimension {
    private int feet;
    private int inches;
    Dimension obj=new Dimension(25);
    
    public Dimension(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
    }
    
    public int getFeet() {
       
       if(inches>0)
       {
        feet=inches/12;
        return feet;
       }
       else 
        return -1;
    }
    
    public int getInches() {
        if(inches>0){
           int inch;
        inch=inches%12;
        return inch; }
    else 
        return -1;
    }    
}