//n треугольное число
import java.util.Scanner;
public class programm {
public static void main(String[] args) {
    System.out.println("Введите положительное число: ");
    Scanner Scanner = new Scanner(System.in);
    int input = Scanner.nextInt();
    boolean b = true;
    for (int P = 2; P <= input; P++) {
        for (int i = 2; i < P; i++) {
            if (P % i == 0) {
                b = false;
                break;
            }
        }
        if (b) System.out.println(P);
        else b = true;
    }
} 
}