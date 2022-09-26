package Formula1ChampionshipManager;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Formula1ChampionshipManager implements ChampionshipManager {

    private static final Scanner input = new Scanner(System.in);    // Create scanner object from Scanner Class
    private static boolean isValid = true;  // loop control variable of mainMenu method
    public static ArrayList<Driver> fDriver = new ArrayList<>();    //Arraylist of Drivers and details of them
    public static ArrayList<Race> raceList = new ArrayList<>();     //Arraylist of Races list
    public static File file = new File("data/dataFile.txt"); //File of all the information entered by the user



    /*
     * Main Method Invoke two methods
     */

    public static void main(String[] args) throws ParseException {

        readingFile(file); // Invoke Reading saved file in first run
        mainMenu(); // Invoke MainMenu Method

    }


    /*
     * This Method Display Championship Manager Program Console Main Menu
     */

    public static void mainMenu() throws ParseException {
        while (isValid) {
            String menuItems = ("\n-----------------------------------------------------------------------------------------------------"
                    +"\n|                                 FORMULA 1 CHAMPIONSHIP MANAGER                                    |"
                    +"\n|---------------------------------------------------------------------------------------------------|"
                    +"\n| 01 or CN |\tCreate a New Driver                                                                 |"
                    +"\n| 02 or DD |\tDelete a Driver and the Team                                                        |"
                    +"\n| 03 or CD |\tChange the Driver for an Existing Constructor Team                                  |"
                    +"\n| 04 or DV |\tDisplay the Various Statistics of Selected Driver                                   |"
                    +"\n| 05 or DF |\tDisplay the Formula 1 Driver Table                                                  |"
                    +"\n| 06 or AR |\tAdd a Race Completed with its Date and the Positions that all the Drivers Achieved  |"
                    +"\n| 07 or DR |\tDisplay all the Added Races Table                                                   |"
                    +"\n| 08 or SF |\tSaving in a File of all the Information Entered by the User                         |"
                    +"\n| 09 or RF |\tRead all the Information Saved in the Previous File                                 |"
                    +"\n| 10 or CF |\tClear all the Information Saved in the Previous File                                |"
                    +"\n| 11 or SG |\tStart the Graphical User Interface (GUI)                                            |"
                    +"\n| 00 or EX |\tExit the Program                                                                    |"
                    +"\n-----------------------------------------------------------------------------------------------------"
                    +"\nCHOOSE ONE OPTION : ");  // Console Main Menu Input

            System.out.print(menuItems);
            boolean hasNext = input.hasNext();
            if (hasNext) {
                String userInput = input.next().toUpperCase().trim(); // get user input and store in code variable
                mainMenuInputValidation(userInput); // Invoke menuInputValidation method and parse code as argument
            }
        }

        // Invoke Saving all the information entered by the user in exiting program
        savingFile(file);
        System.out.println("\nExiting Program...");
    }


    /*
     * This Method Validates Main Menu Inputs
     */

    public static void mainMenuInputValidation(String userInput) throws ParseException {

        String[] validInputArray = {"01","CN", "02","DD","03","CD","04","DV","05","DF","06","AR","07",
                "DR","08","SF","09","RF","10","CF","11","SG","00","EX"}; // valid Inputs hard coded into string array

        int index;

        List<String> validInputList = Arrays.asList(validInputArray); //Converting validInputArray to validInputList

        if (validInputList.contains(userInput)){
            index = validInputList.indexOf(userInput);
        switch (index) { // Switch case of valid input index
            // 01 or CN
            case 0:
            case 1:
                //call createDriver method
                createDriver();
                break;
            //02 or DD
            case 2:
            case 3:
                //call deleteDriver method
                deleteDriver();
                break;
            //03 or CD
            case 4:
            case 5:
                //call changeDriver method
                changeDriver();
                break;
            //04 or DV
            case 6:
            case 7:
                //call displayStatistics method
                displayStatistics();
                break;
            //05 or DF
            case 8:
            case 9:
                //call displayDriverTable1 method
                displayDriverTable1();
                break;
            //06 or AR
            case 10:
            case 11:
                //call addRacePositionsAndDate method
                addRacePositionsAndDate();
                break;
            //06 or AR
            case 12:
            case 13:
                //call displayAllAddedRaces method
                displayAllAddedRaces();
                break;
            //07 or SF
            case 14:
            case 15:
                //call savingFile method
                savingFile(file);
                break;
            //08 or RF
            case 16:
            case 17:
                //call readingFile method
                readingFile(file);
                break;
            //09 or CF
            case 18:
            case 19:
                //call clearFileData method
                clearFileData();
                break;
            //10 or SG
            case 20:
            case 21:
                //call startGUI method
                startGUI();
                break;
            //00 or EX
            case 22:
            case 23:
                isValid = false;
        }

        }else {
            isValid = true;
            System.out.println("\nInvalid Input! Try Again.");

        }
    }

    /*
     * This Method Adding Drivers to Array
     */

    public static void createDriver(){


        String Name, Location, Team;
        int First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth, Tenth, NoOfRaces, PointsHave;


        System.out.println(" ");
        System.out.print("Name of the Driver ? : ");
        Name = input.next();

        System.out.print("Location of the Driver ? : ");
        Location = input.next();

        System.out.print("Team of the Driver ? : ");
        Team=input.next();

        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("How Many First Positions that Achieved in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nHow Many First Positions that Achieved in the Season ?  : ");
                input.next();
            }
            First = input.nextInt();
            if (First < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (First<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("How Many Second Positions that Achieved in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nHow Many Second Positions that Achieved in the Season ?  : ");
                input.next();
            }
            Second = input.nextInt();
            if (Second < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (Second<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("How Many Third Positions that Achieved in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nHow Many Third Positions that Achieved in the Season ?  : ");
                input.next();
            }
            Third = input.nextInt();
            if (Third < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (Third<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("How Many Fourth Positions that Achieved in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nHow Many Fourth Positions that Achieved in the Season ?  : ");
                input.next();
            }
            Fourth = input.nextInt();
            if (Fourth < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (Fourth<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("How Many Fifth Positions that Achieved in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nHow Many Fifth Positions that Achieved in the Season ?  : ");
                input.next();
            }
            Fifth = input.nextInt();
            if (Fifth < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (Fifth<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("How Many Sixth Positions that Achieved in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nHow Many Sixth Positions that Achieved in the Season ?  : ");
                input.next();
            }
            Sixth = input.nextInt();
            if (Sixth < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (Sixth<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("How Many Seventh Positions that Achieved in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nHow Many Seventh Positions that Achieved in the Season ?  : ");
                input.next();
            }
            Seventh = input.nextInt();
            if (Seventh < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (Seventh<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("How Many Eighth Positions that Achieved in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nHow Many Eighth Positions that Achieved in the Season ?  : ");
                input.next();
            }
            Eighth = input.nextInt();
            if (Eighth < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (Eighth<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("How Many Ninth Positions that Achieved in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nHow Many Ninth Positions that Achieved in the Season ?  : ");
                input.next();
            }
            Ninth = input.nextInt();
            if (Ninth < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (Ninth<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("How Many Tenth Positions that Achieved in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nHow Many Tenth Positions that Achieved in the Season ?  : ");
                input.next();
            }
            Tenth = input.nextInt();
            if (Tenth < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (Tenth<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("The Number of Races Participated so far in the Season ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nThe Number of Races Participated so far in the Season ?  : ");
                input.next();
            }
            NoOfRaces = input.nextInt();
            if (NoOfRaces < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (NoOfRaces<0);


        //Validating Inputs
        do { //Check if the input is an Integer and it is in the range
            System.out.print("The Number of Points that the Driver Currently Has ?  : ");
            while (!input.hasNextInt()) {
                System.out.print("\nError! Please Enter Valid Number.\n \nThe Number of Points that the Driver Currently Has ?  : ");
                input.next();
            }
            PointsHave = input.nextInt();
            if (PointsHave < 0) {
                System.out.println("\nError! Out of Range! Try Again.\n");
            }
        }while (PointsHave<0);



        //Assign Values of Positions to Variables

        int Points =(First*25)+(Second*18)+(Third*15)+(Fourth*12)+(Fifth*10)+(Sixth*8)+(Seventh*6)+(Eighth*4)+(Ninth*2)+(Tenth);
        int TotalPoints = (Points+PointsHave);

        Driver driver = new Formula1Driver(Name,Location,Team,First,Second,Third,Fourth,Fifth,Sixth,Seventh,Eighth,Ninth,Tenth,NoOfRaces,Points,PointsHave,TotalPoints);

        //Add driver object to the Arraylist

        fDriver.add(driver);
        System.out.println("\n----------------- New Driver Added Successfully! -----------------");

    }


    /*
     * This Method Remove Drivers from Array
     */

    public static void deleteDriver(){

        int dOption;

        //Print all the drivers in Arraylist as a table format

        System.out.println("\n------ Drivers and Their Teams ------");
        System.out.println("-------------------------------------");
        System.out.printf("%10s %10s %10s", "NUMBER", "NAME", "TEAM");
        System.out.println();
        System.out.println("-------------------------------------");

        for (int i=0; i<fDriver.size(); i++){
            System.out.format("%10s %10s %10s",(i), fDriver.get(i).getName(),fDriver.get(i).getTeam());
            System.out.println();
        }
        System.out.println("-------------------------------------");


        if(fDriver.isEmpty()) {
            System.out.println("\nThere are No Any Drivers Added!");
        }

        //Validating Inputs
        else {
            do { //Check if the input is an Integer and it is in the range
                System.out.print("\nWhat is the Number of Driver and Team Do You Want to Remove ? : ");
                while (!input.hasNextInt()) {
                    System.out.print("\nError! Please Enter Valid Number.\n \nWhat is the Number of Driver and Team Do You Want to Remove ? : ");
                    input.next();
                }
                dOption = input.nextInt();
                if (dOption>=fDriver.size() || dOption<0) {
                    System.out.println("\nError! Out of Range! Try Again.");
                }
            } while (dOption>=fDriver.size() || dOption<0);
            fDriver.remove(fDriver.remove(dOption));
            System.out.println("\nSelected Driver and Team Removed Successfully!");

        }

        //Print all the drivers in Arraylist after removing driver

        System.out.println("\n-- Updated Drivers and Their Teams --");
        System.out.println("-------------------------------------");
        System.out.printf("%10s %10s %10s", "NUMBER", "NAME", "TEAM");
        System.out.println();
        System.out.println("-------------------------------------");

        for (int i=0; i<fDriver.size(); i++){
            System.out.format("%10s %10s %10s",(i), fDriver.get(i).getName(),fDriver.get(i).getTeam());
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }


    /*
     * This Method for Change the driver for an existing constructor team.
     */

    public static void changeDriver() {

        int dOption;

        //Print all the drivers in Arraylist as a Table format

        System.out.println("\n------ Drivers and Their Teams ------");
        System.out.println("-------------------------------------");
        System.out.printf("%10s %10s %10s", "NUMBER", "TEAM", "D.NAME");
        System.out.println();
        System.out.println("-------------------------------------");

        for (int i=0; i<fDriver.size(); i++){
            System.out.format("%10s %10s %10s",(i), fDriver.get(i).getTeam(),fDriver.get(i).getName());
            System.out.println();
        }
        System.out.println("-------------------------------------");

        if (fDriver.isEmpty()) {
            System.out.println("\nThere are No Any Drivers Added!");

        }else {
            do { //Check if the input is an Integer and it is in the range
                System.out.print("\nWhat is the Number of the Team Do You Want to Change the Driver ? ");
                while (!input.hasNextInt()) {
                    System.out.print("\nError! Please Enter Valid Number.\n \nWhat is the Number of the Team Do You Want to Change the Driver ? ");
                    input.next();
                }
                dOption = input.nextInt();
                if (dOption>=fDriver.size() || dOption<0) {
                    System.out.println("\nError! Out of Range! Try Again.");
                }
            } while (dOption>=fDriver.size() || dOption<0);
            System.out.print("What is the Name of New Driver ? : ");
            String newDriver = input.next();
            fDriver.get(dOption).setName(newDriver);
            System.out.println("\nChanged "+newDriver+" New Driver for the "+fDriver.get(dOption).getTeam()+" Team Successfully!");
        }

        //Print all the drivers in Arraylist after Changing drivers

        System.out.println("\n-- Updated Drivers and Their Teams --");
        System.out.println("-------------------------------------");
        System.out.printf("%10s %10s %10s", "NUMBER", "TEAM", "D.NAME");
        System.out.println();
        System.out.println("-------------------------------------");

        for (int i=0; i<fDriver.size(); i++){
            System.out.format("%10s %10s %10s",(i), fDriver.get(i).getTeam(),fDriver.get(i).getName());
            System.out.println();
        }
        System.out.println("-------------------------------------");

    }


    /*
     * This Method for Display the various statistics for a selected existing driver.
     */

    public static void displayStatistics(){

        //Print all the drivers in Arraylist

        int dOption;

        System.out.println("\n--- List of All Drivers and Teams ---");
        System.out.println("-------------------------------------");
        System.out.printf("%10s %10s %10s", "NUMBER", "NAME", "TEAM");
        System.out.println();
        System.out.println("-------------------------------------");

        for (int i=0; i<fDriver.size(); i++){
            System.out.format("%10s %10s %10s",(i), fDriver.get(i).getName(),fDriver.get(i).getTeam());
            System.out.println();
        }
        System.out.println("-------------------------------------");

        if (fDriver.isEmpty()) {
            System.out.println("\nThere are No Any Drivers Added!");

        }else {
            do { //Check if the input is an Integer and it is in the range
                System.out.print("\nWhat is the Number of the Driver Do You Want to get Statistics ? ");
                while (!input.hasNextInt()) {
                    System.out.print("\nError! Please Enter Valid Number.\n \nWhat is the Number of the Driver Do You Want to get Statistics ? ");
                    input.next();
                }
                dOption = input.nextInt();
                if (dOption>=fDriver.size() || dOption<0) {
                    System.out.println("\nError! Out of Range! Try Again.");
                }
            } while (dOption>=fDriver.size() || dOption<0);

            //Print some statistics of the selected driver in Arraylist

            System.out.println("\nSOME STATISTICS OF "+fDriver.get(dOption).getName().toUpperCase()+"\n"
                    +"\nNAME            | "+fDriver.get(dOption).getName()
                    +"\nLOCATION        | "+fDriver.get(dOption).getLocation()
                    +"\nTEAM            | "+fDriver.get(dOption).getTeam()
                    +"\nNO OF RACES     | "+fDriver.get(dOption).getNoOfRaces()
                    +"\nNO OF 1ST P.    | "+fDriver.get(dOption).getFirst()
                    +"\nTOTAL POINTS    | "+fDriver.get(dOption).getTotalPoints());

        }
    }



    /*
     * This Method for Display the Formula 1 Driver Table in Descending order, according to the points they have in the current season.
     * Comparable and Comparator in Java Explained in Sinhala
     * https://www.youtube.com/watch?v=8FxnM6pqbZ8
     */

    public static void displayDriverTable1(){

        Collections.sort(fDriver,new CompareD());
        System.out.println("\n----------------------- Formula 1 Driver Table -----------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%10s %12s %10s %10s %10s %10s", "NAME", "LOCATION", "TEAM", "RACES", "1st P.","T.POINTS");
        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        for (int i=0; i<fDriver.size(); i++){
            System.out.format("%10s %12s %10s %10d %10d %10d",fDriver.get(i).getName(),fDriver.get(i).getLocation(),fDriver.get(i).getTeam(),fDriver.get(i).getNoOfRaces(),fDriver.get(i).getFirst(),fDriver.get(i).getTotalPoints());
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------");
    }


    /*
     * This Method for Display the Formula 1 Driver Table in Ascending order, according to the points they have in the current season.
     * Comparable and Comparator in Java Explained in Sinhala
     * https://www.youtube.com/watch?v=8FxnM6pqbZ8
     */

    public static void displayDriverTable2(){

        Collections.sort(fDriver,new CompareA());
        System.out.println("\n----------------------- Formula 1 Driver Table -----------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%10s %12s %10s %10s %10s %10s", "NAME", "LOCATION", "TEAM", "RACES", "1st P.","T.POINTS");
        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        for (int i=0; i<fDriver.size(); i++){
            System.out.format("%10s %12s %10s %10d %10d %10d",fDriver.get(i).getName(),fDriver.get(i).getLocation(),fDriver.get(i).getTeam(),fDriver.get(i).getNoOfRaces(),fDriver.get(i).getFirst(),fDriver.get(i).getTotalPoints());
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------");
    }



    /*
     * This Method for Display the Formula 1 Driver Table in Descending order,according to the largest number of first position won in races.
     * Comparable and Comparator in Java Explained in Sinhala
     * https://www.youtube.com/watch?v=8FxnM6pqbZ8
     */

    public static void displayDriverTable3(){

        Collections.sort(fDriver,new CompareLD());
        System.out.println("\n----------------------- Formula 1 Driver Table -----------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%10s %12s %10s %10s %10s %10s", "NAME", "LOCATION", "TEAM", "RACES", "1st P.","T.POINTS");
        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        for (int i=0; i<fDriver.size(); i++){
            System.out.format("%10s %12s %10s %10d %10d %10d",fDriver.get(i).getName(),fDriver.get(i).getLocation(),fDriver.get(i).getTeam(),fDriver.get(i).getNoOfRaces(),fDriver.get(i).getFirst(),fDriver.get(i).getTotalPoints());
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------");
    }


    /*
     * This Method for Adding a race completed with its date and the positions.
     */

    public static void addRacePositionsAndDate() throws ParseException {

        if (fDriver.isEmpty()){
            System.out.println("\nYou Can't Add Races, Because No Drivers Found!\nFirst Add Drivers and Try Again!");
        }
        else {
            Formula1ChampionshipManager f = new Formula1ChampionshipManager();
            HashMap<Integer, Driver> driverList = new HashMap<Integer, Driver>(); //Creating Hashmap
            int position;

            System.out.printf("\nEnter date of Race (DD/MM/YYYY) : ");
            String raceDate = input.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
            Date date = dateFormat.parse(raceDate);

            System.out.println(" ");
            for (Driver d : f.fDriver) {

                do { //Check if the input is an Integer and it is in the range
                    System.out.print("Enter the Position of " + d.getName() + " Driver : ");
                    while (!input.hasNextInt()) {
                        System.out.print("\nError! Please Enter Valid Number.\n \nEnter the Position of " + d.getName() + " Driver : ");
                        input.next();
                    }
                    position = input.nextInt();
                    if (position>=fDriver.size()+1 || position<0) {
                        System.out.println("\nError! Out of Range! Try Again.\n");
                    }
                }while (position>=fDriver.size()+1 || position<0);

                if (position == 1) {
                    d.setFirst(d.getFirst() + 1);
                    d.setTotalPoints(d.getTotalPoints() + 25);
                    d.setNoOfRaces(d.getNoOfRaces()+1);
                    driverList.put(1, d);
                } else if (position == 2) {
                    d.setSecond(d.getSecond() + 1);
                    d.setTotalPoints(d.getTotalPoints() + 18);
                    d.setNoOfRaces(d.getNoOfRaces()+1);
                    driverList.put(2, d);
                } else if (position == 3) {
                    d.setThird(d.getThird() + 1);
                    d.setTotalPoints(d.getTotalPoints() + 15);
                    d.setNoOfRaces(d.getNoOfRaces()+1);
                    driverList.put(3, d);
                } else if (position == 4) {
                    d.setFourth(d.getFourth() + 1);
                    d.setTotalPoints(d.getTotalPoints() + 12);
                    d.setNoOfRaces(d.getNoOfRaces()+1);
                    driverList.put(4, d);
                } else if (position == 5) {
                    d.setFifth(d.getFifth() + 1);
                    d.setTotalPoints(d.getTotalPoints() + 10);
                    d.setNoOfRaces(d.getNoOfRaces()+1);
                    driverList.put(5, d);
                } else if (position == 6) {
                    d.setSixth(d.getSixth() + 1);
                    d.setTotalPoints(d.getTotalPoints() + 8);
                    d.setNoOfRaces(d.getNoOfRaces()+1);
                    driverList.put(6, d);
                } else if (position == 7) {
                    d.setSeventh(d.getSeventh() + 1);
                    d.setTotalPoints(d.getTotalPoints() + 6);
                    d.setNoOfRaces(d.getNoOfRaces()+1);
                    driverList.put(7, d);
                } else if (position == 8) {
                    d.setEighth(d.getEighth() + 1);
                    d.setTotalPoints(d.getTotalPoints() + 4);
                    d.setNoOfRaces(d.getNoOfRaces()+1);
                    driverList.put(8, d);
                } else if (position == 9) {
                    d.setNinth(d.getNinth() + 1);
                    d.setTotalPoints(d.getTotalPoints() + 2);
                    d.setNoOfRaces(d.getNoOfRaces()+1);
                    driverList.put(9, d);
                } else if (position == 10) {
                    d.setTenth(d.getTenth() + 1);
                    d.setTotalPoints(d.getTotalPoints() + 1);
                    d.setNoOfRaces(d.getNoOfRaces()+1);
                    driverList.put(10, d);
                } else {
                    System.out.println("\nThis Driver Didn't Achieved Position in (1-10) Range");
                }

            }

            Race race = new Race(date, driverList);
            f.raceList.add(race);


            /*
             * Add Drivers positions using JavaHashmap.
             * Java HashMap
             * https://www.javatpoint.com/java-hashmap
             */

            for (Race r : f.raceList) {
                System.out.println("\n----------------------- RACE DATE ------------------------");
                System.out.println("               "+r.getDate()+"           ");
                System.out.println("\n------------------ Participated Drivers ------------------");
                System.out.println("----------------------------------------------------------");
                System.out.printf("%10s %10s %10s %10s %10s", "NAME", "LOCATION", "TEAM","POSITION","T.POINTS");
                System.out.println();
                System.out.println("----------------------------------------------------------");
                for (Integer name : r.getDriverList().keySet()) {
                    String key = name.toString();
                    Driver value = r.getDriverList().get(name);
                    String dName = value.getName();
                    System.out.format("%10s %10s %10s %10s %10s",dName, value.getLocation(),value.getTeam(),key,value.getTotalPoints());
                    System.out.println();
                }
                System.out.println("----------------------------------------------------------");
            }

        }

    }


    /*
     * This Method for display all the Added Races.
     */

    public static void displayAllAddedRaces() {

        if (raceList.isEmpty()){
            System.out.println("\nNo Any Added Races Found!\nAdd Races and Try Again!");
        }
        else {
        Formula1ChampionshipManager f = new Formula1ChampionshipManager();

        for (Race r : f.raceList) {
            System.out.println("\n----------------------- RACE DATE ------------------------");
            System.out.println("               "+r.getDate()+"           ");
            System.out.println("\n------------------ Participated Drivers ------------------");
            System.out.println("----------------------------------------------------------");
            System.out.printf("%10s %10s %10s %10s %10s", "NAME", "LOCATION", "TEAM","POSITION","T.POINTS");
            System.out.println();
            System.out.println("----------------------------------------------------------");
            for (Integer name : r.getDriverList().keySet()) {
                String key = name.toString();
                Driver value = r.getDriverList().get(name);
                String dName = value.getName();
                System.out.format("%10s %10s %10s %10s %10s",dName, value.getLocation(),value.getTeam(),key,value.getTotalPoints());
                System.out.println();
            }
            System.out.println("----------------------------------------------------------");
        }

        }

    }



    /*
     * This Method for Saving in a file of all the information.
     */

    public static void savingFile(File fileName1)  {
        FileOutputStream fos1;
        ObjectOutputStream oos1;

        if (!fDriver.isEmpty() || !raceList.isEmpty()){

        try {
        fos1 = new FileOutputStream(fileName1); // create new FileOutputStream object and parse saveFilePath
        oos1 = new ObjectOutputStream(fos1);    // create new ObjectOutputStream object and parse saveDataFile

        oos1.writeObject(fDriver); // write fDriver to file
        oos1.writeObject(raceList); // write raceList to file
        oos1.flush();
        oos1.close();
        fos1.close();
        System.out.println("\nFile Saved Successfully!");

    }catch (IOException e){
            System.out.println("\nOops! Something went Wrong.");
            e.printStackTrace();
        }}
        else {
            System.out.println("\nThe User Didn't Enter any Data Yet!\nNothing to Save.");
        }
    }


    /*
     * This Method for load data from in the previous file.
     */

    public static void readingFile(File fileName1) {
        FileInputStream fis1 ;
        ObjectInputStream ois1 ;

        if (file.exists()) {

        try {
            fis1=new FileInputStream(fileName1);
            ois1= new ObjectInputStream(fis1);


            ArrayList<Driver> savedData1 = (ArrayList) ois1.readObject();
            fDriver = (ArrayList<Driver>) savedData1.clone();
            ArrayList<Driver> savedData2 = (ArrayList) ois1.readObject();
            raceList=(ArrayList<Race>) savedData2.clone();


            fis1.close();
            ois1.close();
            System.out.println("\nFile Loaded Successfully!");
        }

        catch (Exception e) {
            System.out.println("\nThe File is Empty!");
        }
        }
        else {
            System.out.println("\nNo Saved Data Found!");
        }

    }


    /*
     * This Method for clear all saved data in the previous file.
     */

    public static void clearFileData() {
        try (PrintWriter writer = new PrintWriter("data/dataFile.txt")) {
            writer.print("");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\nCleared all the Information Saved in the Previous File!");
    }


    /*
     * This Method for start GUI Version.
     */

    public static void startGUI(){

        new Formula1ChampionshipManagerGUI();
        System.out.println("\nStarting GUI Version of Championship Manager...");
    }





    /*
     * This Method for search for all races that a given driver participated.
     */

    public int driverSearch(String name){

        if (fDriver.isEmpty()) {
            System.out.println("\n\nFormula 1 Table is Empty therefore Can't Show any Drivers!");
            return -2;

        }else{
            for (Driver driver : fDriver) {
                if (driver.getName().equals(name)) {
                        return fDriver.indexOf(driver);
                }
            }

        }
        return  -1;
    }



}














