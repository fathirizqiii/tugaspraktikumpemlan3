package pemlantugas3;

public class Baju {
    String jenis;
    final int harga;

    Baju (String jenis, int harga) {
        this.jenis = jenis;
        this.harga = harga;
    }
    void belibaju (int jumlah) {
        System.out.println("Anda membeli " + jumlah + " baju jenis " + jenis + " dengan harga satuan " + harga);

        if (jumlah > 100) {
            System.out.println("Anda mendapat potongan karena pembelian lebih dari 100 pcs");
            System.out.print("Total pembayaran anda adalah ");
            if (harga > 150000)
                System.out.println((harga - 15000) * jumlah);
            else
                System.out.println((harga - 5000) * jumlah);
        } else {
            System.out.print("Total pembayaran anda adalah ");
            System.out.println(harga * jumlah);
        }
    }
}