package pkg;

public class WeakEmailValidator implements EmailValidator {
    @Override
    public boolean isValid(String email) {
        return email.contains("@") && email.contains(".com");
    }
}