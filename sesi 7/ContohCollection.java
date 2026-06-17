import java.util.ArrayDeque;
import java.util.ArrayList;

public class ContohCollection {
    public static void main(String[] args) {
        
        System.out.println("=== Contoh ArrayList ===");
        ArrayList<String> daftarDosen = new ArrayList<>();
        daftarDosen.add("Pak Budi");
        daftarDosen.add("Bu Ani");
        daftarDosen.add("Pak Cipto");
        
        System.out.println("Isi ArrayList: " + daftarDosen);
        System.out.println("Dosen indeks ke-1: " + daftarDosen.get(1));
        
        System.out.println("\n=== Contoh ArrayDeque ===");
        ArrayDeque<Integer> antreanNomor = new ArrayDeque<>();
        antreanNomor.add(2); // Tambah elemen
        antreanNomor.addFirst(1);
        antreanNomor.addLast(3);
        
        System.out.println("Isi ArrayDeque: " + antreanNomor);
        System.out.println("Ambil & Hapus elemen pertama: " + antreanNomor.pollFirst());
        System.out.println("Sisa ArrayDeque: " + antreanNomor);
    }
}