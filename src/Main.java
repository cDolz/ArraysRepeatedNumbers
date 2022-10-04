import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[10];
        int j = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Dime un numero ");
            a[i] = sc. nextInt();
        }
        for (int i = 1; i < a.length; i++) {
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]){
                    System.out.println("El numero " + a[i] + " se repite");
                }
            }
        }
    }
}