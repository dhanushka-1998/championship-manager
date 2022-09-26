package Formula1ChampionshipManager;

import java.io.Serializable;


/*
 * Make Driver class Serializable for Save Data as Objects
 */

public abstract class Driver implements Serializable {

    private String name;
    private String location;
    private String team;


    /*
     * Driver Class Constructor
     */

    public Driver(String name, String location, String team){
        this.name=name;
        this.location=location;
        this.team=team;
    }


    /*
     * Getter and Setters of Driver Class
     */

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public abstract int getFirst();

    public abstract void setFirst(int first);

    public abstract int getSecond();

    public abstract void setSecond(int second);

    public abstract int getThird();

    public abstract void setThird(int third);

    public abstract int getFourth();

    public abstract void setFourth(int fourth);

    public abstract int getFifth();

    public abstract void setFifth(int fifth);

    public abstract int getSixth();

    public abstract void setSixth(int sixth);

    public abstract int getSeventh();

    public abstract void setSeventh(int seventh);

    public abstract int getEighth();

    public abstract void setEighth(int eighth);

    public abstract int getNinth();

    public abstract void setNinth(int ninth);

    public abstract int getTenth();

    public abstract void setTenth(int tenth);

    public abstract int getNoOfRaces();

    public abstract void setNoOfRaces(int noOfRaces);

    public abstract int getPoints();

    public abstract void setPoints(int points);

    public abstract int getPointsHave();

    public abstract void setPointsHave(int pointsHave);

    public abstract int getTotalPoints();

    public abstract void setTotalPoints(int totalPoints);

}
