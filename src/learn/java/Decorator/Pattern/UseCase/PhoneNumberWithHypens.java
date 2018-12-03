package learn.java.Decorator.Pattern.UseCase;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberWithHypens implements IPhoneNumber{

    private final String phoneTemplate = "%s-%s-%s";
    private List<Integer> digits = new ArrayList<>();

    public PhoneNumberWithHypens(List<Integer> digits) {
        if (digits.size() != 10)
            throw new RuntimeException("there are less than 10 digits!");

        this.digits = digits;
    }
    @Override
    public String getValue() {
        return String.format(phoneTemplate,
                areaCode(),
                prefix(),
                lineNumber());
    }

    @Override
    public List<Integer> getDigits() {
        return this.digits;
    }

    @Override
    public String areaCode() {
        return String.format("%d%d%d",
                digits.get(0),
                digits.get(1),
                digits.get(2));
    }

    @Override
    public String prefix() {
        return String.format("%d%d%d",
                digits.get(3),
                digits.get(4),
                digits.get(5));
    }

    @Override
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
