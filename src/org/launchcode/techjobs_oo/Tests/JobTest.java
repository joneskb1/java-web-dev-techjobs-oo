package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest<testSettingJobId> {
    public  Job job1;
    public  Job job2;
    public  Job myJob3;


    @Before
    public void createJobs(){
    job1 =new Job();
    job2 =new Job();
    myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));



    }
    @Test
    public void testSettingJobId() {
        assertEquals(job1.getId()+1, job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(myJob3.getName(), "Product tester");
        assertEquals(myJob3.getEmployer().toString(), "ACME");
        assertEquals(myJob3.getLocation().getValue(), "Desert");
        assertEquals(myJob3.getPositionType().getValue(), "Quality control");
        assertEquals(myJob3.getCoreCompetency().getValue(), "Persistence");
        assertTrue(myJob3 instanceof Job);
        assertTrue(myJob3.getEmployer() instanceof Employer);
        assertTrue(myJob3.getLocation() instanceof Location);
        assertTrue(myJob3.getPositionType() instanceof PositionType);
        assertTrue(myJob3.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job1.getId() == job2.getId());

    }

    @Test
    public void toStringTestFull() {
        // full test
        assertEquals("\n" +
                "ID: " + myJob3.getId() + "\n" +
                "Name: " + "Product tester" + "\n" +
                "Employer: " + "ACME" + "\n" +
                "Location: " + "Desert" + "\n" +
                "Position Type: " + "Quality control" + "\n" +
                "Core Competency: " + "Persistence" + "\n", myJob3.toString());

    }


    @Test
    public void emptyValueStringTest() {
            // test for blank values
            Job myJob4 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            assertEquals("\n" +
                    "ID: " + myJob4.getId() + "\n" +
                    "Name: " + "Data not available" + "\n" +
                    "Employer: " + "Data not available" + "\n" +
                    "Location: " + "Data not available" + "\n" +
                    "Position Type: " + "Data not available" + "\n" +
                    "Core Competency: " + "Data not available" + "\n", myJob4.toString());

        }

    }


