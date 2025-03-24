import java.util.Scanner; // Import library Scanner buat input dari user

// Main Class buat jalanin program
public class Perpustakaan {
    public static void main(String[] args) {
        // Buat daftar kategori buku yang tersedia
        Kategori[] kategoriList = {
            new Kategori("1: Teknologi"),
            new Kategori("2: Filsafat"),
            new Kategori("3: Sejarah"),
            new Kategori("4: Agama"),
            new Kategori("5: Psikologi"),
            new Kategori("6: Politik"),
            new Kategori("7: Fiksi")
        };
        
        // Buat daftar buku sesuai kategori masing-masing
        Buku[][] daftarBuku = {
            // Daftar buku kategori Teknologi
            {new Buku("1. Pemrograman Java", new String[]{"James Gosling"}, "Teknologi", "Buku ini membahas tentang pemrograman Java dari dasar hingga tingkat lanjut."),
             new Buku("2. Artificial Intelligence", new String[]{"Stuart Russell", "Peter Norvig"}, "Teknologi", "Buku ini membahas tentang konsep dan penerapan teknologi kecerdasan buatan."),
             new Buku("3. Cyber Security", new String[]{"Bruce Schneier"}, "Teknologi", "Buku ini membahas tentang keamanan siber dan cara melindungi sistem."),
             new Buku("4. Big Data Analysis", new String[]{"Viktor Mayer-Schönberger"}, "Teknologi", "Buku ini membahas secara rinci tentang analisis data besar dan penerapannya."),
             new Buku("5. Cloud Computing", new String[]{"Rajkumar Buyya"}, "Teknologi", "Buku ini mengupas tuntas topik tentang komputasi awan dan manfaatnya.")},
            
             // Daftar buku kategori Filsafat
            {new Buku("1. The Republic", new String[]{"Plato"}, "Filsafat", "Buku ini berisi konsep negara ideal menurut Plato, serta ilmu filsafat lainnya."),
             new Buku("2. Beyond Good and Evil", new String[]{"Friedrich Nietzsche"}, "Filsafat", "Buku ini mengupas tuntas tentang sebuah filsafat moral Friedrich Nietzsche."),
             new Buku("3. Critique of Pure Reason", new String[]{"Immanuel Kant"}, "Filsafat", "Buku ini membahas konsep epistemologi dan metafisika dalam filsafat secara mendalam."),
             new Buku("4. Being and Time", new String[]{"Martin Heidegger"}, "Filsafat", "Buku ini menguraikan prinsip-prinsip ontologi dan pemikiran eksistensialisme manusia."),
             new Buku("5. Meditations", new String[]{"Marcus Aurelius"}, "Filsafat", "Buku ini berisi refleksi filosofis yang mendalam tentang hakikat kehidupan manusia.")},
            
             // Daftar buku kategori Sejarah
            {new Buku("1. Sapiens", new String[]{"Yuval Noah Harari"}, "Sejarah", "Buku ini membahas tentang sejarah umat manusia dari zaman purba hingga modern."),
             new Buku("2. Guns, Germs, and Steel", new String[]{"Jared Diamond"}, "Sejarah", "Buku ini membahas banyak hal tentang faktor-faktor yang membentuk peradaban manusia."),
             new Buku("3. The Silk Roads", new String[]{"Peter Frankopan"}, "Sejarah", "Buku ini membahas banyak hal tentang sejarah Jalur Sutra dan pengaruhnya."),
             new Buku("4. A People's History", new String[]{"Howard Zinn"}, "Sejarah", "Buku ini membahas banyak hal tentang sejarah Amerika dari perspektif rakyat."),
             new Buku("5. The Diary of a Young Girl", new String[]{"Anne Frank"}, "Sejarah", "Buku ini berisi tentang catatan harian Anne Frank selama Perang Dunia II.")}, 
            
             // Daftar buku kategori Agama
            {new Buku("1. Tafsir Ibnu Katsir", new String[]{"Ibnu Katsir"}, "Agama", "Buku ini menyajikan tafsir Al-Quran karya Ibnu Katsir yang komprehensif."),
             new Buku("2. The Bible", new String[]{"Various Authors"}, "Agama", "Buku ini berisi kumpulan kitab suci yang menjadi pedoman umat Kristen."),
             new Buku("3. Bhagavad Gita", new String[]{"Vyasa"}, "Agama", "Buku ini mengungkap ajaran spiritual yang terkandung dalam agama Hindu."),
             new Buku("4. The Quran", new String[]{"Various Authors"}, "Agama", "Buku ini menjelaskan isi dan makna dari kitab suci dalam Islam."),
             new Buku("5. The Tao Te Ching", new String[]{"Laozi"}, "Agama", "Buku ini membahas konsep filosofis dalam ajaran kebijaksanaan Taoisme kuno.")},
            
             // Daftar buku kategori Psikologi
            {new Buku("1. Thinking, Fast and Slow", new String[]{"Daniel Kahneman"}, "Psikologi", "Buku ini mengulas dua sistem berpikir manusia berdasarkan penelitian kognitif."),
             new Buku("2. The Power of Habit", new String[]{"Charles Duhigg"}, "Psikologi", "Buku ini mengupas kebiasaan manusia serta cara efektif untuk mengubahnya."),
             new Buku("3. Man's Search for Meaning", new String[]{"Viktor Frankl"}, "Psikologi", "Buku ini menjelaskan makna hidup melalui pendekatan logoterapi oleh Viktor Frankl."),
             new Buku("4. The Lucifer Effect", new String[]{"Philip Zimbardo"}, "Psikologi", "Buku ini mengungkap analisis psikologis terhadap motif kejahatan dalam masyarakat."),
             new Buku("5. Psychology of Persuasion", new String[]{"Robert Cialdini"}, "Psikologi", "Buku ini menjelaskan prinsip-prinsip persuasi yang efektif dalam komunikasi sosial.")},
            
             // Daftar buku kategori Politik
            {new Buku("1. The Prince", new String[]{"Niccolò Machiavelli"}, "Politik", "Buku ini membahas strategi politik dan cara memperoleh serta mempertahankan kekuasaan."),
             new Buku("2. 1984", new String[]{"George Orwell"}, "Politik", "Buku ini menggambarkan distopia yang diawasi oleh sistem totaliter secara ketat."),
             new Buku("3. The Communist Manifesto", new String[]{"Karl Marx", "Friedrich Engels"}, "Politik", "Buku ini menjelaskan dasar-dasar teori komunisme dan dampaknya terhadap masyarakat."),
             new Buku("4. Democracy in America", new String[]{"Alexis de Tocqueville"}, "Politik", "Buku ini mengulas perkembangan demokrasi di Amerika dari masa ke masa."),
             new Buku("5. The Road to Serfdom", new String[]{"Friedrich Hayek"}, "Politik", "Buku ini membahas bahaya sosialisme dan dampaknya bagi sistem ekonomi global.")},
            
             // Daftar buku kategori Fiksi
            {new Buku("1. To Kill a Mockingbird", new String[]{"Harper Lee"}, "Fiksi", "Buku ini bercerita tentang kejadian rasisme dan ketidakadilan di Amerika."),
             new Buku("2. Pride and Prejudice", new String[]{"Jane Austen"}, "Fiksi", "Buku ini bercerita tentang cinta dan prasangka di Inggris pada abad ke-19."),
             new Buku("3. The Great Gatsby", new String[]{"F. Scott Fitzgerald"}, "Fiksi", "Buku ini bercerita tentang kehidupan mewah dan tragedi di Amerika."),
             new Buku("4. Harry Potter", new String[]{"J.K. Rowling"}, "Fiksi", "Buku ini bercerita tentang petualangan Harry Potter di dunia sihir."),
             new Buku("5. Lord of the Rings", new String[]{"J.R.R. Tolkien"}, "Fiksi", "Buku ini bercerita tentang petualangan melawan kekuatan jahat di Middle-earth.")}
        };
        
        // Tambahin buku-buku ke masing-masing kategori
        for (int i = 0; i < kategoriList.length; i++) {
            for (Buku buku : daftarBuku[i]) {
                kategoriList[i].tambahBuku(buku);
            }
        }
        
        // Tampilkan semua kategori dan buku-bukunya
        for (Kategori kategori : kategoriList) {
            kategori.tampilkanKategori();
        }

        // Scanner buat baca input user
        Scanner input = new Scanner(System.in);
        // Loop utama biar program tetep jalan sampe user milih keluar
        while (true) {
            //Tampilin menu pilihan
            System.out.println("\nMau ngapainn yh?:"); 
            System.out.println("1. Membandingkan dua buku kack"); // Pilihan buat bandingin dua buku
            System.out.println("2. Menghitung jumlah kata dalam sinopsis"); // Pilihan buat ngitung sinopsis
            System.out.println("3. Mengcopy buku"); // Menyalin buku
            System.out.println("4. Menghitung royalti 10%"); // Pilihan buat ngitung royalti 10%
            System.out.println("5. Menghitung royalti (custom)"); // Pilihan buat ngitung royalti dgn persentase sesuai input user (custom)
            System.out.println("6. Keluar ajdehh bosen"); //keluar dari program
            System.out.print("\nPilih cfatt: "); //input buat user
            int pilihan = input.nextInt(); // Baca input user buat pilih opsi di menu

            if (pilihan == 1) { // Kalo user pilih 1 berarti masuk ke fitur bandingin dua buku
                System.out.print("Okdehh, pilih kategori 1-7: "); // Minta user buat pilih kategori buku
                int kategori = input.nextInt() - 1; // Input kategori dikurang 1 biar sesuai indeks array

                System.out.print("Pilih nomor buku pertama yaw: "); // Pilih buku pertama buat dibandingin
                int idx1 = input.nextInt() - 1; // Input nomor buku pertama

                System.out.print("Sekarang pilih nomor buku yg kedua: "); // Pilih buku kedua buat dibandingin
                int idx2 = input.nextInt() - 1; // Input nomor buku kedua

                // Hitung tingkat kesamaan antara dua buku yang dipilih
                System.out.println("Tingkat kesamaan: " + daftarBuku[kategori][idx1].cekKesamaan(daftarBuku[kategori][idx2]) + "%");

            } else if (pilihan == 2) { // Kalo user pilih 2 berarti masuk ke fitur hitung jumlah kata di sinopsis
                System.out.print("Hmmz ok pilih kategori 1-7: "); // Minta user pilih kategori dulu
                int kategori = input.nextInt() - 1; // Input kategori, dikurang 1 biar sesuai indeks array

                System.out.print("Pilih nomor buku duls: "); // Pilih buku yang sinopsisnya mau dihitung
                int idx = input.nextInt() - 1; // Input nomor buku

                // Hitung jumlah kata dalam sinopsis buku yang dipilih
                System.out.println("Jumlah kata dalam sinopsis: " + daftarBuku[kategori][idx].hitungJumlahKataSinopsis());

            } else if (pilihan == 3) { // Kalo user pilih 3 berarti masuk ke fitur copy buku
                System.out.print("Bikelah, pilih kategori 1-7: "); // Minta user pilih kategori bukuw
                int kategori = input.nextInt() - 1; // Input kategori dikurang 1 nyesuain indeks array

                System.out.print("Pilih nomor buku yang maw km copy: "); // Pilih buku yang mau dicopy
                int idx = input.nextInt() - 1; // Input nomor buku

                // Bikin salinan buku
                Buku bukuCopy = daftarBuku[kategori][idx].copy(); 
                // Tampilkan hasil copy buku
                System.out.println("Buku copy: " + bukuCopy.getJudul() + " - " + bukuCopy.getPenulis() + " - " + bukuCopy.getKategori() + " - " + bukuCopy.getSinopsis());

            } else if (pilihan == 4) { // Kalo user pilih 4 berarti masuk ke fitur hitung royalti 10%
                System.out.print("Buku yang mana nih? pilih kategori 1-7: "); // Minta user pilih kategori
                int kategori = input.nextInt() - 1; // Input kategori dikurang 1 nyesuain indeks array

                System.out.print("Pilih nomor buku nya dungs: "); // Pilih buku yang mau dihitung royaltinya
                int idx = input.nextInt() - 1; // Input nomor buku

                System.out.print("Masukin harga bukunya: Rp "); // Minta user masukin harga buku
                int harga = input.nextInt(); // Input harga buku

                // Hitung royalti 10%
                double royalti = daftarBuku[kategori][idx].hitungRoyalti(harga);
                // Tampilkan hasil royalti
                System.out.println("Royalti 10%: Rp " + royalti);

            } else if (pilihan == 5) { // Kalo user pilih 5 berarti masuk ke fitur hitung royalti scr custom
                System.out.print("Okay, pilih kategori 1-7: "); // Minta user pilih kategori duls
                int kategori = input.nextInt() - 1; // Input kategori dikurang 1 nyesuain indeks array

                System.out.print("Pilih nomor bukumu: "); // Pilih buku yang mau dihitung royaltinya
                int idx = input.nextInt() - 1; // Input nomor buku

                System.out.print("Masukin harga bukunya: Rp "); // Minta user masukin harga buku
                int harga = input.nextInt(); // Input harga buku

                // Minta user masukin persentase royalti yg mereka mau
                System.out.print("Masukkan persentase royalti: ");
                    double persenRoyalti = input.nextDouble(); // Input persentase royalti
                    double royalti = daftarBuku[kategori][idx].hitungRoyalti(harga, persenRoyalti); // Hitung royalti berdasarkan harga dan persentase yang user masukin
                    System.out.println("Royaltinya adalaahh jeng jeng: Rp " + royalti); // Menampilkan hasil royaltii
            } else if (pilihan == 6) { // Kalo user pilih opsi 6 (keluar program)
                System.out.println("WOW MANTAP^^! Timakacii<3"); // Ucapan keren
                break; // Menghentikan loop dan keluar dr program
            } else {
                System.out.println("Pilihanmu egk valid tuhh, cobalagi"); // Kalo input user gak sesuai, kasih pesan error
            }
        }
    }
}
// TAMAATT🤯😮‍💨//