/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.example.com;

import entity.example.com.Nhanvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import static session.example.com.dbconnect.conn;

/**
 *
 * @author TMT
 */
@Stateless
@LocalBean
public class NhanVien_s {

    public List<Nhanvien> getAll(){
        dbconnect db=new dbconnect();
        Connection conn=db.getConnection();
        List<Nhanvien> list_nhanvien=new ArrayList<Nhanvien>();
        String sql="select * from quanlythuvien.nhanvien";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int id=rs.getInt("manhanvien");
                String ten=rs.getString("tennhanvien");
                String chucvu=rs.getString("chucvu");
                String taikhoan=rs.getString("taikhoan");
                String matkhau=rs.getString("matkhau");
                String quyen=rs.getString("quyen");
                Nhanvien nhanvien=new Nhanvien(id, ten, chucvu,taikhoan,matkhau,quyen);
                list_nhanvien.add(nhanvien);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_nhanvien;
    }
    
    public int add_NhanVien(Nhanvien nv){
        int n=0;
        String sql="insert into Nhanvien values(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pre=conn.prepareStatement(sql);
            pre.setInt(1, nv.getManhanvien());
            pre.setString(2, nv.getTennhanvien());
            pre.setString(3, nv.getChucvu());
            pre.setString(4, nv.getTaikhoan());
            pre.setString(5, nv.getMatkhau());
            pre.setString(6, nv.getQuyen());
            n=pre.executeUpdate();
        }
        catch (SQLException ex) {
            Logger.getLogger(NhanVien_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
    public int update_NhanVien(Nhanvien nv){
        int n=0;
        String sql="update NhanVien set tennhanvien=?, chucvu=?, taikhoan=?, matkhau=?, quyen=? where manhanvien=?";
        try {
            PreparedStatement pre=conn.prepareStatement(sql);
            pre.setString(1, nv.getTennhanvien());
            pre.setString(2, nv.getChucvu());
            pre.setString(3, nv.getTaikhoan());
            pre.setString(4, nv.getMatkhau());
            pre.setString(5, nv.getQuyen());
            pre.setInt(6, nv.getManhanvien());
            n=pre.executeUpdate();
        }
        catch (SQLException ex) {
            Logger.getLogger(NhanVien_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
    public int delete_NhanVien(String ma){
        int n=0;
        String sql="delete from NhanVien where MaNhanVien='"+ma+"'";
        try {
            Statement st=conn.createStatement();
            n=st.executeUpdate(sql);
        }
        catch (SQLException ex) {
            Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return n;
    }
}
