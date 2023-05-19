/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Date;

public class menu_utama {
    public static void main(String[] args) {
        // Membuat objek Pelanggan
        pelanggan pelanggan1 = new pelanggan("001", "John Doe", "08123456789", "Jl. Raya Kebayoran");
        pelanggan pelanggan2 = new pelanggan("002", "Jane Smith", "08234567890", "Jl. Sudirman");

        // Menampilkan data pelanggan
        System.out.println("Data Pelanggan 1:");
        System.out.println("ID Pelanggan: " + pelanggan1.getIdPelanggan());
        System.out.println("Nama Pelanggan: " + pelanggan1.getNamaPelanggan());
        System.out.println("Telepon: " + pelanggan1.getTelepon());
        System.out.println("Alamat: " + pelanggan1.getAlamat());

        System.out.println();

        System.out.println("Data Pelanggan 2:");
        System.out.println("ID Pelanggan: " + pelanggan2.getIdPelanggan());
        System.out.println("Nama Pelanggan: " + pelanggan2.getNamaPelanggan());
        System.out.println("Telepon: " + pelanggan2.getTelepon());
        System.out.println("Alamat: " + pelanggan2.getAlamat());

        System.out.println();

        // Membuat objek Menu
        menu menu1 = new menu("001", "002", "Nasi Goreng", 25000, 10);
        menu menu2 = new menu("002", "001", "Mie Ayam", 20000, 5);

        // Menampilkan data menu
        System.out.println("Data Menu 1:");
        System.out.println("ID Menu: " + menu1.getIdMenu());
        System.out.println("ID Kategori: " + menu1.getIdKategori());
        System.out.println("Nama Menu: " + menu1.getNamaMenu());
        System.out.println("Harga: " + menu1.getHarga());
        System.out.println("Stok: " + menu1.getStok());

        System.out.println();

        System.out.println("Data Menu 2:");
        System.out.println("ID Menu: " + menu2.getIdMenu());
        System.out.println("ID Kategori: " + menu2.getIdKategori());
        System.out.println("Nama Menu: " + menu2.getNamaMenu());
        System.out.println("Harga: " + menu2.getHarga());
        System.out.println("Stok: " + menu2.getStok());

        System.out.println();

        // Membuat objek Kategori
        kategori kategori1 = new kategori("001", "Makanan");
        kategori kategori2 = new kategori("002", "Minuman");

        // Menampilkan data kategori
        System.out.println("Data Kategori 1:");
        System.out.println("ID Kategori: " + kategori1.getIdKategori());
        System.out.println("Nama Kategori: " + kategori1.getNamaKategori());

        System.out.println();

        System.out.println("Data Kategori 2:");
        System.out.println("ID Kategori: " + kategori2.getIdKategori());
        System.out.println("Nama Kategori: " + kategori2.getNamaKategori());

        System.out.println();

        // Membuat objek Pembelian
        pembelian pembelian1 = new pembelian("001", new Date(), "Pembelian A", 500000);
        pembelian pembelian2 = new pembelian("002",new Date(), "Pembelian B", 250000);
        
// Menampilkan data pembelian
    System.out.println("Data Pembelian 1:");
    System.out.println("ID Pembelian: " + pembelian1.getIdPembelian());
    System.out.println("Tanggal: " + pembelian1.getTanggal());
    System.out.println("Nama Pembelian: " + pembelian1.getNamaPembelian());
    System.out.println("Total Harga: " + pembelian1.getTotalHarga());

    System.out.println();

    System.out.println("Data Pembelian 2:");
    System.out.println("ID Pembelian: " + pembelian2.getIdPembelian());
    System.out.println("Tanggal: " + pembelian2.getTanggal());
    System.out.println("Nama Pembelian: " + pembelian2.getNamaPembelian());
    System.out.println("Total Harga: " + pembelian2.getTotalHarga());

    System.out.println();

    // Membuat objek User
    User user1 = new User("John Doe", "001", "johndoe", "password", "Admin");
    User user2 = new User("Jane Smith", "002", "janesmith", "password123", "Staff");

    // Menampilkan data user
    System.out.println("Data User 1:");
    System.out.println("Nama User: " + user1.getNamaUser());
    System.out.println("ID User: " + user1.getIdUser());
    System.out.println("Username: " + user1.getUsername());
    System.out.println("Password: " + user1.getPassword());
    System.out.println("Level: " + user1.getLevel());

    System.out.println();

    System.out.println("Data User 2:");
    System.out.println("Nama User: " + user2.getNamaUser());
    System.out.println("ID User: " + user2.getIdUser());
    System.out.println("Username: " + user2.getUsername());
    System.out.println("Password: " + user2.getPassword());
    System.out.println("Level: " + user2.getLevel());
}
}
