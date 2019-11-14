/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.example.com;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TMT
 */
@Entity
@Table(name = "nhanvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nhanvien.findAll", query = "SELECT n FROM Nhanvien n")
    , @NamedQuery(name = "Nhanvien.findByManhanvien", query = "SELECT n FROM Nhanvien n WHERE n.manhanvien = :manhanvien")
    , @NamedQuery(name = "Nhanvien.findByTennhanvien", query = "SELECT n FROM Nhanvien n WHERE n.tennhanvien = :tennhanvien")
    , @NamedQuery(name = "Nhanvien.findByChucvu", query = "SELECT n FROM Nhanvien n WHERE n.chucvu = :chucvu")
    , @NamedQuery(name = "Nhanvien.findByTaikhoan", query = "SELECT n FROM Nhanvien n WHERE n.taikhoan = :taikhoan")
    , @NamedQuery(name = "Nhanvien.findByMatkhau", query = "SELECT n FROM Nhanvien n WHERE n.matkhau = :matkhau")
    , @NamedQuery(name = "Nhanvien.findByQuyen", query = "SELECT n FROM Nhanvien n WHERE n.quyen = :quyen")})
public class Nhanvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "manhanvien")
    private Integer manhanvien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tennhanvien")
    private String tennhanvien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "chucvu")
    private String chucvu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "taikhoan")
    private String taikhoan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "matkhau")
    private String matkhau;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "quyen")
    private String quyen;

    public Nhanvien() {
    }

    public Nhanvien(Integer manhanvien) {
        this.manhanvien = manhanvien;
    }

    public Nhanvien(int manhanvien, String tennhanvien, String chucvu, String taikhoan, String matkhau, String quyen) {
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        this.chucvu = chucvu;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.quyen = quyen;
    }

    public Integer getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(Integer manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (manhanvien != null ? manhanvien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nhanvien)) {
            return false;
        }
        Nhanvien other = (Nhanvien) object;
        if ((this.manhanvien == null && other.manhanvien != null) || (this.manhanvien != null && !this.manhanvien.equals(other.manhanvien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.example.com.Nhanvien[ manhanvien=" + manhanvien + " ]";
    }
    
}
