/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Date;

public class penjualan {
    private String noTransaksi;
    private String idPelanggan;
    private Date tanggalTransaksi;
    private double bayar;
    private double uangKembali;
    private String idUser;
    private String layanan;
    private String noMeja;

    // Constructor
    public penjualan(String noTransaksi, String idPelanggan, Date tanggalTransaksi, double bayar, double uangKembali, String idUser, String layanan, String noMeja) {
        this.noTransaksi = noTransaksi;
        this.idPelanggan = idPelanggan;
        this.tanggalTransaksi = tanggalTransaksi;
        this.bayar = bayar;
        this.uangKembali = uangKembali;
        this.idUser = idUser;
        this.layanan = layanan;
        this.noMeja = noMeja;
    }

    // Getter dan Setter
    public String getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public double getBayar() {
        return bayar;
    }

    public void setBayar(double bayar) {
        this.bayar = bayar;
    }

    public double getUangKembali() {
        return uangKembali;
    }

    public void setUangKembali(double uangKembali) {
        this.uangKembali = uangKembali;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    public String getNoMeja() {
        return noMeja;
    }

    public void setNoMeja(String noMeja) {
        this.noMeja = noMeja;
    }
}