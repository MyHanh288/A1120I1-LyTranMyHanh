package _b15_IO_Text_File.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static final String File_Path  = "D:\\A1120I1-LyTranMyHanh\\module2\\src\\_b15_IO_Text_File\\bai_tap\\copy_file_text\\student.csv";

    public static void writeCSV(Student student){
        File file = new File(File_Path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student.getId()+ "," +student.getName()+"\n");
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

    public static List<Student> readCSV() throws IOException {
        List<Student> studentList = new ArrayList<>();
        File file = new File(File_Path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Student student;
            String[] temp;
            while ((line = bufferedReader.readLine()) !=null && !line.isEmpty()){
                temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]), temp[1]);
                studentList.add(student);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }return studentList;
    }

    public static void main(String[] args) throws IOException {
       // writeCSV(new Student(2,"Phuc"));
        List<Student> studentList = readCSV();
         for(Student student:studentList){
             System.out.println(student);
         }
    }
}
