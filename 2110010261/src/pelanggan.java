/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class pelanggan {
    private String idPelanggan;
    private String namaPelanggan;
    private String telepon;
    private String alamat;

    // Constructor
    public pelanggan(String idPelanggan, String namaPelanggan, String telepon, String alamat) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.telepon = telepon;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
