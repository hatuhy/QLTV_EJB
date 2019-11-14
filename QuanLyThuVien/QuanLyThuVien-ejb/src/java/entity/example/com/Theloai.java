/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.example.com;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMT
 */
@Entity
@Table(name = "theloai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Theloai.findAll", query = "SELECT t FROM Theloai t")
    , @NamedQuery(name = "Theloai.findByMatheloai", query = "SELECT t FROM Theloai t WHERE t.matheloai = :matheloai")
    , @NamedQuery(name = "Theloai.findByTentheloai", query = "SELECT t FROM Theloai t WHERE t.tentheloai = :tentheloai")})
public class Theloai implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ghichu", nullable = false, length = 50)
    private String ghichu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matheloai")
    private Collection<Tailieu> tailieuCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "matheloai")
    private Integer matheloai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tentheloai")
    private String tentheloai;

    public Theloai() {
    }

    public Theloai(Integer matheloai) {
        this.matheloai = matheloai;
    }

    public Theloai(Integer matheloai, String tentheloai) {
        this.matheloai = matheloai;
        this.tentheloai = tentheloai;
    }

    public Integer getMatheloai() {
        return matheloai;
    }

    public void setMatheloai(Integer matheloai) {
        this.matheloai = matheloai;
    }

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matheloai != null ? matheloai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theloai)) {
            return false;
        }
        Theloai other = (Theloai) object;
        if ((this.matheloai == null && other.matheloai != null) || (this.matheloai != null && !this.matheloai.equals(other.matheloai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.example.com.Theloai[ matheloai=" + matheloai + " ]";
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    @XmlTransient
    public Collection<Tailieu> getTailieuCollection() {
        return tailieuCollection;
    }

    public void setTailieuCollection(Collection<Tailieu> tailieuCollection) {
        this.tailieuCollection = tailieuCollection;
    }
    
}
