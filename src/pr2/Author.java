package pr2;

public class Author {
    private String name = "Салман", email;
    private char gender = 'M';
    public String getname() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return "Name "+name+ " email "+ email+" gender "+ gender;
    }
    }

