package _b9_list.bai_tap.array_list;

public class TestMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Student a = new Student(1, "Hoa");
            Student b = new Student(2, "Hoan");
            Student c = new Student(3, "Hong");
            Student d = new Student(4, "Ha");
            Student e = new Student(5, "Hanh");
            Student f = new Student(6, "Hai");
            MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
            studentMyArrayList.add(a);
            studentMyArrayList.add(b);
            studentMyArrayList.add(c);
            studentMyArrayList.add(d);
            studentMyArrayList.add(e);
            studentMyArrayList.add(f,2);
            for (int i = 0; i< (studentMyArrayList).size(); i++){
                Student student = (Student) studentMyArrayList.elements[i];
                System.out.println(student.getId());
                System.out.println(student.getName());
            }
        }
    }
}
