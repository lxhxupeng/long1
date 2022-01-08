package library.PO;

public class User {
    private String id;
    private String name;
    private String password;
    private String flag;

    public User() {
    }
    public User(String id, String name, String password, String flag) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.flag = flag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
