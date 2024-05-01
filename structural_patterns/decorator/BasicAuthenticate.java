package structural_patterns.decorator;

public class BasicAuthenticate implements Authentication{
    @Override
    public void authenticate() {
        System.out.println("Basic Authentication");
    }

}
