
import pkg.*;

public class App {
    public static void main(String[] args) throws Exception {
        EmailValidator emailValidator = new SimpleEmailValidator();
        PasswordValidator passwordValidator = new SimplePasswordValidator();

        AuthUser authUser = new AuthUser(emailValidator, passwordValidator);

        // Testando a autenticação
        System.out.println("Hello, World!");
        authUser.autenticar("test@example.com", "user", "password123");
    }
}
