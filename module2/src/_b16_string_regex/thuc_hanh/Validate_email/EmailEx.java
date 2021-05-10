package _b16_string_regex.thuc_hanh.Validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailEx {

    public static final String EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(EMAIL);
        Matcher matcher = pattern.matcher("hanh@gmail.com");
        System.out.println(matcher.matches());
    }


}
