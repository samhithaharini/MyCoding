import java.util.Scanner;
public class Neitherdivisible2nor5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0 && n%5!=0){
            System.out.println(n+" is neither divisible by 5 nor 2.");
        }else if(n%2==0 || n%5==0){
            System.out.println(n+" is either divisible by 5 or 2.");
        }
        else{
            System.out.println("Not..");
        }
    }
}
