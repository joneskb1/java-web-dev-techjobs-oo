package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest<testSettingJobId> {
    public Job job1;
    public Job job2;

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
        Job myJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(myJob.getName(), "Product tester");
        assertEquals(myJob.getEmployer().getValue(), "ACME");
        assertEquals(myJob.getLocation().getValue(), "Desert");
        assertEquals(myJob.getPositionType().getValue(), "Quality control");
        assertEquals(myJob.getCoreCompetency().getValue(), "Persistence");
        assertEquals(myJob.getId(), 3); //3rd job created
        assertTrue(myJob instanceof Job); // for name & id
        assertTrue(myJob.getEmployer() instanceof Employer);
        assertTrue(myJob.getLocation() instanceof Location);
        assertTrue(myJob.getPositionType() instanceof PositionType);
        assertTrue(myJob.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job myJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(myJob1.getId() == myJob2.getId());

    }
}
