import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int count=0;
        int n=scn.nextInt();
        long res=1;
        for (int i=n;i>1;i--){
            res=res*i;
        }
        while (res%10==0){
            count++;
            res=res/10;
        }
        System.out.println(count);

    }
}