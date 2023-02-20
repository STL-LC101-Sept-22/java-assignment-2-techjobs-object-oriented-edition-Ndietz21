package org.launchcode.techjobs.oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job(null, new Employer(null), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        System.out.println(job1.toString());
    }

}
