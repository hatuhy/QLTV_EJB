/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.example.com;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TMT
 */
@Entity
@Table(name = "phieumuonchitiet", catalog = "quanlythuvien", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phieumuonchitiet.findAll", query = "SELECT p FROM Phieumuonchitiet p")
    , @NamedQuery(name = "Phieumuonchitiet.findByMaphieumuon", query = "SELECT p FROM Phieumuonchitiet p WHERE p.maphieumuon = :maphieumuon")
    , @NamedQuery(name = "Phieumuonchitiet.findBySoluongmuon", query = "SELECT p FROM Phieumuonchitiet p WHERE p.soluongmuon = :soluongmuon")
    , @NamedQuery(name = "Phieumuonchitiet.findByNgaytra", query = "SELECT p FROM Phieumuonchitiet p WHERE p.ngaytra = :ngaytra")
    , @NamedQuery(name = "Phieumuonchitiet.findByMat", query = "SELECT p FROM Phieumuonchitiet p WHERE p.mat = :mat")})
public class Phieumuonchitiet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "maphieumuon", nullable = false, length = 20)
    private String maphieumuon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "soluongmuon", nullable = false)
    private int soluongmuon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ngaytra", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ngaytra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mat", nullable = false)
    private int mat;
    @JoinColumn(name = "maphieumuon", referencedColumnName = "maphieumuon", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Phieumuon phieumuon;
    @JoinColumn(name = "matailieu", referencedColumnName = "matailieu", nullable = false)
    @ManyToOne(optional = false)
    private Tailieu matailieu;

    public Phieumuonchitiet() {
    }

    public Phieumuonchitiet(String maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public Phieumuonchitiet(String maphieumuon, int soluongmuon, Date ngaytra, int mat) {
        this.maphieumuon = maphieumuon;
        this.soluongmuon = soluongmuon;
        this.ngaytra = ngaytra;
        this.mat = mat;
    }

    public String getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(String maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public int getSoluongmuon() {
        return soluongmuon;
    }

    public void setSoluongmuon(int soluongmuon) {
        this.soluongmuon = soluongmuon;
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public Phieumuon getPhieumuon() {
        return phieumuon;
    }

    public void setPhieumuon(Phieumuon phieumuon) {
        this.phieumuon = phieumuon;
    }

    public Tailieu getMatailieu() {
        return matailieu;
    }

    public void setMatailieu(Tailieu matailieu) {
        this.matailieu = matailieu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maphieumuon != null ? maphieumuon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phieumuonchitiet)) {
            return false;
        }
        Phieumuonchitiet other = (Phieumuonchitiet) object;
        if ((this.maphieumuon == null && other.maphieumuon != null) || (this.maphieumuon != null && !this.maphieumuon.equals(other.maphieumuon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.example.com.Phieumuonchitiet[ maphieumuon=" + maphieumuon + " ]";
    }
    
}
