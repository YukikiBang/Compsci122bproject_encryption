import org.jasypt.util.password.StrongPasswordEncryptor;

public class EncryptOnePassword {
    public static void main(String[] args) {
        String encrypted = new StrongPasswordEncryptor().encryptPassword("classta");
        System.out.println(encrypted);
    }
}