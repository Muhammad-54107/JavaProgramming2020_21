package Office_Hours.Pratice_10_28_2020;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abab"; // getPassWord, b, getPassWord, b

        String nonDup = "";
        // "ab" //  if the character is not exist in nonDup, then we can concate it

        for(int i = 0; i < str.length(); i++){
         String eachChar = ""+str.charAt(i); //each of the character in str

         if(nonDup.contains(    eachChar )) {  // if the charaxcter is already contains in nonDup
             continue;   // skip it
         }else{
             nonDup += str.charAt(i);
         }

        }

        System.out.println(nonDup);
    }
}
