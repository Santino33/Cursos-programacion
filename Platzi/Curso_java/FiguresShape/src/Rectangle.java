public class Rectangle implements Shape{
    public int side1;
    public int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public int getArea() {

        return side1*side2;
    }

    @Override
    public int getPerimeter() {
      return (side1*2)+(side2*2);
    }
    @Override
    public String toString(){
        return "El area es: "+getArea() + " y el perimetro es: "+getPerimeter();
    }
}
