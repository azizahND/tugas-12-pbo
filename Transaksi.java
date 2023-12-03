class Transaksi implements Pembayaran {
    private static int counter = 1;
    private String noFaktur;
    private String namaPelanggan;
    private String hp;
    private String alamat;
    private Pembayaran[] barang;

    public Transaksi(String namaPelanggan, String hp, String alamat, Pembayaran[] barang) {
        this.noFaktur = "F" + counter++;
        this.namaPelanggan = namaPelanggan;
        this.hp = hp;
        this.alamat = alamat;
        this.barang = barang;
    }

    @Override
    public double hitungTotalBayar() {
        double total = 0;
        for (Pembayaran item : barang) {
            total += item.hitungTotalBayar();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("No Faktur: " + noFaktur + ", Nama Pelanggan: " + namaPelanggan +
                "\nNo HP: " + hp + ", Alamat: " + alamat + "\nBarang:");

        for (Pembayaran item : barang) {
            result.append("\n").append(item);
        }

        result.append("\nTotal Bayar: ").append(hitungTotalBayar());
        return result.toString();
    }
}