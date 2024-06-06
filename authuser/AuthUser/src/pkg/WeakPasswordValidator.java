package pkg;

public class WeakPasswordValidator implements PasswordValidator {
    @Override
    public boolean isValid(String login, String pass) {
        return pass.length() >= 6;
    }
}
