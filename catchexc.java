import java.util.*;

public class catchexc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        try {
            if (a < 0) {
                throw new Exception("this is  a neagtive number");
            }
            System.out.println(a);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }

}