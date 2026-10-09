public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius, String colour){
        super(radius, colour);
        this.height = height;
    }
    //
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double findVolume(){
        return height * findArea();
    }
    @Override 
    public void printInfo(){
        System.out.println("Cylinder colored is " + getColour() + ", Volume is = " + findVolume());
    }
}
