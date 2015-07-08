/**
 * Created by arun on 1/7/15.
 */
public class FizzBizz {
    public static void main(String[] args) {
        int i,n;
        n=100;
        FizzBuzz(n);
    }

    private static void FizzBuzz(int n) {
        int i;
        for(i=1;i<=n;i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }
    }
}
