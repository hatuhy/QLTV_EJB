package entity.example.com;

import entity.example.com.Phieumuon;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-14T09:14:41")
@StaticMetamodel(Docgia.class)
public class Docgia_ { 

    public static volatile SingularAttribute<Docgia, Integer> madocgia;
    public static volatile SingularAttribute<Docgia, String> tendocgia;
    public static volatile SingularAttribute<Docgia, Date> ngaycap;
    public static volatile SingularAttribute<Docgia, Integer> soluongmoitailieu;
    public static volatile SingularAttribute<Docgia, Integer> soluongtailieu;
    public static volatile CollectionAttribute<Docgia, Phieumuon> phieumuonCollection;
    public static volatile SingularAttribute<Docgia, String> gioitinh;
    public static volatile SingularAttribute<Docgia, String> doituong;
    public static volatile SingularAttribute<Docgia, Date> ngayhethan;
    public static volatile SingularAttribute<Docgia, Date> ngaysinh;
    public static volatile SingularAttribute<Docgia, Integer> songaymuon;

}