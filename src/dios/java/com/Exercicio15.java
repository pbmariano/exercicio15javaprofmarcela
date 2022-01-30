package dios.java.com;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double i=1, num1 = 0, num2 = 1, num3;
        while(i < i+1){
             i++;
             num3 = num1+num2;
             num1 = num2;
             num2 = num3;
             System.out.println(num3);
        }
    }
}
