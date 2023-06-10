import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {

        double n1, n2, n3;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number:");
        n1 = input.nextDouble();

        System.out.print("Please enter second number: ");
        n2 = input.nextDouble();

        System.out.print("Please enter third number: ");
        n3 = input.nextDouble();

        if (n1<n2 && n1<n3){
            if (n2<n3) {
                System.out.println("n1<n2<n3");
            }else  {
                System.out.println("n1<n3<n2");
            }
        }else if (n2<n1 && n2<n3){
            if (n1<n3){
                System.out.println("n2<n1<n3");
            }else {
                System.out.println("n2<n3<n1");
            }
        }else if (n3<n1 && n3<n2){
            if (n1<n2){
                System.out.println("n3<n1<n2");
            }else {
                System.out.println("n3<n2<n1");
            }
        }
    }
}
