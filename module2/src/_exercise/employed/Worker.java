package _exercise.employed;

public class Worker extends Employed {
    private double bac;

    public Worker(){
    }

    public Worker(double bac) {
        this.bac = bac;
    }

    public Worker(String hoTen, String gioiTinh, String diaChi, int namSinh, double bac) {
        super(hoTen, gioiTinh, diaChi, namSinh);
        this.bac = bac;
    }

    public double getBac() {
        return bac;
    }

    public void setBac(double bac) {
        this.bac = bac;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhap bac : ");
        bac = scanner.nextDouble();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Bac : " + bac);
    }


}
