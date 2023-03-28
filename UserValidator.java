package ustbatchno3.exception;

/**
 * Hello world!
 *
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    private static final String NAME_REGEX = "[a-zA-Z\\s]+";
    private static final String PHONE_NUMBER_REGEX = "\\d{3}-\\d{3}-\\d{4}";
    private static final String LOCATION_REGEX = "[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*";
    private static final String EMAIL_REGEX = "^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$";
    private static final String ADDRESS_REGEX = "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)";
    
    public static boolean validateName(String name) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean validateLocation(String location) {
        Pattern pattern = Pattern.compile(LOCATION_REGEX);
        Matcher matcher = pattern.matcher(location);
        return matcher.matches();
    }

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validateAddress(String address) {
        Pattern pattern = Pattern.compile(ADDRESS_REGEX);
        Matcher matcher = pattern.matcher(address);
        return matcher.matches();
    }

    public static void main(String[] args) {
        try {
            String name = "John Smith";
            if (!validateName(name)) {
                throw new Exception("Invalid name format");
            }
            String phoneNumber = "123-456-7890";
            if (!validatePhoneNumber(phoneNumber)) {
                throw new Exception("Invalid phone number format");
            }
            String location = "New York";
            if (!validateLocation(location)) {
                throw new Exception("Invalid location format");
            }
            String email = "john.smith@example.com";
            if (!validateEmail(email)) {
                throw new Exception("Invalid email format");
            }
            String address = "123 Main St";
            if (!validateAddress(address)) {
                throw new Exception("Invalid address format");
            }
            
            System.out.println("User input is valid");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}