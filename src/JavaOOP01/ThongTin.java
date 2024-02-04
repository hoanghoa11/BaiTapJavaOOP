package JavaOOP01;

public class ThongTin  {
    public static void main(String[] args) {
        NhanVien nv=new NhanVien();
        nv.setHoTen("Hoàng Thị Hòa");
        nv.setTuoi(12);

        System.out.println("Họ tên:"+nv.getHoTen());
        System.out.println("Tuổi:"+nv.getTuoi());
    }
}
