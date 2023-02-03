public class Rectangle {

    private int width;

    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }


    public void perimeter(int width, int length) {
        System.out.println("Периметр прямоугольника" + " = " + (width + length) * 2);
    }


    public void square(int width, int length) {
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
