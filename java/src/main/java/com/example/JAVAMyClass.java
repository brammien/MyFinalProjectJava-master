package com.example;

public class JAVAMyClass {

    public static void main(String[] args) {


        //Stats for Babe Ruth, BR for babe Ruth
        int BRAB = 544; // At Bat, Number of official bats minus sacrifices, walks, hits by pitcher
        int BRR = 141; // Number of times baserunner safely reaches home plate
        int BRH = 184;//Number of times batter hits ball and reaches bases safely
        int BR2B = 33;//Number of times batter hits ball and reaches second base
        int BR3B = 9; //Number of times batter hits ball and reaches third base
        int BRHR = 46; // Number of times batter hits ball and reaches home plate scoring a run
        int BRRBI = 143;//Number of runs that score safely due to batter hitting ball and drawing a base
        int BRBB = 133; //Number of walks by batter
        int BRSO = 86; //Number of strike outs by batter
        int BRSB = 8; //Number of times bases stolen by batter


        //Stats for Ty Cobb, TC for Ty Cobb
        int TCAB = 611; // At Bat, Number of official bats minus sacrifices, walks, hits by pitcher
        int TCR = 120; // Number of times baserunner safely reaches home plate
        int TCH = 224;//Number of times batter hits ball and reaches bases safely
        int TC2B = 39;//Number of times batter hits ball and reaches second base
        int TC3B = 16; //Number of times batter hits ball and reaches third base
        int TCHR = 6; // Number of times batter hits ball and reaches home plate scoring a run
        int TCRBI = 103;//Number of runs that score safely due to batter hitting ball and drawing a base on balls
        int TCBB = 67; //Number of walks by batter
        int TCSO = 36; //Number of strike outs by batter
        int TCSB = 48; //Number of times bases stolen by batter



        //Stats for Lou Gehrig, LG for Lou Gehrig
        int LGAB = 599; // At Bat, Number of official bats minus sacrifices, walks, hits by pitcher
        int LGR = 141; // Number of times baserunner safely reaches home plate
        int LGH = 204;//Number of times batter hits ball and reaches bases safely
        int LG2B = 40;//Number of times batter hits ball and reaches second base
        int LG3B = 12; //Number of times batter hits ball and reaches third base
        int LGHR = 37; // Number of times batter hits ball and reaches home plate scoring a run
        int LGRBI = 149;//Number of runs that score safely due to batter hitting ball and drawing a base
        int LGBB = 113; //Number of walks by batter
        int LGSO = 59; //Number of strike outs by batter
        int LGSB = 8; //Number of times bases stolen by batter

        //Based on 162 game average for career

        String player;

        if (BRAB > TCAB) {
            player = "Babe Ruth " + (BRAB - TCAB);
        } else {
            player = "Ty Cobb " + (TCAB - BRAB);
        }
        System.out.println(player + " times more had at Bats on average, Number of official bats minus sacrifices, walks, hits by pitcher ");

        if (BRR > TCR) {
            player = "Babe Ruth "+ (BRR - TCR);
        } else {
            player = "Ty Cobb "+ (TCR - BRR);
        }
        System.out.println(player + " times more reaches home plate safely on average ");

        if (BRH > TCH) {
            player = "Babe Ruth "+ (BRH - TCH);
        } else {
            player = "Ty Cobb "+ (TCH - BRH);
        }
        System.out.println(player + " times more hits ball and reaches bases safely on average");

        if (BR2B > TC2B) {
            player = "Babe Ruth "+ (BR2B - TC2B);
        } else {
            player = "Ty Cobb "+ (TC2B - BR2B);
        }
        System.out.println(player + " times more hits ball and reaches second base on average");

        if (BR3B > TC3B) {
            player = "Babe Ruth "+ (BR3B - TC3B);
        } else {
            player = "Ty Cobb "+ (TC3B - BR3B);
        }
        System.out.println(player + " times more hits ball and reaches third base on average");

        if (BRHR > TCHR) {
            player = "Babe Ruth "+ (BRHR - TCHR);
        } else {
            player = "Ty Cobb "+ (TCHR - BRHR);
        }
        System.out.println(player + " times more hits ball and reaches home plate scoring a run on average");

        if (BRRBI > TCRBI) {
            player = "Babe Ruth "+ (BRHR - TCHR);
        } else {
            player = "Ty Cobb "+ (TCRBI - BRRBI);
        }
        System.out.println(player + " more RBI's on average");

        if (BRBB > TCBB) {
            player = "Babe Ruth "+ (BRBB - TCBB);
        } else {
            player = "Ty Cobb "+ (TCBB - BRBB);
        }
        System.out.println(player + " had more walks by batter on average");

        if (BRSO > TCSO) {
            player = "Babe Ruth "+ (BRSO - TCSO);
        } else {
            player = "Ty Cobb "+ (TCSO - BRSO);
        }
        System.out.println(player + " had more strike outs by batter on average");

        if (BRSB > TCSB) {
            player = "Babe Ruth "+ (BRSB - TCSB);
        } else {
            player = "Ty Cobb "+ (TCSB - BRSB);
        }
        System.out.println(player + " had more stolen bases on average");

        System.out.println();
        System.out.println();
        System.out.println("Babe Ruth Vs Ty Cobb Batting averages over career in Baseball");
        System.out.println();
        System.out.println();





        if (BRAB > LGAB) {
            player = "Babe Ruth " + (BRAB - LGAB);
        } else {
            player = "Lou Gerhrig " + (LGAB - BRAB);
        }
        System.out.println(player + " times more had at Bats on average, Number of official bats minus sacrifices, walks, hits by pitcher ");

        if (BRR > LGR) {
            player = "Babe Ruth "+ (BRR - LGR);
        } else {
            player = "Lou Gerhrig "+ (LGR - BRR);
        }
        System.out.println(player + " times more reaches home plate safely on average ");

        if (BRH > LGH) {
            player = "Babe Ruth "+ (BRH - LGH);
        } else {
            player = "Lou Gerhrig "+ (LGH - BRH);
        }
        System.out.println(player + " times more hits ball and reaches bases safely on average");

        if (BR2B > LG2B) {
            player = "Babe Ruth "+ (BR2B - LG2B);
        } else {
            player = "Lou Gerhrig "+ (LG2B - BR2B);
        }
        System.out.println(player + " times more hits ball and reaches second base on average");

        if (BR3B > LG3B) {
            player = "Babe Ruth "+ (BR3B - LG3B);
        } else {
            player = "Lou Gerhrig "+ (LG3B - BR3B);
        }
        System.out.println(player + " times more hits ball and reaches third base on average");

        if (BRHR > LGHR) {
            player = "Babe Ruth "+ (BRHR - LGHR);
        } else {
            player = "Lou Gerhrig "+ (LGHR - BRHR);
        }
        System.out.println(player + " times more hits ball and reaches home plate scoring a run on average");

        if (BRRBI > LGRBI) {
            player = "Babe Ruth "+ (BRRBI - LGRBI);
        } else {
            player = "Lou Gerhrig "+ (LGRBI - BRRBI);
        }
        System.out.println(player + " more RBI's on average");

        if (BRBB > LGBB) {
            player = "Babe Ruth "+ (BRBB - LGBB);
        } else {
            player = "Lou Gerhrig "+ (LGBB - BRBB);
        }
        System.out.println(player + " had more walks by batter on average");

        if (BRSO > LGSO) {
            player = "Babe Ruth "+ (BRSO - LGSO);
        } else {
            player = "Lou Gerhrig "+ (LGSO - BRSO);
        }
        System.out.println(player + " had more strike outs by batter on average");

        if (BRSB > LGSB) {
            player = "Babe Ruth "+ (BRSB - LGSB);
        } else {
            player = "Lou Gerhrig "+ (LGSB - BRSB);
        }
        System.out.println(player + " had more stolen bases on average");

        System.out.println();
        System.out.println();
        System.out.println("Babe Ruth Vs Lou Gerhrig Batting averages over career in Baseball");
        System.out.println();
        System.out.println();


        if (LGAB > TCAB) {
            player = "Lou Gerhrig " + (LGAB - TCAB);
        } else {
            player = "Ty Cobb " + (TCAB - LGAB);
        }
        System.out.println(player + " times more had at Bats on average, Number of official bats minus sacrifices, walks, hits by pitcher ");

        if (LGR > TCR) {
            player = "Lou Gerhrig "+ (LGR - TCR);
        } else {
            player = "Ty Cobb "+ (TCR - LGR);
        }
        System.out.println(player + " times more reaches home plate safely on average ");

        if (LGH > TCH) {
            player = "Lou Gerhrig "+ (LGH - TCH);
        } else {
            player = "Ty Cobb "+ (TCH - LGH);
        }
        System.out.println(player + " times more hits ball and reaches bases safely on average");

        if (LG2B > TC2B) {
            player = "Lou Gerhrig "+ (LG2B - TC2B);
        } else {
            player = "Ty Cobb "+ (TC2B - LG2B);
        }
        System.out.println(player + " times more hits ball and reaches second base on average");

        if (LG3B > TC3B) {
            player = "Lou Gerhrig "+ (LG3B - TC3B);
        } else {
            player = "Ty Cobb "+ (TC3B - LG3B);
        }
        System.out.println(player + " times more hits ball and reaches third base on average");

        if (BRHR > TCHR) {
            player = "Lou Gerhrig "+ (LGHR - TCHR);
        } else {
            player = "Ty Cobb "+ (TCHR - LGHR);
        }
        System.out.println(player + " times more hits ball and reaches home plate scoring a run on average");

        if (LGRBI > TCRBI) {
            player = "Lou Gerhrig "+ (LGRBI - TCRBI);
        } else {
            player = "Ty Cobb "+ (TCRBI - LGRBI);
        }
        System.out.println(player + " more RBI's on average");

        if (LGBB > TCBB) {
            player = "Lou Gerhrig "+ (LGBB - TCBB);
        } else {
            player = "Ty Cobb "+ (TCBB - LGBB);
        }
        System.out.println(player + " had more walks by batter on average");

        if (LGSO > TCSO) {
            player = "Lou Gerhrig "+ (LGSO - TCSO);
        } else {
            player = "Ty Cobb "+ (TCSO - LGSO);
        }
        System.out.println(player + " had more strike outs by batter on average");

        if (LGSB > TCSB) {
            player = "Lou Gerhrig "+ (LGSB - TCSB);
        } else {
            player = "Ty Cobb "+ (TCSB - LGSB);
        }
        System.out.println(player + " had more stolen bases on average");

        System.out.println();
        System.out.println();

        System.out.println("Lou Gerhrig Vs Ty Cobb Batting averages over career in Baseball");
    }

}
