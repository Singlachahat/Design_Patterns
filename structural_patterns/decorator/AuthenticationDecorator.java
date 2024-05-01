package structural_patterns.decorator;

public abstract class AuthenticationDecorator implements Authentication{
    protected Authentication authentication;

    public AuthenticationDecorator(Authentication authentication) {
        this.authentication = authentication;
    }

    @Override
    public void authenticate() {
        authentication.authenticate();
    }
}
