public class Exception1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            // Mengubah indeks 5 menjadi 4 karena batas maksimal array dengan panjang 5 adalah indeks 4
            a[4] = 100; 
            System.out.println("Data berhasil dimasukkan!");
        }
        catch (Exception e) {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}