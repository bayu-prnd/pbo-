class BankMandiri extends Bank {
    
    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga dari Mandiri adalah : 5%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "Mandiri";
        int biaya = hitungBiaya(bankTujuan);
        System.out.println("Transfer RP" + jumlah + " ke rekening " + rekeningTujuan + " di bank: " + bankTujuan + " | Biaya: Rp" + biaya);
    }

    @Override
    int hitungBiaya(String bankTujuan) {
        return 5000;
    }
}