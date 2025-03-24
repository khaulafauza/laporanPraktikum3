// Kelas buat merepresentasikan buku
class Buku {
    private String judul; // Menyimpan judul buku
    private String[] penulis; // Menyimpan daftar penulis
    private String kategori; // Menyimpan kategori buku
    private String sinopsis; // Menyimpan sinopsis buku
    
    // Constructor, buat bikin objek Buku baru
    public Buku(String judul, String[] penulis, String kategori, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.sinopsis = sinopsis;
    }
    
    // Getter buat ambil judul buku
    public String getJudul() {
        return judul;
    }
    
    // Getter buat ambil daftar penulis dalam format string
    public String getPenulis() {
        String hasil = "";
        for (int i = 0; i < penulis.length; i++) {
            hasil += penulis[i];
            if (i < penulis.length - 1) {
                hasil += ", "; // Biar penulisnya dipisah koma kalau lebih dari satu
            }
        }
        return hasil;
    }
    
    // Getter buat ambil kategori buku
    public String getKategori() {
        return kategori;
    }
    
    // Getter buat ambil sinopsis buku
    public String getSinopsis() {
        return sinopsis;
    }
    
    // Nampilin informasi buku dalam format tabel biar rapih
    public void tampilkanInfo() {
        System.out.printf("| %-30s | %-30s | %-20s | %-50s |%n", judul, getPenulis(), kategori, sinopsis);
    }
    
    // Mengitung jumlah kata dalam sinopsis
    public int hitungJumlahKataSinopsis() {
        int jumlah = 1; // Mulai dari 1 karena kata pertama gaada spasi sebelum nya
        for (int i = 0; i < sinopsis.length(); i++) {
            if (sinopsis.charAt(i) == ' ') { // Kalau ketemu spasi, berarti ada kata baru
                jumlah++;
            }
        }
        return jumlah;
    }
    
    // Cek kemiripan dua buku berdasarkan judul, kategori, dan sinopsis
    public double cekKesamaan(Buku bukuLain) {
        int kesamaan = 0;
        
        // Bandingin judul huruf per huruf
        int panjangJudul = Math.min(this.judul.length(), bukuLain.judul.length());
        for (int i = 0; i < panjangJudul; i++) {
            if (this.judul.charAt(i) == bukuLain.judul.charAt(i)) kesamaan++;
        }
    
        // Bandingin kategori huruf per huruf
        int panjangKategori = Math.min(this.kategori.length(), bukuLain.kategori.length());
        for (int i = 0; i < panjangKategori; i++) {
            if (this.kategori.charAt(i) == bukuLain.kategori.charAt(i)) kesamaan++;
        }
    
        // Bandingin sinopsis huruf per huruf
        int panjangSinopsis = Math.min(this.sinopsis.length(), bukuLain.sinopsis.length());
        for (int i = 0; i < panjangSinopsis; i++) {
            if (this.sinopsis.charAt(i) == bukuLain.sinopsis.charAt(i)) kesamaan++;
        }
    
        // Hitung total panjang yang dibandingin
        int totalPanjang = panjangJudul + panjangKategori + panjangSinopsis;
        
        return (totalPanjang > 0) ? ((double) kesamaan / totalPanjang) * 100 : 0; // Hasilnya dalam persen
    }    

    // Bikin salinan dari buku yang dipilih user
    public Buku copy() {
        return new Buku(this.judul, this.penulis, this.kategori, this.sinopsis);
    }

    // Hitung royalti dengan persentase 10%
    public double hitungRoyalti(int hargaBuku) {
        return hargaBuku * 0.1;
    }

    // Hitung royalti dengan persentase custom
    public double hitungRoyalti(int hargaBuku, double persenRoyalti) {
        return hargaBuku * (persenRoyalti / 100);
    }

    // Nampilin daftar semua buku
    public static void tampilkanDaftarBuku(Buku[] daftarBuku) {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println((i + 1) + ". " + daftarBuku[i].getJudul() + " - " + daftarBuku[i].getPenulis());
        }
    }
}