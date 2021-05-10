package _finalexam;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    IO_File io_file = new IO_File();

    public void displayMainMenu() throws IOException {
        int choose = 0;
        while (true) {
            System.out.println("--Chuong trinh quan ly dien thoai--");
            System.out.println("Chon chuc nang theo so (de tiep tuc): ");
            System.out.println("1. Them moi\n" +
                    "2. Xoa\n" +
                    "3. Xem danh sach dien thoai\n" +
                    "4. Tim kiem\n" +
                    "5. Thoat\n");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    themMoi();
                    displayMainMenu();
                    break;
                case 2:
                    xoa();
                    displayMainMenu();
                    break;
                case 3:
                    xemDanhSachDienThoai();
                    break;
                case 4:
                    timKiem();
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon cua ban chua dung !!!");
            }
        }
    }

    private void timKiem() {
    }

    private void xemDanhSachDienThoai() throws IOException {
        int choose = 0;
        while (true){
            System.out.println("Chon loai dien thoai can xem :");
            System.out.println("1. Xem dien thoai chinh hang\n" +
                    "2. Xem dien thoai xach tay\n" +
                    "3. Quay ve menu chinh\n" +
                    "4. Thoat\n");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println(io_file.readChinhHang());
                    break;
                case 2:
                    System.out.println(io_file.readXachTay());
                    break;
                case 3:
                    displayMainMenu();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lua chon cua ban chua dung !!! ");
            }
        }
    }

    private void xoa() {
    }

    private void themMoi() throws IOException {
        int choose = 0;
        while (true){
            System.out.println("Chon loai dien thoai can them moi :");
            System.out.println("1. Them dien thoai chinh hang\n" +
                    "2. Them dien thoai xach tay\n" +
                    "3. Quay ve menu chinh\n" +
                    "4. Thoat\n");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    themDienThoaiChinhHang();
                    break;
                case 2:
                    themDienThoaiXachtay();
                    break;
                case 3:
                    displayMainMenu();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon cua ban chua dung !!!");
            }
        }
    }

    private void themDienThoaiXachtay() {
        System.out.println("ID :");
        String iD = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ten dien thoai :");
        String tenDienThoai = scanner.nextLine();
        System.out.println("Gia ban : ");
        int giaBan = scanner.nextInt();
        System.out.println("So luong : ");
        int soLuong = scanner.nextInt();
        System.out.println("Nha san xuat :");
        String nhaSanXuat = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Quoc gia xach tay :");
        String quocGiaXachTay = scanner.nextLine();
        System.out.println("Trang thai :");
        String trangThai = scanner.nextLine();
        XachTay xachTay = new XachTay(iD, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGiaXachTay, trangThai);
        io_file.writeXachTay(xachTay);
    }

    private void themDienThoaiChinhHang() {
        System.out.println("ID :");
        String iD = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ten dien thoai :");
        String tenDienThoai = scanner.nextLine();
        System.out.println("Gia ban : ");
        int giaBan = scanner.nextInt();
        System.out.println("So luong : ");
        int soLuong = scanner.nextInt();
        System.out.println("Nha san xuat :");
        String nhaSanXuat = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Thoi gian bao hanh :");
        String thoiGianBaoHanh = scanner.nextLine();
        System.out.println("Pham vi bao hanh :");
        String phamViBaoHanh = scanner.nextLine();
        ChinhHang chinhHang = new ChinhHang(iD, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh);
        io_file.writeChinhHang(chinhHang);
    }

    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }
}
