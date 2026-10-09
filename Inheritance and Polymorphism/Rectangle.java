public class Rectangle extends Shape {
    private double side;

    public Rectangle(double side, String colour){
        super(colour);
        this.side = side;
    }
    //
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double findArea(){
        return side * side;
    }
    @Override 
    public void printInfo(){
        System.out.println("Rectangle colored is " + getColour() + ", Surface area is = " + findArea());
    }
}
