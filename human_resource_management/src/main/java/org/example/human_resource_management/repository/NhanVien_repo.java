package org.example.human_resource_management.repository;

import org.example.human_resource_management.model.NhanVien;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanVien_repo implements INhanVien_repo{
    private final String SL_NHANVIEN ="select ho_ten, ngay_sinh, cmnd, luong, sdt, mail, dia_chi, vi_tri.ten_vi_tri, trinh_do.ten_trinh_do, bo_phan.ten_bo_phan\n" +
            "from nhan_vien\n" +
            "join vi_tri on vi_tri.ma_vi_tri = nhan_vien.ma_vi_tri\n" +
            "join trinh_do on trinh_do.ma_trinh_do= nhan_vien.ma_trinh_do\n" +
            "join bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan;";

    private final String FIND_BY_ID = "select ma_nhan_vien, ho_ten, ngay_sinh, cmnd, luong, sdt, mail, dia_chi, vi_tri.ten_vi_tri, trinh_do.ten_trinh_do, bo_phan.ten_bo_phan\n" +
            "from nhan_vien\n" +
            "join vi_tri on vi_tri.ma_vi_tri = nhan_vien.ma_vi_tri\n" +
            "join trinh_do on trinh_do.ma_trinh_do= nhan_vien.ma_trinh_do\n" +
            "join bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan\n" +
            "where id = ? ;\n";

    private final String INSER_INTO_NHANVIEN = "INSERT INTO nhan_vien ( ho_ten, ngay_sinh, cmnd, luong, sdt, mail, dia_chi, ten_vi_tri, ten_trinh_do, ten_bo_phan) VALUES\n" +
            "( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

    @Override
    public List<NhanVien> findAll() {
        List<NhanVien> dbNhanVien = new ArrayList<>();
        Base_repo base_repo = new Base_repo();
        Connection connection = base_repo.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SL_NHANVIEN);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id_nhanvien = resultSet.getInt("ma_nhan_vien");
                String ten_nhanvien = resultSet.getString("ho_ten");
                String ngaysinh_nhanvien = resultSet.getString("ngay_sinh");
                String cccd_nhanvien = resultSet.getString("cmnd");
                int luong_nhanvien = resultSet.getInt("luong");
                int sdt_nhanvien = resultSet.getInt("sdt");
                String mail_nhanvien = resultSet.getString("mail");
                String diachi_nhanvien = resultSet.getString("dia_chi");
                int vitri = resultSet.getInt("ma_vi_tri");
                int trinhdo = resultSet.getInt("ma_trinh_do");
                int bophan = resultSet.getInt("ma_bo_phan");

                dbNhanVien.add(new NhanVien(id_nhanvien, ten_nhanvien, ngaysinh_nhanvien,cccd_nhanvien,luong_nhanvien,sdt_nhanvien,mail_nhanvien,diachi_nhanvien,vitri,trinhdo,bophan));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbNhanVien;
    }

    @Override
    public NhanVien findById(int id) {
        NhanVien nhanVien = null;
        Base_repo base_repo = new Base_repo();
        Connection connection = base_repo.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id_nhanvien = resultSet.getInt("ma_nhan_vien");
                String ten_nhanvien = resultSet.getString("ho_ten");
                String ngaysinh_nhanvien = resultSet.getString("ngay_sinh");
                String cccd_nhanvien = resultSet.getString("cmnd");
                int luong_nhanvien = resultSet.getInt("luong");
                int sdt_nhanvien = resultSet.getInt("sdt");
                String mail_nhanvien = resultSet.getString("mail");
                String diachi_nhanvien = resultSet.getString("dia_chi");
                int vitri = resultSet.getInt("ma_vi_tri");
                int trinhdo = resultSet.getInt("ma_trinh_do");
                int bophan = resultSet.getInt("ma_bo_phan");
                nhanVien = new NhanVien(id_nhanvien, ten_nhanvien, ngaysinh_nhanvien,cccd_nhanvien,luong_nhanvien,sdt_nhanvien,mail_nhanvien,diachi_nhanvien,vitri,trinhdo,bophan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nhanVien;    }

    @Override
    public void add(NhanVien nhanVien) {
        Base_repo base_repo = new Base_repo();
        Connection connection = base_repo.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(INSER_INTO_NHANVIEN);
            preparedStatement.setString(1,nhanVien.getHoTen_NhanVien());
            preparedStatement.setString(2,nhanVien.getNgaySinh_NhanVien());
            preparedStatement.setString(3,nhanVien.getCccd_NhanVien());
            preparedStatement.setInt(4,nhanVien.getLuong_NhanVien());
            preparedStatement.setInt(5,nhanVien.getSdt_NhanVien());
            preparedStatement.setString(6,nhanVien.getMail_NhanVien());
            preparedStatement.setString(7,nhanVien.getDiaChi_NhanVien());
            preparedStatement.setInt(8,nhanVien.getId_ViTri());
            preparedStatement.setInt(9,nhanVien.getId_TrinhDo());
            preparedStatement.setInt(10,nhanVien.getId_BoPhan());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit(NhanVien nhanVien) {

    }

    @Override
    public void delete(NhanVien nhanVien) {

    }
}
