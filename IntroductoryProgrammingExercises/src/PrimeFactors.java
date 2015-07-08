import java.util.ArrayList;

/**
 * Created by arun on 1/7/15.
 */
public class PrimeFactors {
    public static void main(String[] args) {
        int i, n, k, j;
        ArrayList primeNoList=new ArrayList();
        ArrayList primeFactorList=new ArrayList();

        n = 30;
        primeNoList=primeNumberGenerator(n);
        for(i=0;i<primeNoList.size();i++){
            if(n%(int)primeNoList.get(i)==0)
                primeFactorList.add(primeNoList.get(i));
        }
        System.out.println(primeFactorList);
    }

    private static ArrayList primeNumberGenerator(int number) {
        ArrayList prime=new ArrayList();
        boolean test;
        for (int i = 3; i <= number; i++) {
            test=true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){

                    test=false;
                    break;
                }
            }
            if(i==3)
                prime.add(i-1);
            if(test==true){
                prime.add(i);
            }
        }
        return prime;
    }
}
