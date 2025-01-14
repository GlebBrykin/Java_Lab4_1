import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Ivan", (byte)20, 3.0f));
        students.add(new Student("Elena", (byte)19, 3.5f));
        students.add(new Student("Aleksandr", (byte)21, 2.8f));
        students.add(new Student("Nikolay", (byte)18, 2.0f));
        students.add(new Student("Maria", (byte)25, 4.1f));
        System.out.println("Исходный список:");
        for(Student stud : students)
        {
            System.out.println(stud);
        }
        while(true)
        {
            boolean changed = false;
            for(int i = 0; i < students.size(); ++i)
            {
                Student stud = students.get(i);
                if((stud.age < 20) || (stud.rate < 3.0f))
                {
                    students.remove(i);
                    changed = true;
                    break;
                }
            }
            if(!changed)
                break;
        }
        System.out.println("Отфильтрованный список:");
        for(Student stud : students)
        {
            System.out.println(stud);
        }

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите список слов и чисел, разделенных пробелами: ");
        String input = scanner.nextLine();
        String[] elements = input.split("\\s+");
        List<String> words = new ArrayList<String>();
        List<Double> numbers = new ArrayList<Double>();
        for(String element : elements)
        {
            try
            {
                Double number = Double.parseDouble(element);
                numbers.add(number);
            }
            catch(NumberFormatException e)
            {
                words.add(element);
            }
        }
        Collections.sort(words);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Слова в возрастающем порядке: " + words);
        System.out.println("Числа в убывающем порядке: " + numbers);
    }
}