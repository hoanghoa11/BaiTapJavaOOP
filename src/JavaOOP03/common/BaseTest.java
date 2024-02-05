package JavaOOP03.common;

public class BaseTest extends Constants {
    public void createDriver (){
        System.out.println("Open brower:"+browser+" Report: "+report+ " Header: "+ headless );
    }
    public void closeDriver(){
        System.out.println("Closed browser: "+browser);
    }
    public void closeDriver(String Browser){
        System.out.println("Closed browser: "+Browser);
    }
}
