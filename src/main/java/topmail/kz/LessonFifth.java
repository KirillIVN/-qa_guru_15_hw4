package topmail.kz;

public class LessonFifth {
    public static void main(String[] args) {
        //conditional operations
        int n = 1;
        int m = 2;

        if (n > 0 || m > 0) {
            System.out.println("One of number more than 0");
        }
        if (n > 0 && m > 0) {
            System.out.println("Both numbers more than 0");
        }
        if (n >= 2 || m == 2) {
            System.out.println("m = 2");
        }
        if (n == 1 && m <= 5) {
            System.out.println("n = 1");
        }
    }
}
