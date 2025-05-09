
package pbopt9;
// Sebuah lingkungan RT/RW ingin mengembangkan aplikasi sederhana untuk
//mengelola data warga, kegiatan, dan pembayaran iuran. Aplikasi ini perlu dibangun
//menggunakan konsep inheritance dan polymorphism dalam Java. Data tersebut adalah
//Warga, Kepala Keluarga, Anggota Keluarga, Pamong warga, Kegiatan, Iuran. Untuk
//menjunjang kegiatan RT tersebut, maka buatkan aplikasi sederhana dengan nama Aplikasi
//Rukun. Pertanyaan
//1. Sebutkan Class yang akan dibuatnya dan tunjukan mana inheritance dan polymorphism dari Aplikasi Rukun di atas!
//2. Buktikan implementasikan metode inheritance yang tepat!
//3. Buktikan implementasikan metode polymorphism!
//4. Buat program main class, dengan terdapat minimal 5 object warga, 3 object kegiatan, dan 2 object iuran
//5. Buktikan hasil aplikasi sederhana tersebut dengan menambahkan Nama Peserta, NIM, Program Studi serta disampaikan ke Dosen Anda! 
public class PBOPT9 {
    public static void main(String[] args) {
        // TODO code application logic here
        warga w1 = new warga("213132", "Muadz", "Bekasi Utara");
        kepalaKeluarga k1 = new kepalaKeluarga("213132", "adit", "Bekasi Utara", false );
        kepalaKeluarga k2 = new kepalaKeluarga("213132", "Danu", "Bekasi Utara", false );
        kegiatan kg1 = new kegiatan("Lomba Mancing", "2024/12/12");
        kegiatan kg2 = new kegiatan("Lomba Mobile legend", "2024/12/12");
        iuran i1 = new iuran("Biaya Keamanan", 12000);
        iuran i2 = new iuran("Biaya Kebersihan", 122000);
        
        w1.tampilkanWarga();
        k1.tampilkanWarga();
        k2.tampilkanWarga();
        kg1.tampilkanKegiatan();
        i1.tampilkanIuran();
        i2.tampilkanIuran();
        
        
    }
    
}
