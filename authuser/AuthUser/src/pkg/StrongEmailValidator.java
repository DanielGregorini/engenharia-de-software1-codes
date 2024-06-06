package pkg;

public class StrongEmailValidator implements EmailValidator {
    @Override
    public boolean isValid(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
}