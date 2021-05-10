package _casestudy.controllers;

import _b15_IO_Text_File.bai_tap.copy_file_text.Student;
import _casestudy.models.House;
import _casestudy.models.Room;
import _casestudy.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IO_Services {
    public static final String House_Link  = "D:\\A1120I1-LyTranMyHanh\\module2\\src\\_casestudy\\controllers\\house.csv";
    public static final String Villa_Link  = "D:\\A1120I1-LyTranMyHanh\\module2\\src\\_casestudy\\controllers\\villa.csv";
    public static final String Room_Link  = "D:\\A1120I1-LyTranMyHanh\\module2\\src\\_casestudy\\controllers\\room.csv";
    public static final String COMMA = ",";

    public static void writeHouse(House house){
        File file = new File(House_Link);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(house.getId()+ COMMA +house.getNameService()+ COMMA +house.getUsedArea()+ COMMA +house.getCost()+ COMMA +house.getMaxMember()+ COMMA +house.getRentType()+ COMMA +house.getPlusServices() +COMMA +house.getFacilitiesDes()+ COMMA +house.getRoomStandard()+ COMMA +house.getFloors()+"\n");
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

    public static void writeVilla(Villa villa){
        File file = new File(Villa_Link);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(villa.getId()+ COMMA +villa.getNameService()+ COMMA +villa.getUsedArea()+ COMMA +villa.getCost()+ COMMA +villa.getMaxMember()+ COMMA +villa.getRentType()+ COMMA +villa.getPlusServices()+ COMMA +villa.getFacilitiesDes()+ COMMA +villa.getRoomStandard()+ COMMA +villa.getFloors()+ COMMA +villa.getPoolArea()+"\n");
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

    public static void writeRoom(Room room){
        File file = new File(Room_Link);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(room.getId()+ COMMA +room.getNameService()+ COMMA +room.getUsedArea()+ COMMA +room.getCost()+ COMMA +room.getMaxMember()+ COMMA +room.getRentType()+ COMMA +room.getPlusServices() + COMMA +room.getFreeService() +"\n");
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

    public static List<House> readHouse() throws IOException {
        List<House> houseList = new ArrayList<>();
        File file = new File(House_Link);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            House house;
            String[] temp;
            while ((line = bufferedReader.readLine()) !=null && !line.isEmpty()){
                temp = line.split(",");
                house = new House(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], temp[7], temp[8], Integer.parseInt(temp[9]));
                houseList.add(house);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }return houseList;
    }

    public static List<Villa> readVilla() throws IOException {
        List<Villa> villaList = new ArrayList<>();
        File file = new File(Villa_Link);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Villa villa;
            String[] temp;
            while ((line = bufferedReader.readLine()) !=null && !line.isEmpty()){
                temp = line.split(",");
                villa = new Villa(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], temp[7], temp[8], Integer.parseInt(temp[9]),Integer.parseInt(temp[10]));
                villaList.add(villa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }return villaList;
    }

    public static List<Room> readRoom() throws IOException {
        List<Room> roomList = new ArrayList<>();
        File file = new File(Room_Link);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Room room;
            String[] temp;
            while ((line = bufferedReader.readLine()) !=null && !line.isEmpty()){
                temp = line.split(",");
                room = new Room(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], temp[7]);
                roomList.add(room);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }return roomList;
    }

}
