package _exercise.employed;

public class Staff extends Employed {
    private String congViec;

    public Staff(){
    }

    public Staff(String congViec) {
        this.congViec = congViec;
    }

    public Staff(String hoTen, String gioiTinh, String diaChi, int namSinh, String congViec) {
        super(hoTen, gioiTinh, diaChi, namSinh);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhap cong viec : ");
        congViec = scanner.nextLine();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Cong viec : " + congViec);
    }
}
