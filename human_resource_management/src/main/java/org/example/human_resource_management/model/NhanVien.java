package org.example.human_resource_management.model;

public class    NhanVien {
    private int id_NhanVien;
    private String hoTen_NhanVien;
    private String ngaySinh_NhanVien;
    private String cccd_NhanVien;
    private int luong_NhanVien;
    private int sdt_NhanVien;
    private String mail_NhanVien;
    private String diaChi_NhanVien;
    private int id_ViTri;
    private int id_TrinhDo;
    private int id_BoPhan;

    public NhanVien() {
    }

    public NhanVien(int id_NhanVien, String hoTen_NhanVien, String ngaySinh_NhanVien, String cccd_NhanVien, int luong_NhanVien, int sdt_NhanVien, String mail_NhanVien, String diaChi_NhanVien, int id_ViTri, int id_TrinhDo, int id_BoPhan) {
        this.id_NhanVien = id_NhanVien;
        this.hoTen_NhanVien = hoTen_NhanVien;
        this.ngaySinh_NhanVien = ngaySinh_NhanVien;
        this.cccd_NhanVien = cccd_NhanVien;
        this.luong_NhanVien = luong_NhanVien;
        this.sdt_NhanVien = sdt_NhanVien;
        this.mail_NhanVien = mail_NhanVien;
        this.diaChi_NhanVien = diaChi_NhanVien;
        this.id_ViTri = id_ViTri;
        this.id_TrinhDo = id_TrinhDo;
        this.id_BoPhan = id_BoPhan;
    }

    public int getId_NhanVien() {
        return id_NhanVien;
    }

    public void setId_NhanVien(int id_NhanVien) {
        this.id_NhanVien = id_NhanVien;
    }

    public String getHoTen_NhanVien() {
        return hoTen_NhanVien;
    }

    public void setHoTen_NhanVien(String hoTen_NhanVien) {
        this.hoTen_NhanVien = hoTen_NhanVien;
    }

    public String getNgaySinh_NhanVien() {
        return ngaySinh_NhanVien;
    }

    public void setNgaySinh_NhanVien(String ngaySinh_NhanVien) {
        this.ngaySinh_NhanVien = ngaySinh_NhanVien;
    }

    public String getCccd_NhanVien() {
        return cccd_NhanVien;
    }

    public void setCccd_NhanVien(String cccd_NhanVien) {
        this.cccd_NhanVien = cccd_NhanVien;
    }

    public int getLuong_NhanVien() {
        return luong_NhanVien;
    }

    public void setLuong_NhanVien(int luong_NhanVien) {
        this.luong_NhanVien = luong_NhanVien;
    }

    public int getSdt_NhanVien() {
        return sdt_NhanVien;
    }

    public void setSdt_NhanVien(int sdt_NhanVien) {
        this.sdt_NhanVien = sdt_NhanVien;
    }

    public String getMail_NhanVien() {
        return mail_NhanVien;
    }

    public void setMail_NhanVien(String mail_NhanVien) {
        this.mail_NhanVien = mail_NhanVien;
    }

    public String getDiaChi_NhanVien() {
        return diaChi_NhanVien;
    }

    public void setDiaChi_NhanVien(String diaChi_NhanVien) {
        this.diaChi_NhanVien = diaChi_NhanVien;
    }

    public int getId_ViTri() {
        return id_ViTri;
    }

    public void setId_ViTri(int id_ViTri) {
        this.id_ViTri = id_ViTri;
    }

    public int getId_TrinhDo() {
        return id_TrinhDo;
    }

    public void setId_TrinhDo(int id_TrinhDo) {
        this.id_TrinhDo = id_TrinhDo;
    }

    public int getId_BoPhan() {
        return id_BoPhan;
    }

    public void setId_BoPhan(int id_BoPhan) {
        this.id_BoPhan = id_BoPhan;
    }


}
