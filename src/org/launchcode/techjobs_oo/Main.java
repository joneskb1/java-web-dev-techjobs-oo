package org.launchcode.techjobs_oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste ability"));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

//        for (Job job : jobs){
//            System.out.println(job);
//        }

        System.out.println(job1.getId());
        System.out.println(job1.getEmployer().getId());
        System.out.println(job1.getLocation().getId());
        System.out.println(job1.getPositionType().getId());
        System.out.println(job1.getCoreCompetency().getId());
        System.out.println("          ");
        System.out.println(job2.getId());

        System.out.println(job2.getEmployer().getId());
        System.out.println(job2.getLocation().getId());
        System.out.println(job2.getPositionType().getId());
        System.out.println(job2.getCoreCompetency().getId());

        Employer myEm = new Employer();

    }



}


