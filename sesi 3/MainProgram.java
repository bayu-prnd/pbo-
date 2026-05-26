import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            NilaiMahasiswa mhs = new NilaiMahasiswa();

            System.out.print("Masukkan NIM  : ");
            String nim = input.nextLine();

            System.out.print("Masukkan Nama : ");
            String nama = input.nextLine();

            System.out.print("Masukkan Nilai: ");
            int nilai = input.nextInt();

            mhs.inputData(nim, nama);
            mhs.setNilai(nilai);

            System.out.println("\n===== DATA MAHASISWA =====");

            mhs.tampilData();
            mhs.tampilNilai();
        }
    }
}