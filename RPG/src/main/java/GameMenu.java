public class GameMenu {
    public static void main(String[] args) {


        System.out.println("                                            ");

        System.out.println("Choose character");

        System.out.println("                                            ");

        int MenuSelector;

        System.out.println("============================");
        System.out.println("|          SWINGY !!!!     |");
        System.out.println("============================");
        System.out.println("|  Options:                 |");
        System.out.println("|         1. Option 1       |");
        System.out.println("|         2. Option 2       |");
        System.out.println("|         3. Exit           |");
        System.out.println("=============================");
        MenuSelector = Keyin.inInt("Select Option");

    switch (MenuSelector) {

            case 1:
                System.out.println("Option 1 selected");
                break;
        }
    }

    static class Keyin{
        public static void printPrompt(String prompt){
            System.out.print(prompt + " ");
                System.out.flush();
            }
            public static void inputFlush(){
            int dummy;
            int bAvail;

                try {
                    while ((System.in.available()) != 0)
                        dummy = System.in.read();
                } catch (java.io.IOException e) {
                    System.out.println("Input error");
                }
            }
        public static String inString(String prompt) {
            inputFlush();
            printPrompt(prompt);
            return inString();
        }

        public static String inString() {
            int aChar;
            String s = "";
            boolean finished = false;

            while (!finished) {
                try {
                    aChar = System.in.read();
                    if (aChar < 0 || (char) aChar == '\n')
                        finished = true;
                    else if ((char) aChar != '\r')
                        s = s + (char) aChar; // Enter into string
                }

                catch (java.io.IOException e) {
                    System.out.println("Input error");
                    finished = true;
                }
            }
            return s;
        }

        public static int inInt(String prompt) {
            while (true) {
                inputFlush();
                printPrompt(prompt);
                try {
                    return Integer.valueOf(inString().trim()).intValue();
                }

                catch (NumberFormatException e) {
                    System.out.println("Invalid input. Not an integer");
                }
            }
        }

        public static char inChar(String prompt) {
            int aChar = 0;

            inputFlush();
            printPrompt(prompt);

            try {
                aChar = System.in.read();
            }

            catch (java.io.IOException e) {
                System.out.println("Input error");
            }
            inputFlush();
            return (char) aChar;
        }

        public static double inDouble(String prompt) {
            while (true) {
                inputFlush();
                printPrompt(prompt);
                try {
                    return Double.valueOf(inString().trim()).doubleValue();
                }

                catch (NumberFormatException e) {
                    System.out
                            .println("Invalid input. Not a floating point number");
                }
            }
        }
    }







//        System.out.println("you in the forest");
//
//        String myWeapon;
//        String myArmour;
//
//        myWeapon = "Axe";
//        myArmour = "Leather";
//
//        System.out.println("Your current armour is " + myArmour);
//        System.out.println("your current weapon is " + myWeapon);
    }
