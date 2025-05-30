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
1. Các tính chât cua OOP
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
            -> chi extends duoc duy nhat 1 superClass
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
            -> object nay chi truy cap duoc cac attribute / method
                duoc dinh nghia trong SuperClass
            EX: Class A : dibo();
                Class B extends A: dibo();
                                   chaybo();
                A object = new B();
                object.dibo(); -> hop le boi vi A co dibo()
                               -> su dung method dibo() duoc dinh nghia trong B
                object.chaybo(); -> khong hop le boi vi A khong co chaybo()
        + Muc tieu cua da hinh -> su dung ham linh hoat hon
    - Truu tuong:
        + Abstract Method:
            * Access Modifier- abstract - DataType - Name - (Tham so neu co);
             -> khong co phan body
            * Mot class chua abstract method thì phai la abstract class
        + Abstract Class:
            * Là mot class:
                . attribute
                . constructor
                . normal method
            * Có hoac khong abstract method
            * Khong the new abstractClass();
            
        + Interface:
            * Nó không phai class:
                . khong co attribute/ chi co variable
                . khong co constructor -> khong co super
                . khong co normal method / chi co abstract method
            * Môt class thi co the implements nhieu interface
        + SubClass extends AbstractClass hoac implements Interface 
            -> thi bat buoc phai implement/ override abstract method
            -> phai code phan body cho abstract method
            -> hoac la subClass phai tro thanh mot abstract class
        + Muc dich cua abstract Class / interface:
            . Nhac nho subclass phai implement lai abstract method
            . Ngan chan user tao ra mot class khong co ngu nghia trong thuc te
2. Xu ly String
    - charAt(i) : lây ky tu tai vi tri i
    - subString(a,b) : lay chuoi con tu vi tri a den b - 1
    - toUpperCase / toLowerCase : chuyen toan bo thanh chuoi viet hoa / thuong
    - regex
3. Collection
    - List -> ArrayList: truy cap du lieu nhanh -> tim kiem lau
                    +
    - Set -> TreeSet: truy cap du lieu lau -> tim kiem nhanh
    - Map -> HashMap: truy cap du lieu nhanh -> tim kiem nhanh -> ton bo nho
4. File -> LAB211
5. Try catch -> LAB211
 */
 /*
    User -> staff
         -> customer
    Item -> drink
         -> food
 */
public class Tester {

    public static void main(String[] args) {
        Item trasua = new Drink("D001", "Tra Sua", 30000);
        Customer thuy = new Customer("C001", "Do Thanh Thuy", 20);
        thuy.addItem(trasua);
        thuy.addItem(trasua);
        thuy.addItem(trasua);
        System.out.println(trasua.getPrice() * thuy.removeItem(trasua));
        System.out.println(thuy.getCash());
    }
}
