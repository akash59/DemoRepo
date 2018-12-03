package learn.java.Decorator.Pattern.UseCase;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberWithParenthesis implements IPhoneNumber {

    private final String phoneTemplate = "(%s) %s %s";
    private List<Integer> digits = new ArrayList<>();

    public PhoneNumberWithParenthesis(List<Integer> digits) {
        if (digits.size() != 10)
            throw new RuntimeException("there are less than 10 digits!");

        this.digits = digits;
    }

    public String getValue() {
        return String.format(phoneTemplate,
                areaCode(),
                prefix(),
                lineNumber());
    }

    public List<Integer> getDigits() {
        return this.digits;
    }

    public String areaCode() {
        return String.format("%d%d%d",
                digits.get(0),
                digits.get(1),
                digits.get(2));
    }

    public String prefix() {
        return String.format("%d%d%d",
                digits.get(3),
                digits.get(4),
                digits.get(5));
    }

    public String lineNumber() {
        return String.format("%d%d%d%d",
                digits.get(6),
                digits.get(7),
                digits.get(8),
                digits.get(9));
    }

    @Override
    public String toString() {
        return this.digits.toString();
    }
}
