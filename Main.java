import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println("==========================================");

        System.out.println("Donat dengan lubang");
        System.out.println("==========================================");
        System.out.print("Isikan Radius   : ");
        double R = input.nextDouble(); // contoh: 7
        System.out.print("Isikan radius   : ");
        double r = input.nextDouble(); // contoh: 3.5

        DonatLubang dl = new DonatLubang(R, r);
        System.out.println("==========================================");
        dl.tampilInfo();

        System.out.println("==========================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("==========================================");
        System.out.print("Isikan radius   : ");
        double r2 = input.nextDouble(); // contoh: 21

        DonatBulat db = new DonatBulat(r2);
        System.out.println("==========================================");
        db.tampilInfo();

        System.out.println("==========================================");
    }
}
