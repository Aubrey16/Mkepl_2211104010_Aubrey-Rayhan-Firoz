import java.util.Date;

public class LibraryMember {
    private infoPribadi infoPribadi;
    private statusAnggota statusAnggota;


    public LibraryMember(String namaLengkap, String alamat, String nomorTelepon, String email, String jenisKelamin,
            String kodeAnggota, Date tanggalGabung, boolean statusAktif,
            String tingkatKeanggotaan, int jumlahBukuDipinjam,
            int jumlahTerlambat, int jumlahDenda, int poinLoyalitas,
            String kodeReferal, boolean langgananBuletin) {

        this.infoPribadi = new infoPribadi(namaLengkap, alamat, nomorTelepon, email, jenisKelamin);
        this.statusAnggota = new statusAnggota(kodeAnggota, tanggalGabung, statusAktif,
                tingkatKeanggotaan, jumlahBukuDipinjam,
                jumlahTerlambat, jumlahDenda, poinLoyalitas,
                kodeReferal, langgananBuletin);

    }

    public void cetakProfilLengkap() {
        System.out.println("===== PROFIL ANGGOTA =====");
        System.out.println("Nama         : " + infoPribadi.getNamaLengkap());
        System.out.println("Jenis Kelamin: " + infoPribadi.getJenisKelamin());
        System.out.println("Alamat       : " + infoPribadi.getAlamat());
        System.out.println("Telepon      : " + infoPribadi.getNomorTelepon());
        System.out.println("Email        : " + infoPribadi.getEmail());
        System.out.println("Kode Anggota : " + statusAnggota.getKodeAnggota());
        System.out.println("Tanggal Gabung: " + statusAnggota.getTanggalGabung());
        System.out.println("Status Aktif : " + statusAnggota.isStatusAktif());
        System.out.println("Tingkat      : " + statusAnggota.getTingkatKeanggotaan());
        System.out.println("Buku Dipinjam: " +  statusAnggota.getJumlahBukuDipinjam());
        System.out.println("Terlambat    : " + statusAnggota.getJumlahTerlambat());
        System.out.println("Denda        : Rp " + statusAnggota.getJumlahDenda());
        System.out.println("Poin         : " + statusAnggota.getPoinLoyalitas());
        System.out.println("Kode Referal : " + statusAnggota.getKodeReferal());
        System.out.println("Langganan Buletin: " + statusAnggota.isLanggananBuletin());
        System.out.println("Skor Risiko : " + hitungSkorRisiko());
        System.out.println("Layak Upgrade?: " + periksaKelayakanUpgrade());
        System.out.println("===========================");
    }

    public void langgananBuletinPerpustakaan() {
    }

    public void gunakanKodeReferal(String kode) {
    }



        // Lebih panjang, kenapa tidak langsung di return
    // public boolean periksaKelayakanUpgrade() {
    //     if (statusAnggota.getTingkatKeanggotaan().equals("DASAR") && poinLoyalitas > 100) {
    //         return true;
    //     }
    //     return false;
    // }

    // disini kita menghapus if dan return yang tidak perlu, jadi langsung menyingkatnya dengan langsung balikan hasilnya
    public boolean periksaKelayakanUpgrade() {
        return statusAnggota.getTingkatKeanggotaan().equalsIgnoreCase("DASAR") && statusAnggota.getPoinLoyalitas() > 100;
    }





    public double hitungSkorRisiko() {
        double skor = 0;
        skor += statusAnggota.getJumlahTerlambat() * 1.5;
        skor += statusAnggota.getJumlahDenda() * 0.1;
        if (!statusAnggota.isStatusAktif())
            skor += 5;
        if (statusAnggota.getTingkatKeanggotaan().equals("DASAR"))
            skor += 2;
        if (statusAnggota.getJumlahBukuDipinjam() > 50)
            skor -= 1.5;
        return skor;
    }

    
    public String getKodeReferal() {
        return statusAnggota.getKodeReferal();
    }

    public void setKodeReferal(String k) {
        statusAnggota.setKodeReferal(k);
    }    

    public boolean getLanggananBuletin() {
        return statusAnggota.isLanggananBuletin();
    }

    public void setLanggananBuletin(boolean l) {
        statusAnggota.setLanggananBuletin(l);
    }
}
