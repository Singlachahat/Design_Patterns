public class QuizSiteManager {
    private static QuizSiteManager instance;
    private boolean siteOpened;

    private QuizSiteManager() {
        // Private constructor to prevent instantiation
        siteOpened = false;
    }

    public static QuizSiteManager getInstance() {
        if (instance == null) {
            instance = new QuizSiteManager();
        }
        return instance;
    }

    public synchronized void openSite() {
        if (!siteOpened) {
            System.out.println("Quiz site opened successfully.");
            siteOpened = true;
        } else {
            System.out.println("Quiz site is already opened in another device/browser.");
        }
    }

    public synchronized void closeSite() {
        if (siteOpened) {
            System.out.println("Quiz site closed successfully.");
            siteOpened = false;
        } else {
            System.out.println("Quiz site is not opened.");
        }
    }
}
