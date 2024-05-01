package structural_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        // Create a user with basic authentication
        Authentication user1 = new BasicAuthenticate();
        user1.authenticate();

        // Dynamically add additional authentication
        Authentication userAuthentication = new AdditionalAuthentication(user1);
        userAuthentication.authenticate();
    }
}
