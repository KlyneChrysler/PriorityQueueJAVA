import java.util.Scanner;

public class PQ {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean runner = true;
        int startingNumberAdmission = 100;
        int startingNumberRegistrar = 100;
        int startingNumberTreasury = 100;
        int startingNumberHelpdesk = 100;
        int startingNumberScholarship = 100;
        int startingNumberAdmission2 = 100;
        int startingNumberRegistrar2 = 100;
        int startingNumberTreasury2 = 100;
        int startingNumberHelpdesk2 = 100;
        int startingNumberScholarship2 = 100;
        int endingNumber = 300;
        char forMainMenu = 'R';
        char forMainMenu2 = 'S';
        char forMainMenu3 = 'P';
        char forMenu = 'A';
        char forMenu2 = 'R';
        char forMenu3 = 'T';
        char forMenu4 = 'H';
        char forMenu5 = 'S';
        char forMenu6 = 'E';

        while (runner) {
            System.out.println("+-----------------------------------------+");
            System.out.println("|      GET YOUR PRIORITY TICKET HERE      |");  
            System.out.println("+-----------------------------------------+");
            System.out.println("|  +---------+    +--------------------+  |");
            System.out.println("|  | REGULAR |    | SENIOR CITIZEN/PWD |  |");
            System.out.println("|  +---------+    +--------------------+  |");
            System.out.println("+-----------------------------------------+");
            System.out.print("-> ");
            char choiceForMainMenu = scan.next().charAt(0);
            char correctionForMainMenu = Character.toUpperCase(choiceForMainMenu);

            if ( correctionForMainMenu == forMainMenu ) {
                System.out.println("+-----------------------------------------+");
                System.out.println("|   +-----------+       +------------+    |");
                System.out.println("|   | ADMISSION |       | HELP DESK  |    |");
                System.out.println("|   +-----------+       +------------+    |");
                System.out.println("|   +-----------+       +-------------+   |");
                System.out.println("|   | REGISTRAR |       | SCHOLARSHIP |   |");
                System.out.println("|   +-----------+       +-------------+   |");
                System.out.println("|   +----------+        +------+          |");
                System.out.println("|   | TREASURY |        | EXIT |          |");
                System.out.println("|   +----------+        +------+          |");
                System.out.println("+-----------------------------------------+");
                System.out.print("-> ");
                char choiceForMenu = scan.next().charAt(0);
                char correctionForMenu = Character.toUpperCase(choiceForMenu);

                if ( correctionForMenu == forMenu ) {
                    System.out.println("+------+");
                    System.out.println("| A" + startingNumberAdmission + " |");
                    System.out.println("+------+");
                    startingNumberAdmission++;

                    if ( startingNumberAdmission > endingNumber ) {
                        startingNumberAdmission = 100;
                    }
                } else if ( correctionForMenu == forMenu2 ) {
                    System.out.println("+------+");
                    System.out.println("| R" + startingNumberRegistrar + " |");
                    System.out.println("+------+");
                    startingNumberRegistrar++;

                    if ( startingNumberRegistrar > endingNumber ) {
                        startingNumberRegistrar = 100;
                    }
                } else if ( correctionForMenu == forMenu3 ) {
                    System.out.println("+------+");
                    System.out.println("| T" + startingNumberTreasury+ " |");
                    System.out.println("+------+");
                    startingNumberTreasury++;

                    if ( startingNumberTreasury > endingNumber ) {
                        startingNumberTreasury = 100;
                    }
                } else if ( correctionForMenu == forMenu4 ) {
                    System.out.println("+------+");
                    System.out.println("| H" + startingNumberHelpdesk + " |");
                    System.out.println("+------+");
                    startingNumberHelpdesk++;

                    if ( startingNumberHelpdesk > endingNumber ) {
                        startingNumberHelpdesk = 100;
                    }
                } else if ( correctionForMenu == forMenu5 ) {
                    System.out.println("+------+");
                    System.out.println("| S" + startingNumberScholarship + " |");
                    System.out.println("+------+");
                    startingNumberScholarship++;

                    if ( startingNumberScholarship > endingNumber ) {
                        startingNumberScholarship = 100;
                    }
                } else if ( correctionForMenu == forMenu6 ) {
                    System.out.println("+------+");
                    System.out.println("| EXIT |");
                    System.out.println("+------+");
                    return;
                } else {
                    System.out.println("+----------------+");
                    System.out.println("| INVALID CHOICE |");
                    System.out.println("+----------------+");
                }
            } else if ( correctionForMainMenu == forMainMenu2 || correctionForMainMenu == forMainMenu3 ) {
                System.out.println("+-----------------------------------------+");
                System.out.println("|   +-----------+       +------------+    |");
                System.out.println("|   | ADMISSION |       | HELP DESK  |    |");
                System.out.println("|   +-----------+       +------------+    |");
                System.out.println("|   +-----------+       +-------------+   |");
                System.out.println("|   | REGISTRAR |       | SCHOLARSHIP |   |");
                System.out.println("|   +-----------+       +-------------+   |");
                System.out.println("|   +----------+        +------+          |");
                System.out.println("|   | TREASURY |        | EXIT |          |");
                System.out.println("|   +----------+        +------+          |");
                System.out.println("+-----------------------------------------+");
                System.out.print("-> ");
                char choiceForMenu2 = scan.next().charAt(0);
                char correctionForMenu2 = Character.toUpperCase(choiceForMenu2);
    
                if ( correctionForMenu2 == forMenu ) {
                    System.out.println("+----------+");
                    System.out.println("| S/P-A" + startingNumberAdmission2 + " |");
                    System.out.println("+----------+");
                    startingNumberAdmission2++;
    
                    if ( startingNumberAdmission2 > endingNumber ) {
                        startingNumberAdmission2 = 100;
                    }   
                } else if ( correctionForMenu2 == forMenu2 ) {
                    System.out.println("+----------+");
                    System.out.println("| S/P-R" + startingNumberRegistrar2 + " |");
                    System.out.println("+----------+");
                    startingNumberRegistrar2++;
    
                    if ( startingNumberRegistrar2 > endingNumber ) {
                        startingNumberRegistrar2 = 100;
                    }
                } else if ( correctionForMenu2 == forMenu3 ) {
                    System.out.println("+----------+");
                    System.out.println("| S/P-T" + startingNumberTreasury2 + " |");
                    System.out.println("+----------+");
                    startingNumberTreasury2++;
    
                    if ( startingNumberTreasury2 > endingNumber ) {
                        startingNumberTreasury2 = 100;
                    }
                } else if ( correctionForMenu2 == forMenu4 ) {
                    System.out.println("+----------+");
                    System.out.println("| S/P-H" + startingNumberHelpdesk2 + " |");
                    System.out.println("+----------+");
                    startingNumberHelpdesk2++;
    
                    if ( startingNumberHelpdesk2 > endingNumber ) {
                        startingNumberHelpdesk2 = 100;
                    }
                } else if ( correctionForMenu2 == forMenu5 ) {
                    System.out.println("+----------+");
                    System.out.println("| S/P-S" + startingNumberScholarship2 + " |");
                    System.out.println("+----------+");
                    startingNumberScholarship2++;
    
                    if ( startingNumberScholarship2 > endingNumber ) {
                        startingNumberScholarship2 = 100;
                    }
                } else if ( correctionForMenu2 == forMenu6 ) {
                    System.out.println("+------+");
                    System.out.println("| EXIT |");
                    System.out.println("+------+");
                    return;
                } else {
                    System.out.println("+----------------+");
                    System.out.println("| INVALID CHOICE |");
                    System.out.println("+----------------+");
                }
            }
        }
    }
}