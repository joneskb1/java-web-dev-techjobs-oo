package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest<testSettingJobId> {
    public  Job job1;
    public  Job job2;


    @Before
    public void createJobs(){
    job1 =new Job();
    job2 =new Job();


    }
    @Test
    public void testSettingJobId() {
        assertEquals(job1.getId()+1, job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(myJob3.getName(), "Product tester");
        assertEquals(myJob3.getEmployer().toString(), "ACME");
        assertEquals(myJob3.getLocation().getValue(), "Desert");
        assertEquals(myJob3.getPositionType().getValue(), "Quality control");
        assertEquals(myJob3.getCoreCompetency().getValue(), "Persistence");
        assertEquals(myJob3.getId(), 26);
        assertTrue(myJob3 instanceof Job); // for name & id
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
        Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // full test
        assertEquals("\n" +
                "ID: " + "29" + "\n" +
                "Name: " + "Product tester" + "\n" +
                "Employer: " + "ACME" + "\n" +
                "Location: " + "Desert" + "\n" +
                "Position Type: " + "Quality control" + "\n" +
                "Core Competency: " + "Persistence" + "\n", myJob3.toString());

    }

    @Test
    public void blankLinesStringTest() {
        Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\n", myJob3.toString().substring(0, 1));
        assertEquals("\n", myJob3.toString().substring(myJob3.toString().length() - 1, myJob3.toString().length()));
    }


    @Test
    public void idStringTest() {
        Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("ID: 34\n", myJob3.toString().substring(1, 8));
    }

    @Test
    public void nameStringTest() {
        Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Name: Product tester\n", myJob3.toString().substring(7, 28));
    }

    @Test
    public void employerStringTest() {
        Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Employer: ACME\n", myJob3.toString().substring(28, 43));
    }

    @Test
    public void locationStringTest() {
        Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\nLocation: Desert", myJob3.toString().substring(43, 60));
    }


    @Test
    public void positionStringTest() {
        Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\nPosition Type: Quality control", myJob3.toString().substring(60, 91));
    }


    @Test
    public void CoreCompetencyStringTest() {
        Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Core Competency: Persistence\n", myJob3.toString().substring(91, 120));

    }
    @Test
    public void emptyValueStringTest() {
            // test for blank values
            Job myJob4 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            assertEquals("\n" +
                    "ID: " + "23" + "\n" +
                    "Name: " + "Data not available" + "\n" +
                    "Employer: " + "Data not available" + "\n" +
                    "Location: " + "Data not available" + "\n" +
                    "Position Type: " + "Data not available" + "\n" +
                    "Core Competency: " + "Data not available" + "\n", myJob4.toString());

        }

    }


