package learn.java.Decorator.Pattern.UseCase;

import java.util.Arrays;
import java.util.List;

public class TestPhoneNumber {

    private final static List<Integer> TEN_DIGITS = Arrays.asList(4, 6, 1, 2, 3, 2, 6, 7, 4, 5);


    public void testPhoneTemplates() {

        IPhoneNumber phone1 = new PhoneNumber(TEN_DIGITS);
        System.out.println(phone1.getValue());

        IPhoneNumber phone2 = new PhoneWithParanthesisDecorator(new PhoneNumber(TEN_DIGITS));
        System.out.println("Phone Number with Paranthesis - " +phone2.getValue());

        IPhoneNumber phone3 = new PhoneWithHyphensDecorator(new PhoneNumber(TEN_DIGITS));
        System.out.println("Phone Number with Hyphens - " +phone3.getValue());

        IPhoneNumber phone4 = new PhoneWith604PrefixDecorator(new PhoneNumber(TEN_DIGITS));
        System.out.println("Phone Number with 604 Prefix - " +phone4.getValue());

        IPhoneNumber phone5 = new PhoneWith778PrefixDecorator(new PhoneNumber(TEN_DIGITS));
        System.out.println("Phone Number with 778 Prefix - " +phone5.getValue());

    }

    public static void main(String args[]) {

        TestPhoneNumber testPhone = new TestPhoneNumber();
        testPhone.testPhoneTemplates();

    }

}
