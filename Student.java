public class Student
{
    public String name;
    public byte age;
    public float rate;
    public Student(String name, byte age, float rate)
    {
        this.name = name;
        this.age = age;
        this.rate = rate;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                '}';
    }
}
