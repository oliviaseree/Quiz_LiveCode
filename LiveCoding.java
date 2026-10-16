import java.util.Scanner;
public class LiveCoding {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, faktorial= 1;
        System.out.print("Masukkan nilai (0-12): ");
        n = input.nextInt();

        for ( ; n < 0 || n > 12;) {
            System.out.println("Nilai harus antara 0-12!");
            System.out.print("Masukkan nilai (0-12): ");
            n = input.nextInt(); }
        
        for (int i = n; i >= 1; i--) {
            faktorial = faktorial * (i);
        }
        System.out.println("Faktorial dari " + n + " = " + faktorial);
    }
}
