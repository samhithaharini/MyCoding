import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int o=n;
        while(n!=1 && n!=4){
            n=hpy(n);
        }
        if(n==1){
            System.out.println(o+" is happy number..");
        }else{
            System.out.println(o+" is not happy number..");
        }
    }
    public static int hpy(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s+=d*d;
            n/=10;
        }
        return s;
    }

}
