public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(rectangle);
        rectangle.square(rectangle);
        rectangle.perimeter(rectangle);

        Student student = new Student("Попов", 151, 5);
        System.out.println(student);

    }
}