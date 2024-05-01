package structural_patterns.decorator;

public class AdditionalAuthentication extends AuthenticationDecorator {

    Authentication authentication;
    public AdditionalAuthentication(Authentication authentication) {
        super(authentication);
    }

    @Override
    public void authenticate() {
        super.authenticate();
        System.out.println("Additional Authentication");
    }
}
