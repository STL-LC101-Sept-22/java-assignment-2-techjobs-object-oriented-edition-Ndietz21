package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {

        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals("job1 and job2 should have different and unique IDs", job1, job2);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job.getName() instanceof String);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());



    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        System.out.println(job1.getId());
//        System.out.println(job2.getId());

        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals('\n', job1.toString().charAt(0));
        assertEquals('\n', job1.toString().charAt(job1.toString().length()-1));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expected =
                "\n" +
                "\nID: " + job1.getId() +
                "\nName: " + job1.getName() +
                "\nEmployer: " + job1.getEmployer() +
                "\nLocation: " + job1.getLocation() +
                "\nPosition Type: " + job1.getPositionType() +
                "\nCore Competency: " + job1.getCoreCompetency() +
                "\n";

//        System.out.println(expected);

        assertEquals(expected, job1.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        String expected =
                "\nID: " + job1.getId() +
                "\nName: " + "Data not available" +
                "\nEmployer: " + "Data not available" +
                "\nLocation: " + "Data not available" +
                "\nPosition Type: " + "Data not available" +
                "\nCore Competency: " + "Data not available" +
                "\n";

        assertEquals(expected, job1.toString());

    }


}
