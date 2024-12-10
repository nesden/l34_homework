import java.util.Scanner;

public class Average {

    public static void Average(double num1,double num2,double num3){
        double average;
        average=(num1+num2+num3)/3;
        System.out.println(average);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double n1=scanner.nextDouble();
        double n2=scanner.nextDouble();
        double n3=scanner.nextDouble();

        Average(n1,n2,n3);
    }
}
