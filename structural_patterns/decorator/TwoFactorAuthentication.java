package structural_patterns.decorator;

public class TwoFactorAuthentication extends AuthenticationDecorator {
    public TwoFactorAuthentication(Authentication authentication) {
        super(authentication);
    }

    @Override
    public void authenticate() {
        super.authenticate();
        System.out.println("Two factor Authentication");
    }
}
