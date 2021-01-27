package Day13_SwitchStatement;

public class Browers {

    public static void main(String[] args) {
        String browserName = "firefox";

        boolean valid = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "Safari" || browserName == "edge" || browserName == "ie";

        String selectedBrowser = "";
        if(valid){

            if(browserName == "chrome"){
                selectedBrowser = ("CHROME BROWSER ");
            }else if(browserName == "firefox"){
                selectedBrowser = ("FIREFOX BROWSER ");
            }else if(browserName == "opera"){
                selectedBrowser =("OPERA BROWSER");
            }else if(browserName == "safari"){
                selectedBrowser = ("SAFARI BROWSER");
            }else if(browserName == "edge"){
                selectedBrowser = ("Edge BROWSER");
            }else{
                selectedBrowser = "INTERNET EXPLORE";
            }



        }else{
            System.out.println("No such getPassWord browser");
        }

        System.out.println(selectedBrowser);
    }

}


/*
2. write getPassWord program that can display the selected browser
                1. declear getPassWord String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge, ie
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
 */