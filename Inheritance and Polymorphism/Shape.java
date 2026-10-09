public class Shape{
    protected String colour;

    public Shape(String colour){
        this.colour = colour;
    }
    //
    public String getColour(){
        return this.colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void printInfo(){
        System.out.println("The Shape colored is " + colour);
    }
}