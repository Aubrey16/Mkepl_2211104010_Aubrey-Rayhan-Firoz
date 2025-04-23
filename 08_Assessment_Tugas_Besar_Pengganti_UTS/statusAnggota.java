import java.util.Date;

public class statusAnggota {
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private String tingkatKeanggotaan;
    private int jumlahBukuDipinjam;
    private int jumlahTerlambat;
    private int jumlahDenda;
    private int poinLoyalitas;
    private String kodeReferal;
    private boolean langgananBuletin;

    public statusAnggota(String kodeAnggota, Date tanggalGabung, boolean statusAktif,
    String tingkatKeanggotaan, int jumlahBukuDipinjam,
    int jumlahTerlambat, int jumlahDenda, int poinLoyalitas,
    String kodeReferal, boolean langgananBuletin) {
        this.kodeAnggota = kodeAnggota;
        this.tanggalGabung = tanggalGabung;
        this.statusAktif = statusAktif;
        this.tingkatKeanggotaan = tingkatKeanggotaan;
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;   
        this.jumlahTerlambat = jumlahTerlambat;
        this.jumlahDenda = jumlahDenda;
        this.poinLoyalitas = poinLoyalitas;
        this.kodeReferal = kodeReferal;
        this.langgananBuletin = langgananBuletin;
    }
    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public Date getTanggalGabung() {
        return tanggalGabung;
    }

    public boolean isStatusAktif() {
        return statusAktif;
    }

    public String getTingkatKeanggotaan() {
        return tingkatKeanggotaan;
    }
    public int getJumlahBukuDipinjam() {
        return jumlahBukuDipinjam;
    }
    public int getJumlahTerlambat() {
        return jumlahTerlambat;
    }
    public int getJumlahDenda() {
        return jumlahDenda;
    }
    public int getPoinLoyalitas() {
        return poinLoyalitas;
    }
    public String getKodeReferal() {
        return kodeReferal;
    }
    public boolean isLanggananBuletin() {
        return langgananBuletin;
    }

    public void setKodeReferal(String kodeReferal) {
        this.kodeReferal = kodeReferal;
    }
    
    public void setLanggananBuletin(boolean langgananBuletin) {
        this.langgananBuletin = langgananBuletin;
    }
    
    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }
    public void setTanggalGabung(Date tanggalGabung) {
        this.tanggalGabung = tanggalGabung;
    }
    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }
    public void setTingkatKeanggotaan(String tingkatKeanggotaan) {
        this.tingkatKeanggotaan =
        tingkatKeanggotaan;
    }
}
