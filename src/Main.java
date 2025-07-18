import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sayılar kullanıcıdan alınmıyor, sabit veriliyor
        int A = 10;
        int B = 2;
        int C = 3;

        // İşlem: A + B * C - B
        int sonuc = A + B * C - B;

        // Sonucu ekrana yazdır
        System.out.println("İşlem: A + B * C - B");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C);
        System.out.println("İşlemin sonucu: " + sonuc);

        scanner.close();
    }
}
