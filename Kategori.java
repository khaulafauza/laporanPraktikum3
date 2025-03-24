// Kelas buat ngatur kategori buku
class Kategori {
    private String namaKategori; // Nyimpen nama kategorinya
    private Buku[] daftarBuku; // Nyimpen daftar buku yang ada di kategori ini
    private int jumlahBuku; // Nyimpen jumlah buku yang udah masuk kategori
    
    // Constructor buat bikin kategori baru
    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarBuku = new Buku[5]; // Max 5 buku dulu biar ga terlalu banyak
        this.jumlahBuku = 0;
    }
    
    // Method buat nambahin buku ke kategori ini
    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) { // Cek masih ada slot kosong gx
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        }
    }
    
    // Method buat nampilin semua buku dalam kategori
    public void tampilkanKategori() {
        System.out.println("\nKategori " + namaKategori);
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("| %-30s | %-30s | %-20s | %-50s |%n", "Judul Buku", "Penulis", "Kategori", "Sinopsis");
        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].tampilkanInfo(); // Panggil method dari class Buku
        }
        System.out.println("----------------------------------------------------------------------------\n");
    }
}