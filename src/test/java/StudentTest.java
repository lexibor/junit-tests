import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest
{
    Student student = new Student(12234, "Bob", new ArrayList<>(Arrays.asList(95, 80, 93)));

    @Test
    public void testIfYouGetGradesFromArray()
    {
        ArrayList<Integer> manyGrades = new ArrayList<>(Arrays.asList(95, 80, 95));

        assertEquals(manyGrades, student.getGrades());

    }

    @Test
    public void testGetGradeAverage()
    {
        double average = 89.3333333;

        assertEquals(average, student.getGradeAverage(), 0.5);
    }

    @Test
    public void testIfGradeIsAdded()
    {
        ArrayList<Integer> manyGrades = new ArrayList<>(Arrays.asList(95, 80, 93, 70));

        student.addGrade(70);

        assertEquals(manyGrades, student.getGrades());
    }
}
