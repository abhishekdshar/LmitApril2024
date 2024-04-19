package hookspack;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resuable.BaseCode;

import java.io.IOException;

public class Hooks {

    @Before()
    public void preCondition() throws IOException {
        System.out.println("Execution Starts...........");
        BaseCode.lauchBrowser();
         }

    @After()
    public void postCondition(){

        System.out.println("Execution Ended");
    }


}
