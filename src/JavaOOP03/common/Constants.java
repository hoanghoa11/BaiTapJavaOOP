package JavaOOP03.common;

public class Constants {
    static String browser ="Chrome";
    static boolean report=true ;
    static boolean headless = false;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }
}
