package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class utilities_for_login {
    public final static List<String> userList = new ArrayList<>(Arrays.asList("User166","User167","User168","User169","User170","User171"));
    public final static List<String> storemanger=new ArrayList<>(Arrays.asList("storemanager83","storemanager84","storemanager85","storemanager86"));
    public final static List<String> salesmanager=new ArrayList<>(Arrays.asList("salesmanager251","salesmanager252","salesmanager253","salesmanager254"));
    public final static String password = "UserUser123";
    public static String wrongPassword ="useuse";
    public static String [] wrongUsername = {"hrhr@.cydeo.com","market68@cydeo.com","help69@cydeo.com","   "};
    public static String actual_incorrectLoginOrPassword;
    public static String expected_incorrectLoginOrPassword="Incorrect login or password";


}
