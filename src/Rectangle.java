public class Rectangle {

    public int width;

    public int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }


    public void perimeter(Rectangle rectangle) {
        System.out.println("Периметр прямоугольника" + " = " + (width + length) * 2);
    }


    public void square(Rectangle rectangle) {
        System.out.println("Площадь прямоугольника " + " = " + width * length);

    }

    @Override
    public String toString() {
        return "Прямоугольник  - " +
                " ширина = " + width +
                ", длина = " + length +
                ' ';
    }

}
