/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Date;

public class pembelian {
    private String idPembelian;
    private Date tanggal;
    private String namaPembelian;
    private double totalHarga;

    // Constructor
    public pembelian(String idPembelian, Date tanggal, String namaPembelian, double totalHarga) {
        this.idPembelian = idPembelian;
        this.tanggal = tanggal;
        this.namaPembelian = namaPembelian;
        this.totalHarga = totalHarga;
    }

    // Getter dan Setter
    public String getIdPembelian() {
        return idPembelian;
    }

    public void setIdPembelian(String idPembelian) {
        this.idPembelian = idPembelian;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getNamaPembelian() {
        return namaPembelian;
    }

    public void setNamaPembelian(String namaPembelian) {
        this.namaPembelian = namaPembelian;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
}
