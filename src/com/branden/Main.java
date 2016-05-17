package com.branden;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Biology program
        //Tracks the number of chromosomes an animal has
        //Chromosomes come in pairs so total is always an even number
        HashMap<String, Integer> totalchromosomes = new HashMap();
        totalchromosomes.put("3 Chromo-Worm", 3);
        totalchromosomes.put("Human", 46);
        totalchromosomes.put("Squirrel", 80);
        totalchromosomes.put("Hedgehog", 88);
        totalchromosomes.put("Frog", 26);
        totalchromosomes.put("Giant Squid", 48);
        //all data according to the internet....
        // Set allAnimalNames = totalchromosomes.keySet();
        for (String a : totalchromosomes.keySet()) {
            int chrom = totalchromosomes.get(a);
            assert chrom % 2 == 0 : "Chromosomes is not an even number";
            assert chrom < 0 : "Negative number of chromosomes";
            int pairs = chrom / 2 ;
            System.out.println("A " + a + " has " + pairs + " pairs of chromosomes, so " + chrom + " in total");

        }
    }

}
