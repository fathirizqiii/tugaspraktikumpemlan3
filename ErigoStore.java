package pemlantugas3;
import java.util.*;

public class ErigoStore {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        Baju A = new Baju("A", 100000);
        Baju B = new Baju("B", 125000);
        Baju C = new Baju("C", 175000);

        System.out.println("Welcome to Erigo\n");
        System.out.println("List baju kami : ");
        System.out.println("Baju " + A.jenis + " harga = " + A.harga);
        System.out.println("Baju " + B.jenis + " harga = " + B.harga);
        System.out.println("Baju " + C.jenis + " harga = " + C.harga + "\n");

        System.out.print("Masukkan jenis baju yang ingin anda beli = ");
        String jenis = input.next();

        if (jenis.equalsIgnoreCase("A")) {
            System.out.print("Masukkan jumlah yang ingin anda beli = ");
            int jumlah = input.nextInt();
            System.out.println();

            A.belibaju(jumlah);
        }
        else if (jenis.equalsIgnoreCase("B")) {
            System.out.print("Masukkan jumlah yang ingin anda beli = ");
            int jumlah = input.nextInt();
            System.out.println();

            B.belibaju(jumlah);
        }
        else if (jenis.equalsIgnoreCase("C")) {
            System.out.print("Masukkan jumlah yang ingin anda beli = ");
            int jumlah = input.nextInt();
            System.out.println();

            C.belibaju(jumlah);
        }
    }
}