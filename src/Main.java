import java.util.*;
import java.util.ArrayList;

public class Main {
    //public static final LinkedHashSet<Integer> INTEGERS = new LinkedHashSet<Integer>();

    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.println("Введите строку чисел: ");
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(", ");
        LinkedHashSet<Integer> intSet = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            intSet.add(Integer.valueOf(arr[i]));
        }
        System.out.println("Без повторяющихся элементов: " + intSet);

        System.out.println();

        System.out.println("Задание 2: ");
        Animals animals = new Animals();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Wolf");
        animals.add("Snake");
        animals.add("Lion");
        animals.show();
        animals.remove();
        animals.remove();
        System.out.println();
        System.out.println("После удаления:");
        animals.show();

        System.out.println();
        System.out.println("Задание 3: ");
        List<Student> students = new LinkedList<>();
        Student student1 = new Student("Vlad", 3, 1, 2, 5, 3);
        Student student2 = new Student("Andrei", 1, 2, 5, 5, 5);
        Student student3 = new Student("Misha", 3, 3, 2, 2, 2);
        students.add(student1);
        students.add(student2);
        students.add(student3);


        Student.printStudent(students, 3);
        Student.numberCourse(students);
        System.out.println("После подсчета среднего балла: ");
        Student.printStudent(students, 4);

        System.out.println();
        System.out.println("Задание *: ");

     Collection<Integer> integerCollection = new Collection<>();
        Collection<String> stringCollection = new Collection<>(2);

        stringCollection.add("новая строка");
        stringCollection.add("новая строка2");
        stringCollection.add("новая строка3");
        System.out.println("После добавления: "+stringCollection);
        stringCollection.getByID(1);
        stringCollection.remove("новая строка");
        System.out.println("После удаления 1 строки: "+ stringCollection);
        System.out.println("содержит ли коллекция строку: 2 "+ stringCollection.contains("2"));
        stringCollection.clean();
        System.out.println("После удаления всех строк: " + stringCollection);

        System.out.println();




    }
}