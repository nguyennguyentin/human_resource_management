package org.example.human_resource_management.model;

public class ViTri {
    private int id_ViTri;
    private String ten_ViTri;

    public ViTri() {
    }

    public ViTri(int id_ViTri, String ten_ViTri) {
        this.id_ViTri = id_ViTri;
        this.ten_ViTri = ten_ViTri;
    }

    public int getId_ViTri() {
        return id_ViTri;
    }

    public void setId_ViTri(int id_ViTri) {
        this.id_ViTri = id_ViTri;
    }

    public String getTen_ViTri() {
        return ten_ViTri;
    }

    public void setTen_ViTri(String ten_ViTri) {
        this.ten_ViTri = ten_ViTri;
    }
}
