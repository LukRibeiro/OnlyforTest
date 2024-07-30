package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class AbrirNavegadorTest {


    static WebDriver driver;

    @Rule
    public TestName test = new TestName();


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lscb\\Drivers\\chromedriver.exe");


        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @Test
    public void Cadastro() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://www.dafiti.com.br/");





        Thread.sleep(2000);



        assertEquals(1,1);

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        //   driver.quit();
    }

}