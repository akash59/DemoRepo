package learn.java.Decorator.Pattern.UseCase;

public class PhoneWithParanthesisDecorator extends PhoneDecorator {

    public PhoneWithParanthesisDecorator(IPhoneNumber phone) {
        super(phone);
    }

    public String getValue() {
        String phoneTemplate = "(%s) %s %s";
        return String.format(phoneTemplate, super.areaCode(), super.prefix(), super.lineNumber());
    }
}
