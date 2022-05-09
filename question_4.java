public class Nokta {
 
    private double x, y; 
    
    public Nokta() { 
    
    this.x = 0;
    this.y = 0;
    }
    
    public Nokta(double x, double y) {
    
    this.x = x;
    this.y = y;
    }
    
    public Nokta(Nokta kopya) {
    
    this.x = kopya.getX();
    this.y = kopya.getY();
    }
    
    public double getX() {
    return x;
    }
    
    public void setX(double x) {
    this.x = x;
    }
    public double getY() {
    return y;
    }
    public void setY(double y) {
    this.y = y;
    }
    
    public double farkiniDondur(Nokta diger) {
    
    double xD = Math.pow((this.getX() - diger.getX()), 2);
    double yD = Math.pow((this.getY() - diger.getY()), 2);
    double oklid = Math.sqrt(xD + yD);
    return oklid;
    }
    
    
    @Override
    public String toString() {
    String str = "Nokta(" + x + "," + y + ")";
    return str;
    }
   }
   