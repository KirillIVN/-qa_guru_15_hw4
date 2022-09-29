package topmail.kz;

public class LessonSecond {
    public static void main(String[] args) {
        //overflow for integer and byte numbers
        int minInt = -2147483648;
        int maxInt = 2147483647;
        byte minByte = -128;
        byte maxByte = 127;
        minByte -= 8;
        maxByte += 8;

        System.out.println("overflow IntNumber = " + (minInt - 1));
        System.out.println("overflow IntNumber = " + (maxInt + 1));
        System.out.println("overflow byteNumber = " + minByte);
        System.out.println("overflow byteNumber = " + maxByte);
    }
}
