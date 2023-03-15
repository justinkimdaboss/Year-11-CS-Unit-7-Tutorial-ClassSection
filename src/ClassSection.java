import java.util.ArrayList;

public class ClassSection
{

    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<String> students = new ArrayList<String>();

    public ClassSection(String subject, int capacity, int yearLevel)
    {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public void addStudent(Student x)
    {
    String yes = x.getFirstName();
    if (students.contains(yes))
        {
            System.out.println("l");
        }
    else
    {
        students.add(yes);
    }
    }
    public void removeStudent(Student x)
    {
        String yes = x.getFirstName();
        students.remove(yes);

    }

    public boolean isStudentEnrolled()
    {
        return true;
    }

    @Override
    public String toString() {
        return "ClassSection{" +
                "subject='" + subject + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}
