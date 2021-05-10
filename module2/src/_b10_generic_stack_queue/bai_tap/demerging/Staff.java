package _b10_generic_stack_queue.bai_tap.demerging;

public class Staff {
    private String name;
    private String gender;

    public Staff() {
    }

    public Staff(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Staff{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + '}';
    }
}
