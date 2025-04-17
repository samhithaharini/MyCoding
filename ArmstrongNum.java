import java.util.Scanner;
public class ArmstrongNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int sum=0;
        int temp=n;
        int dCount=0;
        while(temp!=0){
            temp/=10;
            dCount++;
        }
        while(n!=0){
            int r=1;
            int digit=n%10;
            for(int i=0;i<dCount;i++){
                r*=digit;
            }    
            sum=sum+r;
            n/=10;
        }
        if(sum==org){
            System.out.println(org+" is an armstrong number..");
        }else{
            System.out.println(org+" is not an armstrong number..");
        }
    }
}