package day45_Tasks.browserTask;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver driver1 = new ChromeDriver();
        System.out.println(driver1.getBrowserName());

        driver1.get("www.google.com");

        driver1.getTitle();

        driver1.executeScript("html");

        driver1.findElement("search");

        driver1.findElements("searchs");

        driver1.close();
        driver1.quit();


    }
}
