public class QuizSiteManagerTest {
    public static void main(String[] args) {
        QuizSiteManager quizSiteManager1 = QuizSiteManager.getInstance();
        quizSiteManager1.openSite(); // Opening the quiz site for the first time
        quizSiteManager1.openSite(); // Attempting to open the quiz site again
        quizSiteManager1.closeSite(); // Closing the quiz site
        quizSiteManager1.openSite(); // Closing the quiz site


        QuizSiteManager quizSiteManager2 = QuizSiteManager.getInstance();
        quizSiteManager2.closeSite(); // Attempting to open the quiz site from another instance
    }
}

