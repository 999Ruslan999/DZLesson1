import java.util.Arrays;

public class Student {

    public String surname;

    public int group;

    public int[] arr = new int[]{1, 2, 3, 4, 5};

    public Student(String surname, int group, int arr) {
        this.surname = surname;
        this.group = group;

    }

    public static int NumberGroup(int[] arr) {
        int max = 0;
        arr[0] = max;
        for (int i : arr) {
            if (max < i) {
                i = max;
            }
            System.out.println(max);
        }
        return max;
    }

    @Override
    public String toString() {
        return "Студент - " +
                "Фамилия - '" + surname + '\'' +
                ", Группа - " + group +
                ", Оценки - " + Arrays.toString(arr) +
                ' ';
    }
}
