import java.util.Scanner;

public class hargaBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("jumlah item yang dibeli");
        int jumlah = input.nextInt();

        int i = 1;
        int harga = 0;
        int jumlahBarang = 0;
        int total = 0;
        while (jumlah >= i){
            System.out.println(i + "." +"nama barang: ");
            String namaBarang = input.next();

            System.out.println(i + "." + "harga: ");
            harga = input.nextInt();

            System.out.println(i + "." + "jumlah: ");
            jumlahBarang = input.nextInt();
            System.out.println("==");

            total += harga * jumlahBarang;
            i++;
        }

        System.out.println("jumlah item yang dibeli: "+jumlah );
        System.out.println("total pembelian: "+total );

    }
}
