package Day13_SwitchStatement;

public class SwtichStatementPratice3 {

    public static void main(String[] args) {
        String browser = "Firefox";
        String selectedBrowser = "";


        switch (browser){ //chrome

            case "chrome":
                selectedBrowser = "CHROME BROWSER";
                break;

            case "Firefox":
                selectedBrowser = "FIREFOX BROWSER";
                break;

            case "opera":
                selectedBrowser = "OPERA BROWSER";
                break;

            case "safari": selectedBrowser = "SAFARI BROWSER";
                break;

            case "edge": selectedBrowser = "EDGE BROWSER";
                break;

            case "ie": selectedBrowser = "INTERNET EXPLORER";
                break;


            default: selectedBrowser = "INVALID BROWSER NAME";



        }
        System.out.println(selectedBrowser);
    }

}
