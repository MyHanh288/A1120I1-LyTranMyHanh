package _exercise.employed;

public class Engineer extends Employed {
    private String nganhDaoTao;

    public Engineer(){
    }

    public Engineer(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public Engineer(String hoTen, String gioiTinh, String diaChi, int namSinh, String nganhDaoTao) {
        super(hoTen, gioiTinh, diaChi, namSinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhap nganh dao tao : ");
        nganhDaoTao = scanner.nextLine();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Nganh dao tao : " + nganhDaoTao);
    }
}
