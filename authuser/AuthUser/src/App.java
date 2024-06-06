import pkg.*;

public class App {
    public static void main(String[] args) throws Exception {

        StrongEmailValidator strongEmailValidator = new StrongEmailValidator();
        WeakEmailValidator emailValidator = new WeakEmailValidator();

        StrongPasswordValidator strongPasswordValidator = new StrongPasswordValidator ();

        WeakPasswordValidator  weakPasswordValidator = new  WeakPasswordValidator();
        
        AuthUser authUser_ = new AuthUser(strongEmailValidator, strongPasswordValidator);

        authUser_.autenticar("laerte@gmail.coM","LaerteNovinho2004", "dhtFTGVt567FDvgdd@");
    }
}
