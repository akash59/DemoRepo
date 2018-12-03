package learn.java.Decorator.Pattern.UseCase;

public class PhoneWith604PrefixDecorator extends PhoneDecorator {

    public PhoneWith604PrefixDecorator(IPhoneNumber phone) {
        super(phone);
    }

    public String getValue() {
        String phoneTemplate = "%s %s %s";

        return String.format(phoneTemplate,
                "604",
                super.prefix(),
                super.lineNumber());
    }

}
