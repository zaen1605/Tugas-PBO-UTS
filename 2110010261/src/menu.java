/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class menu {
    private String idMenu;
    private String idKategori;
    private String namaMenu;
    private int harga;
    private int stok;

    // Constructor
    public menu(String idMenu, String idKategori, String namaMenu, int harga, int stok) {
        this.idMenu = idMenu;
        this.idKategori = idKategori;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter dan Setter
    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
