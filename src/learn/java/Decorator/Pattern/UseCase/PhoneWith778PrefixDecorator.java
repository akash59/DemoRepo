package learn.java.Decorator.Pattern.UseCase;

public class PhoneWith778PrefixDecorator extends PhoneDecorator {

    public PhoneWith778PrefixDecorator(IPhoneNumber phone) {
        super(phone);
    }

    public String getValue() {
        String phoneTemplate = "%s %s %s";

        return String.format(phoneTemplate,
                "778",
                super.prefix(),
                super.lineNumber());
    }

}
