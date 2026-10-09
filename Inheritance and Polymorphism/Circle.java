public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius, String colour){
        super(colour);
        this.radius = radius;   
    }
    //
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * radius * radius;
    }
    @Override 
    public void printInfo(){
        System.out.println("Circle colored is " + getColour() + " Surface area is = " + findArea());
    }
}
