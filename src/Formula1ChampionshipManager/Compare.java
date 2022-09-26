package Formula1ChampionshipManager;

import java.util.Comparator;


/*
 * This Class for sorting the table Descending order, according to the points they have in the current season.
 * Comparable and Comparator in Java Explained in Sinhala
 * https://www.youtube.com/watch?v=8FxnM6pqbZ8
 */

class CompareD implements Comparator<Driver> {

    @Override
    public int compare(Driver o1, Driver o2) {
        if (o2.getTotalPoints()==o1.getTotalPoints()) {
            if (o2.getFirst() > o1.getFirst()) {
                return 1;
            } else {
                return -1;
            }
        }
            else if (o2.getTotalPoints() > o1.getTotalPoints()) {
                return 1;

            } else {
                return -1;
            }
        }

    }


/*
 * This Class for sorting the table Ascending order, according to the points they have in the current season.
 * Comparable and Comparator in Java Explained in Sinhala
 * https://www.youtube.com/watch?v=8FxnM6pqbZ8
 */

class CompareA implements Comparator<Driver>{

    @Override
    public int compare(Driver o1, Driver o2) {
        if (o2.getTotalPoints()==o1.getTotalPoints()) {
            if (o2.getFirst() < o1.getFirst()) {
                return 1;
            } else {
                return -1;
            }
        }
        else if (o2.getTotalPoints() < o1.getTotalPoints()) {
            return 1;

        } else {
            return -1;
        }
    }
}


/*
 * This Class for sorting the table Descending order, according to the largest number of first position won in races.
 * Comparable and Comparator in Java Explained in Sinhala.
 * https://www.youtube.com/watch?v=8FxnM6pqbZ8
 */

class CompareLD implements Comparator<Driver>{

    @Override
    public int compare(Driver o1, Driver o2) {
        if (o2.getFirst() > o1.getFirst()) {
            return 1;
        } else {
            return -1;
        }
    }
}

