package learn.java.Decorator.Pattern.UseCase;

import java.util.List;

public interface IPhoneNumber {

    public String getValue();

    public List<Integer> getDigits();

    public String areaCode();

    public String prefix();

    public String lineNumber();

}
