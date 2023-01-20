public interface Shape {
    default int getArea() {

        return 0;
    }
    default int getPerimeter() {
        return 0;
    }
}
