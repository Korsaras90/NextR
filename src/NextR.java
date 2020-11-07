import java.util.Scanner;

public class NextR {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int k = in.nextInt();
        int b[] = new int[n];

        int v = 0;
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
            if (b[i] >= b[k - 1]) {
                v++;
            }
        }


        System.out.println(v);
    }
}

