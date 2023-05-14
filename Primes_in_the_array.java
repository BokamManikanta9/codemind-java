import java.util.*;

public class primesinarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0, dc = 0, j;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    c++;
                }
            }
            j = 1;
            if (c == 2) {
                dc++;
            }
            c = 0;
        }
        System.out.println(dc);
}
}