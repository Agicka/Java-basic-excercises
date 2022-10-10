public class PrintDayInWord_A {
    public static void main(String[] args) {
        int number = 5;

        if (number == 0) {
            System.out.println("SUNDAY");
        } else if (number == 1) {
            System.out.println("MONDAY");
        } else if (number == 2) {
            System.out.println("TUESDAY");
        } else if (number == 3) {
            System.out.println("WEDNESDAY");
        } else if (number == 4) {
            System.out.println("THURSDAY");
        } else if (number == 5) {
            System.out.println("FRIDAY");
        } else if (number == 6) {
            System.out.println("SATURDAY");
        } else {
            System.out.println("Not a valid day");
        }
    }
}
