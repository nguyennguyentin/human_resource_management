package org.example.human_resource_management.model;

public class TrinhDo {
    private int id_TrinhDo;
    private String ten_TrinhDo;

    public TrinhDo() {
    }

    public TrinhDo(int id_TrinhDo, String ten_TrinhDo) {
        this.id_TrinhDo = id_TrinhDo;
        this.ten_TrinhDo = ten_TrinhDo;
    }

    public int getId_TrinhDo() {
        return id_TrinhDo;
    }

    public void setId_TrinhDo(int id_TrinhDo) {
        this.id_TrinhDo = id_TrinhDo;
    }

    public String getTen_TrinhDo() {
        return ten_TrinhDo;
    }

    public void setTen_TrinhDo(String ten_TrinhDo) {
        this.ten_TrinhDo = ten_TrinhDo;
    }
}
