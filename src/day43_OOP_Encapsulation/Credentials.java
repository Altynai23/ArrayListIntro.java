package day43_OOP_Encapsulation;

public class Credentials {

    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username); // only sets the username if username starts with a letter and username at least is 5 characters long
        setPassword(password); // only sets the password, if the password is strong password
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        boolean startsWithLetter = Character.isLetter(username.charAt(0));
        if(!startsWithLetter){ // if first character of the user name is not a letter
            return; // exit the method
        }

        if( username.length() < 5){ // if length of the username is less than 5
            return; // exit
        }

        this.username = username;
    }

    public void setPassword(String password) {
        if(!isStrongPassword(password)){ // if the given password is not a strong password
            return; // exit the method
        }
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static boolean isStrongPassword(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" ") && !password.contains(",");
        boolean r2 = false,
                r3 = false,
                r4 = false;

        for (char each : password.toCharArray()) {
            if (Character.isLetter(each)) { // if the character is letter
                r2 = true;
            } else if (!Character.isLetterOrDigit(each)) { // if the character is special character
                r3 = true;
            } else {
                r4 = true;
            }
        }

        return r1 && r2 && r3 && r4;

    }
}
