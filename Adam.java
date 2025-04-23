import java.util.Scanner;
public class Adam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int aa=a*a;
        int bb=b*b;
        int r=0;
        while(bb>0){
            int d=bb%10;
            r=r*10+d;
            bb/=10;
        }
        if(aa==r){
            System.out.println(a +" and "+b+" is Adam Number..");
        }else{
            System.out.println("Not..");
        }
    }
}
