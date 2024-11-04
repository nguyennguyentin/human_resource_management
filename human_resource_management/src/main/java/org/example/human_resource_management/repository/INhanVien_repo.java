package org.example.human_resource_management.repository;

import org.example.human_resource_management.model.NhanVien;

import java.util.List;

public interface INhanVien_repo {
    List<NhanVien> findAll();
    NhanVien findById(int id);
    void add(NhanVien nhanVien);
    void edit(NhanVien nhanVien);
    void delete(NhanVien nhanVien);

}
