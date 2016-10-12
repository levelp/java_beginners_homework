public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeap(1000) == false);
        System.out.println(isLeap(1600) == true);
        System.out.println(isLeap(2000) == true);
        System.out.println(isLeap(2012) == true);
        System.out.println(isLeap(2011) == false);

    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
