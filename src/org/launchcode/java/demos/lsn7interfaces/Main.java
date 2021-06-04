package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator compareCone = new ConeComparator();

        flavors.sort(comparator);
        cones.sort(compareCone);

        for (Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }
        for (Cone cone : cones){
            System.out.println(cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
