package com.deploy.pertemuan11.model.dto;

public class RegisterRequest {
    private String username;
    private String password;
    private String nama;
    private String alamat;

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }

    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setNama(String nama) { this.nama = nama; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
}