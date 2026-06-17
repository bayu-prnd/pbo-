import java.util.ArrayList;
import java.util.List;

interface DapatDitampilkan {
    void tampilkanDetail();
}

abstract class Pegawai implements DapatDitampilkan {
    private String nama;
    private String id;

    public Pegawai(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public abstract double hitungGaji();
}

class Programmer extends Pegawai {
    private double gajiPokok;
    private double bonusBugs;

    public Programmer(String nama, String id, double gajiPokok, double bonusBugs) {
        super(nama, id);
        this.gajiPokok = gajiPokok;
        this.bonusBugs = bonusBugs;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + bonusBugs;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Programmer | ID: " + getId() + " | Nama: " + getNama() + " | Total Gaji: Rp" + hitungGaji());
    }
}

class Manager extends Pegawai {
    private double gajiPokok;
    private double tunjanganJabatan;

    public Manager(String nama, String id, double gajiPokok, double tunjanganJabatan) {
        super(nama, id);
        this.gajiPokok = gajiPokok;
        this.tunjanganJabatan = tunjanganJabatan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganJabatan;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Manager    | ID: " + getId() + " | Nama: " + getNama() + " | Total Gaji: Rp" + hitungGaji());
    }
}

class DatabasePegawai<T extends Pegawai> {
    // Collection ArrayList
    private List<T> daftarPegawai = new ArrayList<>();

    public void tambahPegawai(T pegawai) {
        daftarPegawai.add(pegawai);
    }

    public void tampilkanSemuaData() {
        for (T pegawai : daftarPegawai) {
            pegawai.tampilkanDetail();
        }
    }
}

public class MainAplikasi {
    public static void main(String[] args) {
        System.out.println("=== SISTEM MANAJEMEN PEGAWAI ===");

        DatabasePegawai<Pegawai> db = new DatabasePegawai<>();

        Programmer prog1 = new Programmer("Ferdi", "PRG-001", 6000000, 1500000);
        Manager mgr1 = new Manager("Siti", "MGR-001", 9000000, 3000000);

        db.tambahPegawai(prog1);
        db.tambahPegawai(mgr1);
        db.tampilkanSemuaData();
    }
}