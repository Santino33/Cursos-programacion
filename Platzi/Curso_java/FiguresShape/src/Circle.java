public class Circle implements Shape{
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI*Math.pow(radius, 2));
    }

    @Override
    public int getPerimeter() {
       return (int) (2*Math.PI*radius);
    }

    @Override
    public String toString(){
        return "El area es: "+getArea() + " y el perimetro es: "+getPerimeter();
    }
}
