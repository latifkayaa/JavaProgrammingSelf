package day38_Tasks.browserTask;

public class Test {
    public static void main(String[] args) {

       Safari s1= new Safari();
       s1.openBrowser();
       s1.closeBrowser();

       ChromeBrowser c1= new ChromeBrowser();
       c1.openBrowser();
       c1.closeBrowser();

       Opera o1= new Opera();
       o1.openBrowser();
       o1.closeBrowser();

       FireFox f1= new FireFox();
       f1.openBrowser();
       f1.closeBrowser();



    }
}
