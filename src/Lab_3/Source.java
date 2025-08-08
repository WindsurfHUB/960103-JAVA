package Lab_3;

public class Source {
    public static void main(String[] arg) {
        int count = 0;
        while (count < 5) {
            System.out.print((char) ('A' + count));
            count++;
        }
        System.out.println();
    }
}

