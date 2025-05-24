package packageA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuon
 */
/*
Các tính chât cua OOP
    - Ðóng gói:
        + Class: là mot khuôn
            * Thuoc tinh / Attribute / Member
            * Phuong thuc / Method / Behavior
                . Hàm Tao / Constructor -> Gan du lieu ban dau cho Attribute
                                            di kem voi toan tu new
                                            new -> cap phat bo nho
                . Getter -> dùng de lay du lieu cua Attribute
                . Setter -> dung de gan du lieu cua Attribute
                . toString -> dung de the hien object duoi dang String
                           -> khi print object khong can goi toString
                . user method
        + Object: là doi tuong duoc tao ra tu Class
            * ClassName objectName = new classConstructor();
        + Muc tieu cua dong goi la de che giau du lieu -> access modifier
            * private -> chi class do duoc dung
            * default -> chi trong package la duoc dung
            * protected -> chi trong package hoac subclass -----
            * public -> dung o moi noi
    - Ke thua:
        + SubClass se ke thua lai thuoc tinh va phuong thuc cua SuperClass
            -> thong qua tu khoa extends superClass
        + Tu khoa this -> object tai subClass và super object tai superClass
        + Constructor cua super -> super();
        + Muc dich cua ke thua la tai su dung code
    - Da hinh:
        + Viec mot ten method cua mot class/object co the co nhieu hanh vi
            -> tuy thuoc vao cach khai bao object và cach su dung method
        + Overriding:
            * subClass se ghi de lai method cua superClass
            * khi khoi tao new subClass thi su dung method cua subClass
            * Anotation: @Override
        + Overloading:
            * Cac method trong mot class duoc phep cung tên nhung phai 
                                                    khac tham so
        + Duoc phep khai bao mot object nhu sau:
            * SuperClass object = new SubClass();
        


*/
public class Tester {
    protected int test;

}
