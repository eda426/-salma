import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("lütfenn sayı giriniz :");
        int say=input.nextInt();

        for(int i=1;i<=say;i*=4)
        {
            System.out.println("girilen sayımızda 4 ün kuvvetleri="+i);
        }
        System.out.println();
        for(int k=1;k<=say;k*=5)
        {
            System.out.println("girilen sayımızda 5 in kuvvetleri="+k);
        }
        }
    }
