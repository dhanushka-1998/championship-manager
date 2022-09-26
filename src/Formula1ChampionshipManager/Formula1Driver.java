package Formula1ChampionshipManager;

import java.io.Serializable;


/*
 * Make Formula1Driver class Serializable for Save Data as Objects
 */

public class Formula1Driver extends Driver implements Serializable {

    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;
    private int sixth;
    private int seventh;
    private int eighth;
    private int ninth;
    private int tenth;
    private int noOfRaces;
    private int points;
    private int pointsHave;
    private int totalPoints;


    /*
     * Formula1Driver Class Constructor
     * name String
     * location String
     * team String
     * first integer
     * second integer
     * third integer
     * fourth integer
     * fifth integer
     * sixth integer
     * seventh integer
     * eighth integer
     * ninth integer
     * tenth integer
     * noOfRaces integer
     * points integer
     * pointsHave integer
     * totalPoints integer
     */

    public Formula1Driver(String name, String location, String team, int first, int second, int third, int fourth,
                          int fifth, int sixth, int seventh, int eighth, int ninth, int tenth, int noOfRaces, int points,
                          int pointsHave, int totalPoints) {

        super(name, location, team);
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
        this.ninth = ninth;
        this.tenth = tenth;
        this.noOfRaces = noOfRaces;
        this.points = points;
        this.pointsHave = pointsHave;
        this.totalPoints = totalPoints;
    }



    /*
     * Getter and Setters of Formula1Driver Class
     */

    @Override
    public int getFirst() {
        return first;
    }

    @Override
    public void setFirst(int first) {
        this.first = first;
    }

    @Override
    public int getSecond() {
        return second;
    }

    @Override
    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public int getThird() {
        return third;
    }

    @Override
    public void setThird(int third) {
        this.third = third;
    }

    @Override
    public int getFourth() {
        return fourth;
    }

    @Override
    public void setFourth(int fourth) {
        this.fourth = fourth;
    }

    @Override
    public int getFifth() {
        return fifth;
    }

    @Override
    public void setFifth(int fifth) {
        this.fifth = fifth;
    }

    @Override
    public int getSixth() {
        return sixth;
    }

    @Override
    public void setSixth(int sixth) {
        this.sixth = sixth;
    }

    @Override
    public int getSeventh() {
        return seventh;
    }

    @Override
    public void setSeventh(int seventh) {
        this.seventh = seventh;
    }

    @Override
    public int getEighth() {
        return eighth;
    }

    @Override
    public void setEighth(int eighth) {
        this.eighth = eighth;
    }

    @Override
    public int getNinth() {
        return ninth;
    }

    @Override
    public void setNinth(int ninth) {
        this.ninth = ninth;
    }

    @Override
    public int getTenth() {
        return tenth;
    }

    @Override
    public void setTenth(int tenth) {
        this.tenth = tenth;
    }

    @Override
    public int getNoOfRaces() {
        return noOfRaces;
    }

    @Override
    public void setNoOfRaces(int noOfRaces) {
        this.noOfRaces = noOfRaces;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int getPointsHave() {
        return pointsHave;
    }

    @Override
    public void setPointsHave(int pointsHave) {
        this.pointsHave = pointsHave;
    }

    @Override
    public int getTotalPoints() {
        return totalPoints;
    }

    @Override
    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }


}





