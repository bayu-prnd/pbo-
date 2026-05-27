class BankBNI extends Bank {
    
    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah : 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI";
        int biaya = hitungBiaya(bankTujuan);
        System.out.println("Transfer RP" + jumlah + " ke rekening " + rekeningTujuan + " di bank: " + bankTujuan + " | Biaya: Rp" + biaya);
    }

    @Override
    int hitungBiaya(String bankTujuan) {
        return 1500;
    }
}