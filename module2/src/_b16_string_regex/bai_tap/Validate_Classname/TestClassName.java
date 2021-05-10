package _b16_string_regex.bai_tap.Validate_Classname;

import _b16_string_regex.thuc_hanh.Validate_account.AccountExample;

public class TestClassName {
    private static ClassName className;
    public static final String[] validClassName = new String[] { "C0318G" };
    public static final String[] invalidClassName = new String[] { "M0318G", "P0323A", };

    public static void main(String args[]) {
        className = new ClassName();
        for (String classname : validClassName) {
            boolean isvalid = className.validate(classname);
            System.out.println("ClassName is " + classname +" is valid: "+ isvalid);
        }
        for (String classname : invalidClassName) {
            boolean isvalid = className.validate(classname);
            System.out.println("ClassName is " + classname +" is valid: "+ isvalid);
        }
    }

}
