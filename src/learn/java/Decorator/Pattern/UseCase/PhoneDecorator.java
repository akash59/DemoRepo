package learn.java.Decorator.Pattern.UseCase;

import java.util.List;

public abstract class PhoneDecorator implements IPhoneNumber {

    private IPhoneNumber decoratedPhone;

    public PhoneDecorator(IPhoneNumber phoneNumber) {
        this.decoratedPhone = phoneNumber;
    }

    public String getValue() {
        return decoratedPhone.getValue();
    }

    public List<Integer> getDigits() {
        return decoratedPhone.getDigits();
    }

    public String areaCode() {
        return decoratedPhone.areaCode();
    }

    public String prefix() {
        return decoratedPhone.prefix();
    }

    public String lineNumber() {
        return decoratedPhone.lineNumber();
    }



}
