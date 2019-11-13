import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=1,k=1;
        while (i<=n){
            System.out.print(i+"\t");
            i=i+k;
            k++;
        }
        System.out.print(i);
        System.out.println();

        i=1;
        while (i<=n+1){
            for (int j=1;j<=i;j++) {
                System.out.print(i+"\t");
            }
            i++;
            }
        }
    }
