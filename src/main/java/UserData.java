public class UserData {
    public String email;
    public String password;
    public String name;

    public String getEmail() {
        return email;
    }

    public UserData(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserData(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}
