package org.launchcode.techjobs.oo.test;

import org.junit.Before;
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
    Job test_job_one;
    Job test_job_two;
    Job test_job_three;
    Job test_job_four;

    @Before
    public void createJobObjects() {
        test_job_one = new Job();
        test_job_two = new Job();
        test_job_three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_four =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    @Test
    public void testSettingJobId() {
        assertNotEquals(test_job_one.getId(), test_job_two.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job_three.getName() instanceof String);
        assertEquals("Product tester", test_job_three.getName());

        assertTrue(test_job_three.getEmployer() instanceof Employer);
        assertEquals("ACME", test_job_three.getEmployer().toString());

        assertTrue(test_job_three.getLocation() instanceof Location);
        assertEquals("Desert", test_job_three.getLocation().toString());

        assertTrue(test_job_three.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job_three.getPositionType().toString());

        assertTrue(test_job_three.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job_three.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job_three.equals(test_job_four));
    }
}
