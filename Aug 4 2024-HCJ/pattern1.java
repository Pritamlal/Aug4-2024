import java.util.Scanner;

public class pattern1{
    public static void main(String[] args){
        int num,i,j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number::");
        num = sc.nextInt();

        for(i=1;i<=num;i++){

            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(j=i;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        for(i=num-1;i>=0;i--){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=i;j<=num-1;j++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }

    }
}