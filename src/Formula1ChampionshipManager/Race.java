package Formula1ChampionshipManager;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;


/*
 * Make Race class Serializable for Save Data as Objects
 */

public class Race implements Serializable {

    private Date date;
    private HashMap<Integer, Driver> driverList;


    /*
     * Race Class Constructor
     * date Date
     * HashMap<Integer, Driver> driverList
     */

    public Race(Date date, HashMap<Integer, Driver> driverList) {
        this.date = date;
        this.driverList = driverList;
    }


    /*
     * Getter and Setters of Race Class
     */

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public HashMap<Integer, Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(HashMap<Integer, Driver> driverList) {
        this.driverList = driverList;
    }


}
