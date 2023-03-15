public class Student
{

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    public static int studentCount;

    public Student(String firstName, String lastName, int age, int yearLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    public boolean equals(Student student1, Student student2)
    {
        if(student1.getFirstName() == student2.getFirstName())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Adrian";
    }


}
