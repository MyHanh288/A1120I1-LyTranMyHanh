package _finalexam;

public class XachTay extends DienThoai {
    private String quocGiaXachTay;
    private String trangThai;

    public XachTay() {
    }

    public XachTay(String quocGiaXachTay, String trangThai) {
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public XachTay(String iD, String tenDienThoai, int giaBan, int soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(iD, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "XachTay{" +
                "quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai='" + trangThai + '\'' +
                "iD='" + getiD() + '\'' +
                ", tenDienThoai='" + getTenDienThoai() + '\'' +
                ", giaBan=" + getGiaBan() +
                ", soLuong=" + getSoLuong() +
                ", nhaSanXuat='" + getNhaSanXuat() + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
