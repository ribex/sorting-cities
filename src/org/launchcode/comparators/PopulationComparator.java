package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by Rebecca on 4/2/2017.
 */
public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        return ((Integer)o1.getPopulation()).compareTo(o2.getPopulation());
    }
}
