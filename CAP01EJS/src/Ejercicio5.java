public class Ejercicio5 {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
    public static void main(String[] args) {
        System.out.println("=======================================================================");
        System.out.printf("|%-11s|%21s|%21s|%24s|%21s|%21s|%n",WHITE_BOLD+"Horas/Dias "+RESET,CYAN_BOLD+"Lunes"+RESET,CYAN_BOLD+"Martes"+RESET,CYAN_BOLD+"Miércoles"+RESET,CYAN_BOLD+"Jueves"+RESET,CYAN_BOLD+"Viernes"+RESET);
        System.out.println("=======================================================================");
        System.out.printf("|%-10s|%21s|%21s|%24s|%21s|%21s|%n", WHITE_BOLD+"09:15-10:15"+RESET,RED_BOLD+"PROGR"+RESET,YELLOW_BOLD+"LMSGI"+RESET,YELLOW_BOLD+"LMSGI"+RESET,RED_BOLD+"PROGR"+RESET,PURPLE_BOLD+"FOL"+RESET);
        System.out.printf("|%-10s|%21s|%21s|%24s|%21s|%21s|%n", WHITE_BOLD+"09:15-10:15"+RESET,RED_BOLD+"PROGR"+RESET,YELLOW_BOLD+"LMSGI"+RESET,YELLOW_BOLD+"LMSGI"+RESET,RED_BOLD+"PROGR"+RESET,PURPLE_BOLD+"FOL"+RESET);
        System.out.printf("|%-10s|%21s|%21s|%24s|%21s|%21s|%n", WHITE_BOLD+"10:15-11:15"+RESET,RED_BOLD+"PROGR"+RESET,BLUE_BOLD+"BADAT"+RESET,RED_BOLD+"PROGR"+RESET,RED_BOLD+"PROGR"+RESET,PURPLE_BOLD+"FOL"+RESET);
        System.out.println("=======================================================================");
        System.out.printf("|%-10s|%21s|%21s|%24s|%21s|%21s|%n", WHITE_BOLD+"11:15-11:45"+RESET,CYAN_BOLD+"R"+RESET,RED_BOLD+"E"+RESET,BLUE_BOLD+"CR"+RESET,YELLOW_BOLD+"E"+RESET,PURPLE_BOLD+"O"+RESET);
        System.out.println("=======================================================================");
        System.out.printf("|%-10s|%21s|%21s|%24s|%21s|%21s|%n", WHITE_BOLD+"11:45-12:45"+RESET,GREEN_BOLD+"SIINF"+RESET,BLUE_BOLD+"BADAT"+RESET,RED_BOLD+"PROGR"+RESET,BLUE_BOLD+"BADAT"+RESET,GREEN_BOLD+"SIINF"+RESET);
        System.out.printf("|%-10s|%21s|%21s|%24s|%21s|%21s|%n", WHITE_BOLD+"12:45-13:45"+RESET,GREEN_BOLD+"SIINF"+RESET,CYAN_BOLD+"ENDES"+RESET,BLUE_BOLD+"BADAT"+RESET,BLUE_BOLD+"BADAT"+RESET,GREEN_BOLD+"SIINF"+RESET);
        System.out.printf("|%-10s|%21s|%21s|%24s|%21s|%21s|%n", WHITE_BOLD+"13:45-14:45"+RESET,GREEN_BOLD+"SIINF"+RESET,CYAN_BOLD+"ENDES"+RESET,BLUE_BOLD+"BADAT"+RESET,CYAN_BOLD+"ENDES"+RESET,GREEN_BOLD+"SIINF"+RESET);
        System.out.println("=======================================================================");
    }
}
