package Formula1ChampionshipManager;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static Formula1ChampionshipManager.Formula1ChampionshipManager.file;
import static Formula1ChampionshipManager.Formula1ChampionshipManager.raceList;

public class Test {

    private ArrayList<Driver> participatedDrivers;


    public void main(String[] args) throws ParseException {
        Formula1ChampionshipManager.readingFile(file);
        Test t =new Test();
        t.addRace();

    }


    public void addRace() throws ParseException {

        Formula1ChampionshipManager f= new Formula1ChampionshipManager();
        HashMap<Integer, Driver> driverList = new HashMap<Integer,Driver>();

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter date of Race (DD/MM/YYYY) : ");
        String raceDate = sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("DD/MM/YYYY");
        Date date = dateFormat.parse(raceDate);

        for (Driver d : f.fDriver){
            System.out.println("");
            System.out.println("Enter position of " + d.getName() + " driver  -");
            int position = sc.nextInt();
            if (position == 1){
                d.setFirst(d.getFirst()+1);
                d.setTotalPoints(d.getTotalPoints()+25);
                driverList.put(1,d);
            }else if (position == 2){
                d.setSecond(d.getSecond()+1);
                d.setTotalPoints(d.getTotalPoints()+18);
                driverList.put(2,d);
            }else if (position == 3){
                d.setThird(d.getThird()+1);
                d.setTotalPoints(d.getTotalPoints()+15);
                driverList.put(3,d);
            }else if (position == 4){
                d.setFourth(d.getFourth()+1);
                d.setTotalPoints(d.getTotalPoints()+12);
                driverList.put(4,d);
            }else if (position == 5){
                d.setFifth(d.getFifth()+1);
                d.setTotalPoints(d.getTotalPoints()+10);
                driverList.put(5,d);
            }else if (position == 6){
                d.setSixth(d.getSixth()+1);
                d.setTotalPoints(d.getTotalPoints()+8);
                driverList.put(6,d);
            }else if (position == 7){
                d.setSeventh(d.getSeventh()+1);
                d.setTotalPoints(d.getTotalPoints()+6);
                driverList.put(7,d);
            }else if (position == 8){
                d.setEighth(d.getEighth()+1);
                d.setTotalPoints(d.getTotalPoints()+4);
                driverList.put(8,d);
            }else if (position == 9){
                d.setNinth(d.getNinth()+1);
                d.setTotalPoints(d.getTotalPoints()+2);
                driverList.put(9,d);
            }else if (position == 10) {
                d.setTenth(d.getTenth()+1);
                d.setTotalPoints(d.getTotalPoints()+1);
                driverList.put(10,d);
            }else{
                System.out.println("This driver didn't acheive ");
            }

        }
        Race race = new Race(date, driverList);
        f.raceList.add(race);

        Formula1ChampionshipManager f1 = new Formula1ChampionshipManager();
        for (Race r : f.raceList){
            System.out.println(r.getDate());
            System.out.println("Participated Drivers");

            for (Integer name: r.getDriverList().keySet()) {
                String key = name.toString();
                Driver value = r.getDriverList().get(name);
                String dName = value.getName();
                System.out.println(key + " - " + dName + value.getPoints());
            }

        }

    }

    /*public void testingAddedRaces(){
        Formula1ChampionshipManager f = new Formula1ChampionshipManager();
        for (Race r : f.raceList){
            System.out.println(r.getDate());
            System.out.println("Participated Drivers");

            for (Integer name: r.getDriverList().keySet()) {
                String key = name.toString();
                Driver value = r.getDriverList().get(name);
                String dName = value.getName();
                System.out.println(key + " - " + dName + value.getPoints());
            }

        }
    }*/

}
