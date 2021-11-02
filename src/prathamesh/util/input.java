package prathamesh.util;

import java.util.Scanner;

public class input {
    public int length;
    public boolean includeSymbols;
    public boolean includeNumbers;
    public boolean includeLowercase;
    public boolean includeUppercase;
    private final Scanner sc = new Scanner(System.in);

    public input(){
        print("Enter length of the password: ");
        this.length = check();
        print("Include symbols? (e.g. @#$%)");
        this.includeSymbols = checkInput();
        print("Include numbers? (e.g. 1234)");
        this.includeNumbers = checkInput();
        print("Include lowercase letters? (e.g. abcd)");
        this.includeLowercase = checkInput();
        print("Include uppercase letters? (e.g. ABCD)");
        this.includeUppercase = checkInput();
        invalidInput();
    }

    private void print(String str){System.out.println(str);}
    private boolean checkInput(){
        String string = sc.next();
        while (!string.equalsIgnoreCase("yes") && !string.equalsIgnoreCase("no")){
            print("Invalid input! Type YES or NO");
            string = sc.next();
        }
        return string.equalsIgnoreCase("yes");
    }
    private int check(){
        int num;
        while (!sc.hasNextInt()){
            print("Invalid input! Only numeric values allowed");
            sc.next();
        }
        num = sc.nextInt();
        while (!(num > 0)){
            print("Password length must be more than 0!");
            num = sc.nextInt();
        }
        return num;
    }
    private void invalidInput(){
        if (!(includeSymbols || includeNumbers || includeUppercase || includeLowercase)){
            print("Select at least one option to get password.");
            System.exit(0);
        }
    }
}
