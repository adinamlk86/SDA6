package stringoperations;

public class PasswordValidation {


    static boolean lengthCheck(String passwordToBeChecked){
        if(passwordToBeChecked.length()<10){
            return false;
        } else {
            return true;
        }
    }

    static boolean charCheck(String passwordToBeChecked){
        if(passwordToBeChecked.matches("[a-zA-Z0-9]+\\.?")){
            return true;
        } else {
            return false;
        }
    }

    static boolean digitCheck(String passwordToBeChecked){
        int counter =0;
        for(int i=0;i<=passwordToBeChecked.length()-1;i++) {
            char currentLetter = passwordToBeChecked.charAt(i);
            if (Character.isDigit(currentLetter)){
                counter++;
            }
        }

        if(counter<2){
            return false;
        } else {
            return true;
        }


    }

    public static void main(String[] args) {

        String password = "parolaPAROLA1234";
        if(lengthCheck(password) && charCheck(password) && digitCheck(password)){
            System.out.println("Password is valid");
        } else {
            System.out.println("Invalid Password");
        }

    }
}
