
public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10]; 
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (stok < 0){
            System.out.println("Stok tidak boleh negatif!");
            return;
        }

        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }

    public void setNamaMakanan(int id, String nama) {
    this.nama_makanan[id] = nama;
    }

    public void setHargaMakanan(int id, double harga) {
        this.harga_makanan[id] = harga;
    }

    public void setStok(int id, int stok) {
        this.stok[id] = stok;
    }
    
    public String getNamaMakanan(int id) {
        return this.nama_makanan[id];
    }

    public double getHargaMakanan(int id) {
        return this.harga_makanan[id];
    }
    
    public int getStok(int id) {
        return this.stok[id];
    }

    public void tampilMenuMakanan() {
    for (int i = 0; i <= id; i++) {
    if (!isOutOfStock(i)) {
        System.out.println( nama_makanan[i] + "[" + stok[i] + "]\tRp. " + harga_makanan[i]);
    }
    }
    }

    public boolean isOutOfStock(int id) {
    if (stok[id] == 0) {
    return true;
    } else {
    return false;
    }
    }

    public static void nextId() {
    id++;
    }

    public void pemesananMakanan(int id, int jumlah) {
        if (jumlah < 0){
            System.out.println("pesanan tidak valid");
        }
        if(stok[id] >= jumlah) {
            System.out.println("Pesanan " + nama_makanan[id] + " sebanyak " + jumlah + " berhasil!");
            stok[id] -= jumlah;
        } else {
            System.out.println("Stok " + nama_makanan[id] + " tidak cukup!");
        }
        
    }

}