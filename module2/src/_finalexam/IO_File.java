package _finalexam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IO_File {
    public static final String ChinhHang_Link  = "D:\\A1120I1-LyTranMyHanh\\module2\\src\\_finalexam\\ChinhHang.csv";
    public static final String XachTay_Link  = "D:\\A1120I1-LyTranMyHanh\\module2\\src\\_finalexam\\XachTay.csv";
    public static final String COMMA = ",";
    public static void writeChinhHang(ChinhHang chinhHang){
        File file = new File(ChinhHang_Link);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(chinhHang.getiD()+ COMMA +chinhHang.getTenDienThoai()+ COMMA +chinhHang.getGiaBan()+ COMMA +chinhHang.getSoLuong()+ COMMA +chinhHang.getNhaSanXuat()+ COMMA +chinhHang.getThoiGianBaoHanh()+ COMMA +chinhHang.getPhamViBaoHanh() + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeXachTay(XachTay xachTay){
        File file = new File(XachTay_Link);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(xachTay.getiD()+ COMMA +xachTay.getTenDienThoai()+ COMMA +xachTay.getGiaBan()+ COMMA +xachTay.getSoLuong()+ COMMA +xachTay.getNhaSanXuat()+ COMMA +xachTay.getQuocGiaXachTay()+ COMMA +xachTay.getTrangThai()+ "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<ChinhHang> readChinhHang() throws IOException {
        List<ChinhHang> chinhHangList = new ArrayList<>();
        File file = new File(ChinhHang_Link);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            ChinhHang chinhHang;
            String[] temp;
            while ((line = bufferedReader.readLine()) !=null && !line.isEmpty()){
                temp = line.split(",");
                chinhHang = new ChinhHang(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5], temp[6]);
                chinhHangList.add(chinhHang);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return chinhHangList;
    }

    public static List<XachTay> readXachTay() throws IOException {
        List<XachTay> xachTayList = new ArrayList<>();
        File file = new File(XachTay_Link);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            XachTay xachTay;
            String[] temp;
            while ((line = bufferedReader.readLine()) !=null && !line.isEmpty()){
                temp = line.split(",");
                xachTay = new XachTay(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5], temp[6]);
                xachTayList.add(xachTay);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return xachTayList;
    }
}
