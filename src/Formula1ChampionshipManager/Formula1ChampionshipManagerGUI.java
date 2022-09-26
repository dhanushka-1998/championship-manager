package Formula1ChampionshipManager;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



/*
 * This Method for Championship Manager GUI Version
 */

public class Formula1ChampionshipManagerGUI extends JFrame {

    //Creating JFrame
    JFrame frame1=new JFrame();


    //Image icon in JFrame
    Image icon = Toolkit.getDefaultToolkit().getImage("src/Formula1ChampionshipManager/res/icon.png");
    //Image icon in middle of JFrame
    ImageIcon imageIcon = new ImageIcon("src/Formula1ChampionshipManager/res/sport.png");
    //Image icon in Right side of JFrame
    ImageIcon imageIcon2 = new ImageIcon("src/Formula1ChampionshipManager/res/award.png");
    //Image icon in Left side of JFrame
    ImageIcon imageIcon3 = new ImageIcon("src/Formula1ChampionshipManager/res/formula.png");


    //Adding icon images to Labels
    JLabel labelImage1 = new JLabel(imageIcon);
    JLabel labelImage2 = new JLabel(imageIcon2);
    JLabel labelImage3 = new JLabel(imageIcon3);


    //Creating font and Customizing fonts of labels and buttons
    Font fnt1 = new Font("Arial",Font.BOLD,30);
    Font fnt2 = new Font("Arial",Font.BOLD,13);
    Font fnt4 = new Font("Arial",NORMAL,15);
    Font fnt3 = new Font("Arial",Font.BOLD,13);


    //Creating Labels and Customizing labels
    JLabel label1=new JLabel("Championship Manager");
    JLabel label2=new JLabel("to Display the Statistics in Descending Order of Points");
    JLabel label3=new JLabel("to Display the Statistics in Ascending Order of Point Won by Drivers");
    JLabel label4=new JLabel("to Display the Statistics in Descending Order of Largest Number of First Position Won in Races");
    JLabel label5=new JLabel("to Generates One Random Race with Random Positions Achieved by the Existing Drivers");
    JLabel label6=new JLabel("to Generates One Random Race with Random Positions Achieved by the Existing Drivers with New Modifications");
    JLabel label7=new JLabel("to Display the Statistics in Ascending Order of Date Played");
    JLabel label8=new JLabel("to Search for all Races that a Given Driver Participated");
    JLabel label9=new JLabel();
    JLabel label10=new JLabel();


    //Creating Buttons and Customizing
    JButton button1=new JButton("Click Here");
    JButton button2=new JButton("Click Here");
    JButton button3=new JButton("Click Here");
    JButton button4=new JButton("Click Here");
    JButton button5=new JButton("Click Here");
    JButton button6=new JButton("Click Here");
    JButton button7=new JButton("Click Here");
    JButton button8=new JButton("Click Here");


    //Creating TextFiled and Customizing
    JTextField text1=new JTextField(20);




    public Formula1ChampionshipManagerGUI() {

        //Applying customization to the JFrame
        frame1.setTitle("Formula 1 Championship Manager");
        frame1.setSize(1000,720);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setLocationRelativeTo(null);
        frame1.setLayout(null);
        frame1.setResizable(false);


        //Applying customization to the Labels
        label1.setSize(500,30);
        label1.setFont(fnt1);
        label1.setLocation(330,65);

        //Applying customization to the LabelImages
        labelImage1.setLocation(300,30);
        labelImage1.setSize(400,50);

        //Applying customization to the LabelImages
        labelImage2.setLocation(860,22);
        labelImage2.setSize(80,80);

        //Applying customization to the LabelImages
        labelImage3.setLocation(55,15);
        labelImage3.setSize(120,100);

        //Applying customization to the Labels
        label2.setLocation(200,150);
        label2.setSize(800,30);
        label2.setFont(fnt2);

        //Applying customization to the Labels
        label3.setLocation(200,200);
        label3.setSize(800,30);
        label3.setFont(fnt2);

        //Applying customization to the Labels
        label4.setLocation(200,250);
        label4.setSize(800,30);
        label4.setFont(fnt2);

        //Applying customization to the Labels
        label5.setLocation(200,300);
        label5.setSize(800,30);
        label5.setFont(fnt2);

        //Applying customization to the Labels
        label6.setLocation(200,350);
        label6.setSize(800,30);
        label6.setFont(fnt2);

        //Applying customization to the Labels
        label7.setLocation(200,400);
        label7.setSize(800,30);
        label7.setFont(fnt2);

        //Applying customization to the Labels
        label8.setLocation(467,450);
        label8.setSize(800,30);
        label8.setFont(fnt2);

        //Applying customization to the Labels
        label9.setSize(1000,2);
        label9.setLocation(0,120);
        label9.setForeground(Color.BLACK);
        label9.setBackground(Color.BLACK);
        label9.setOpaque(true);

        //Applying customization to the Labels
        label10.setSize(1000,1);
        label10.setLocation(0,505);
        label10.setForeground(Color.BLACK);
        label10.setBackground(Color.BLACK);
        label10.setOpaque(true);


        //Applying customization to the Buttons
        button1.setSize(150,30);
        button1.setFont(fnt4);
        button1.setLocation(37,150);
        //Adding actions to the button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayTable1();
            }
        });

        //Applying customization to the Buttons
        button2.setSize(150,30);
        button2.setFont(fnt4);
        button2.setLocation(37,200);
        //Adding actions to the button
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayTable2();
            }
        });

        //Applying customization to the Buttons
        button3.setSize(150,30);
        button3.setFont(fnt4);
        button3.setLocation(37,250);
        //Adding actions to the button
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayTable3();
            }
        });

        //Applying customization to the Buttons
        button4.setSize(150,30);
        button4.setFont(fnt4);
        button4.setLocation(37,300);

        //Applying customization to the Buttons
        button5.setSize(150,30);
        button5.setFont(fnt4);
        button5.setLocation(37,350);

        //Applying customization to the Buttons
        button6.setSize(150,30);
        button6.setFont(fnt4);
        button6.setLocation(37,400);


        //Applying customization to the TextLabel
        text1.setSize(250,30);
        text1.setFont(fnt2);
        text1.setLocation(37,450);


        //Applying customization to the Buttons
        button7.setSize(150,30);
        button7.setFont(fnt4);
        button7.setLocation(305,450);
        //Adding actions to the button
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = text1.getText().trim().toLowerCase();
                SearchedDriverStat(name);
            }
        });




        //Adding all the component to the JFrame
        frame1.setIconImage(icon);
        frame1.add(label1);
        frame1.add(label2);
        frame1.add(label3);
        frame1.add(label4);
        frame1.add(label5);
        frame1.add(label6);
        frame1.add(label7);
        frame1.add(label8);
        frame1.add(label9);
        frame1.add(label10);
        frame1.add(button1);
        frame1.add(button2);
        frame1.add(button3);
        frame1.add(button4);
        frame1.add(button5);
        frame1.add(button6);
        frame1.add(button7);
        frame1.add(text1);
        frame1.add(labelImage1);
        frame1.add(labelImage2);
        frame1.add(labelImage3);


    }




    /*
     * This Method for Display the Formula 1 Driver Table in GUI Version by Descending order, according to the points they have in the current season.
     */

    public void displayTable1() {

        Formula1ChampionshipManager.displayDriverTable1();

        String[][] data = new String[Formula1ChampionshipManager.fDriver.size()][15];
        String[] headers = {"Name", "Team", "Location", "1st P.", "2nd P.", "3rd P.","4th P.","5th P.","6th P.","7th P.","8th P.","9th P.","10th P.","Races","Points" };

        for (int x=0; x<Formula1ChampionshipManager.fDriver.size(); x++){
            data[x][0]=Formula1ChampionshipManager.fDriver.get(x).getName();
            data[x][1]=Formula1ChampionshipManager.fDriver.get(x).getTeam();
            data[x][2]=Formula1ChampionshipManager.fDriver.get(x).getLocation();
            data[x][3]= String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getFirst());
            data[x][4]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getSecond());
            data[x][5]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getThird());
            data[x][6]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getFourth());
            data[x][7]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getFifth());
            data[x][8]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getSixth());
            data[x][9]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getSeventh());
            data[x][10]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getEighth());
            data[x][11]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getNinth());
            data[x][12]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getTenth());
            data[x][13]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getNoOfRaces());
            data[x][14]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getTotalPoints());
        }

        //Creating JTable add all the data to the table by executing displayTable1() method.
        JTable jt1=new JTable(data,headers);
        jt1.setEnabled(false);
        JScrollPane pane = new JScrollPane(jt1);
        JTableHeader header = jt1.getTableHeader();
        pane.setBounds(15,525,955,135);
        pane.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        header.setBackground(Color.getHSBColor(30,20,90));
        header.setFont(fnt3);
        frame1.add(pane);

    }


    /*
     * This Method for Display the Formula 1 Driver Table in GUI Version by Ascending order, according to the points they have in the current season.
     */

    public void displayTable2() {

        Formula1ChampionshipManager.displayDriverTable2();

        String[][] data = new String[Formula1ChampionshipManager.fDriver.size()][15];
        String[] headers = {"Name", "Team", "Location", "1st P.", "2nd P.", "3rd P.","4th P.","5th P.","6th P.","7th P.","8th P.","9th P.","10th P.","Races","Points" };

        for (int x=0; x<Formula1ChampionshipManager.fDriver.size(); x++){
            data[x][0]=Formula1ChampionshipManager.fDriver.get(x).getName();
            data[x][1]=Formula1ChampionshipManager.fDriver.get(x).getTeam();
            data[x][2]=Formula1ChampionshipManager.fDriver.get(x).getLocation();
            data[x][3]= String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getFirst());
            data[x][4]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getSecond());
            data[x][5]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getThird());
            data[x][6]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getFourth());
            data[x][7]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getFifth());
            data[x][8]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getSixth());
            data[x][9]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getSeventh());
            data[x][10]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getEighth());
            data[x][11]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getNinth());
            data[x][12]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getTenth());
            data[x][13]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getNoOfRaces());
            data[x][14]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getTotalPoints());
        }

        //Creating JTable add all the data to the table by executing displayTable2() method.
        JTable jt1=new JTable(data,headers);
        jt1.setEnabled(false);
        JScrollPane pane = new JScrollPane(jt1);
        JTableHeader header = jt1.getTableHeader();
        pane.setBounds(15,525,955,135);
        pane.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        header.setBackground(Color.getHSBColor(30,20,90));
        header.setFont(fnt3);
        frame1.add(pane);

    }


    /*
     * This Method for Display the Formula 1 Driver Table in GUI Version by Descending order, according to the largest number of first position won in races.
     */

    public void displayTable3() {

        Formula1ChampionshipManager.displayDriverTable3();

        String[][] data = new String[Formula1ChampionshipManager.fDriver.size()][15];
        String[] headers = {"Name", "Team", "Location", "1st P.", "2nd P.", "3rd P.","4th P.","5th P.","6th P.","7th P.","8th P.","9th P.","10th P.","Races","Points" };

        for (int x=0; x<Formula1ChampionshipManager.fDriver.size(); x++){
            data[x][0]=Formula1ChampionshipManager.fDriver.get(x).getName();
            data[x][1]=Formula1ChampionshipManager.fDriver.get(x).getTeam();
            data[x][2]=Formula1ChampionshipManager.fDriver.get(x).getLocation();
            data[x][3]= String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getFirst());
            data[x][4]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getSecond());
            data[x][5]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getThird());
            data[x][6]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getFourth());
            data[x][7]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getFifth());
            data[x][8]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getSixth());
            data[x][9]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getSeventh());
            data[x][10]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getEighth());
            data[x][11]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getNinth());
            data[x][12]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getTenth());
            data[x][13]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getNoOfRaces());
            data[x][14]=String.valueOf(Formula1ChampionshipManager.fDriver.get(x).getTotalPoints());
        }

        //Creating JTable add all the data to the table by executing displayTable3() method.
        JTable jt1=new JTable(data,headers);
        jt1.setEnabled(false);
        JScrollPane pane = new JScrollPane(jt1);
        JTableHeader header = jt1.getTableHeader();
        pane.setBounds(15,525,955,135);
        pane.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        header.setBackground(Color.getHSBColor(30,20,90));
        header.setFont(fnt3);
        frame1.add(pane);

    }



    /*
     * This Method for Display the Details of Searched Formula 1 Driver on GUI Version.
     */

    public void SearchedDriverStat(String name) {

        Formula1ChampionshipManager f = new Formula1ChampionshipManager();
        int x ;
        if (f.driverSearch(name) == -1){
            System.out.println("\nDriver is Not Found!");
        }else if(f.driverSearch(name) == -2){
            System.out.println("\nDriver List is Empty!");
        }
        else{

            ArrayList<Driver> list = new ArrayList<>();
            list.add(f.fDriver.get(f.driverSearch(name)));
            String[][] data = new String[1][15];
            String[] headers = {"Name", "Team", "Location", "1st P.", "2nd P.", "3rd P.","4th P.","5th P.","6th P.","7th P.","8th P.","9th P.","10th P.","Races","Points" };


            x = 0;
            data[x][0]=list.get(x).getName();
            data[x][1]=list.get(x).getTeam();
            data[x][2]=list.get(x).getLocation();
            data[x][3]= String.valueOf(list.get(x).getFirst());
            data[x][4]=String.valueOf(list.get(x).getSecond());
            data[x][5]=String.valueOf(list.get(x).getThird());
            data[x][6]=String.valueOf(list.get(x).getFourth());
            data[x][7]=String.valueOf(list.get(x).getFifth());
            data[x][8]=String.valueOf(list.get(x).getSixth());
            data[x][9]=String.valueOf(list.get(x).getSeventh());
            data[x][10]=String.valueOf(list.get(x).getEighth());
            data[x][11]=String.valueOf(list.get(x).getNinth());
            data[x][12]=String.valueOf(list.get(x).getTenth());
            data[x][13]=String.valueOf(list.get(x).getNoOfRaces());
            data[x][14]=String.valueOf(list.get(x).getTotalPoints());

            //Creating JTable add all the data to the table by executing SearchedDriverStat() method.
            JTable jt1=new JTable(data,headers);
            jt1.setEnabled(false);
            JScrollPane pane = new JScrollPane(jt1);
            JTableHeader header = jt1.getTableHeader();
            pane.setBounds(15,525,955,135);
            pane.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
            header.setBackground(Color.getHSBColor(30,20,90));
            header.setFont(fnt3);
            frame1.add(pane);
            list.clear();

        }


    }


}












