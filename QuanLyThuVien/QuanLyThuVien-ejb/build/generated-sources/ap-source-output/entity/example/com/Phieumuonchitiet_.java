package entity.example.com;

import entity.example.com.Phieumuon;
import entity.example.com.Tailieu;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-14T09:14:41")
@StaticMetamodel(Phieumuonchitiet.class)
public class Phieumuonchitiet_ { 

    public static volatile SingularAttribute<Phieumuonchitiet, Integer> mat;
    public static volatile SingularAttribute<Phieumuonchitiet, Date> ngaytra;
    public static volatile SingularAttribute<Phieumuonchitiet, Tailieu> matailieu;
    public static volatile SingularAttribute<Phieumuonchitiet, String> maphieumuon;
    public static volatile SingularAttribute<Phieumuonchitiet, Integer> soluongmuon;
    public static volatile SingularAttribute<Phieumuonchitiet, Phieumuon> phieumuon;

}