import java.util.Scanner;
 
public class PrimeMultiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int k= sc.nextInt();
        long[] arr=new long[k];
        for(int i=0;i<k;i++){
            arr[i]= sc.nextLong();
        }
        long sum=0;
        for(int i=0;i<(1<<k);i++){
            long fact=1;
            long count=0;
            for(int j=0;j<k;j++){
                if(((1<<j) & i) !=0){
 
                    if(fact>n/arr[j]){
                        fact=n+1;
                        break;
                    }
                    fact*=arr[j];
                    count++;
                }
            }
            if(fact<=n){
                if ((count & 1)==1) {
                    //System.out.println(fact + " om ");
                    sum += n / fact;
                } else if (count != 0) {
                    //System.out.println(fact);
                    sum -= n / fact;
                }
            }
        }
        System.out.println(sum);
    }
}
