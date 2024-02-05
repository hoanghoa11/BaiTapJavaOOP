package JavaOOP03.testcases;

import JavaOOP03.common.BaseTest;
import JavaOOP03.common.Constants;

public class TestCases extends BaseTest {
    public void loginCMS(){
        Constants.setBrowser("FireFox");
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/admin");
        System.out.println("Enter email and password");
        System.out.println("Click login button");
        System.out.println("Verified redirect to Admin page");
        closeDriver();

    }
    public void addCategoryCMS(){
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/admin");
        System.out.println("Enter email and password");
        System.out.println("Click login button");
        System.out.println("Verified redirect to Admin page");

        System.out.println("Click on the Products menu");
        System.out.println("Click on the Category menu");
        System.out.println("Click on the Add New category button");
        System.out.println("Enter all fields on the form create new category");
        System.out.println("Click on the Save button");
        System.out.println(" Verified add New Category successfully");
        closeDriver();

    }

    public static void main(String[] args) {
        TestCases testCases=new TestCases();
        testCases.loginCMS();
        System.out.println("============================");
        testCases.addCategoryCMS();
    }
}
