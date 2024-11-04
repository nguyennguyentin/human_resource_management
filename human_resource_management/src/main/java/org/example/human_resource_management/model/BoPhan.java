package org.example.human_resource_management.model;

public class BoPhan {
    private int id_BoPhan;
    private String ten_BoPhan;

    public BoPhan() {
    }

    public BoPhan(int id_BoPhan, String ten_BoPhan) {
        this.id_BoPhan = id_BoPhan;
        this.ten_BoPhan = ten_BoPhan;
    }

    public int getId_BoPhan() {
        return id_BoPhan;
    }

    public void setId_BoPhan(int id_BoPhan) {
        this.id_BoPhan = id_BoPhan;
    }

    public String getTen_BoPhan() {
        return ten_BoPhan;
    }

    public void setTen_BoPhan(String ten_BoPhan) {
        this.ten_BoPhan = ten_BoPhan;
    }
}
