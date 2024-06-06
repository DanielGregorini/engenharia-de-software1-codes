package pkg;

public class StrongPasswordValidator implements PasswordValidator {
    @Override
    public boolean isValid(String login, String pass) {
        return pass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }
}
