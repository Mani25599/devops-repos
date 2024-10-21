the 
package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Dynamictables {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver.navigate().to("https://demo.applitools.com/index.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("log-in")).click();
     WebElement table=   driver.findElement(By.tagName("table"));
        List<WebElement> tableheader=table.findElements(By.tagName("thead"));
        int headcount= tableheader.size();
        System.out.println("the header size"+headcount);
        for (WebElement data:tableheader){
            String textdata= data.getText();
            System.out.println(textdata);
        }
        List<WebElement> rows=table.findElements(By.xpath("//tbody/tr"));
       int rowscount= rows.size();
        System.out.println("the row size"+rowscount);
        for (int i = 0; i <rows.size()-1 ; i++) {


          List  <WebElement> texdata = rows.get(i).findElements(By.tagName("td"));
            WebElement status=texdata.get(0);
          String data=status.getText();
            if(data.equals("Penidng")){
                System.out.println(data);
            }

            }
        }


    }


