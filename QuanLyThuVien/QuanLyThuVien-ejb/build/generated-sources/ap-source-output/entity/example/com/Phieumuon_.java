package entity.example.com;

import entity.example.com.Docgia;
import entity.example.com.Phieumuonchitiet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-14T09:14:41")
@StaticMetamodel(Phieumuon.class)
public class Phieumuon_ { 

    public static volatile SingularAttribute<Phieumuon, String> manhanvien;
    public static volatile SingularAttribute<Phieumuon, Docgia> madocgia;
    public static volatile SingularAttribute<Phieumuon, Phieumuonchitiet> phieumuonchitiet;
    public static volatile SingularAttribute<Phieumuon, Date> ngaymuon;
    public static volatile SingularAttribute<Phieumuon, String> maphieumuon;

}