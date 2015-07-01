/**
 * Created by arun on 1/7/15.
 */
public class RightTriangle {
    public static void main(String[] args) {
        int i, j, n;
        n = 3;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
