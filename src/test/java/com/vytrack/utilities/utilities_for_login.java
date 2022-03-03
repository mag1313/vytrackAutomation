package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class utilities_for_login {
    public static List<String> userList = new ArrayList<>(Arrays.asList(""));
    public static WebDriver driver;
    public static String password = "UserUser";
    public static String wrongPassword ="useuse";
    public static String [] wrongUsername = {"hrhr@.cydeo.com","market68@cydeo.com","help69@cydeo.com","   "};
    public static String actual_incorrectLoginOrPassword;
    public static String expected_incorrectLoginOrPassword="Incorrect login or password";
}
