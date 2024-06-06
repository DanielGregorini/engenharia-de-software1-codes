package pkg;

public class AuthUser {

    private EmailValidator emailValidator;
    private PasswordValidator passwordValidator;

    public AuthUser(EmailValidator emailValidator, PasswordValidator passwordValidator) {
        this.emailValidator = emailValidator;
        this.passwordValidator = passwordValidator;
    }

    public void autenticar(String email, String login, String pass) {
        if (emailValidator.isValid(email) && passwordValidator.isValid(login, pass)) {
            System.out.println("Autenticação bem-sucedida.");
        } else {
            System.out.println("Falha na autenticação.");
        }
    }
}