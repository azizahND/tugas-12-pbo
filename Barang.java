class Barang implements Pembayaran {
    public String kodeBarang;  // Tambahkan atribut kodeBarang
    public String namaBarang;
    public double harga;
    public int jumlahBeli;

    public Barang(String kodeBarang, String namaBarang, double harga, int jumlahBeli) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    @Override
    public double hitungTotalBayar() {
        return harga * jumlahBeli;
    }

    @Override
    public String toString() {
        return "Kode Barang: " + kodeBarang + ", Nama Barang: " + namaBarang + ", Harga: " + harga + ", Jumlah Beli: " + jumlahBeli;
    }
}
