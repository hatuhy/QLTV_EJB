package entity.example.com;

import entity.example.com.Phieumuonchitiet;
import entity.example.com.Theloai;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-14T09:14:41")
@StaticMetamodel(Tailieu.class)
public class Tailieu_ { 

    public static volatile CollectionAttribute<Tailieu, Phieumuonchitiet> phieumuonchitietCollection;
    public static volatile SingularAttribute<Tailieu, String> nhaxuatban;
    public static volatile SingularAttribute<Tailieu, Integer> giatien;
    public static volatile SingularAttribute<Tailieu, String> tentailieu;
    public static volatile SingularAttribute<Tailieu, Date> namxuatban;
    public static volatile SingularAttribute<Tailieu, Theloai> matheloai;
    public static volatile SingularAttribute<Tailieu, Integer> soluong;
    public static volatile SingularAttribute<Tailieu, String> matailieu;
    public static volatile SingularAttribute<Tailieu, String> tacgia;

}