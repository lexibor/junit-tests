import java.util.ArrayList;
import java.util.Arrays;

public class Student
{
    private long id;
    private String name;
    private ArrayList<Integer> grades;


    public Student(long id, String name, ArrayList<Integer> grades)
    {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    // returns the student's id
    public long getId()
    {
        return id;
    }


    // returns the student's name
    public String getName()
    {
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade)
    {
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades()
    {
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage()
    {
        double sum = 0;

        for(int grade : grades)
        {
            sum += grade;
        }

        return sum / grades.size();
    }

}
