/**
 * Created by arun on 1/7/15.
 */
public class Isosceles {
    public static void main(String[] args) {
        int i, j,k, n;
        n = 3;
        for (i = 0; i < n; i++) {
            for (j = i; j <n-1; j++)
                System.out.print(" ");
            for (k =0 ; k<=2*i ; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
