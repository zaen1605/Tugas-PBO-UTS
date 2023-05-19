/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class profil_rumahmakan {
    private String idProfil;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;

    // Constructor
    public profil_rumahmakan(String idProfil, String nama, String alamat, String telepon, String email) {
        this.idProfil = idProfil;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }

    // Getter dan Setter
    public String getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(String idProfil) {
        this.idProfil = idProfil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
