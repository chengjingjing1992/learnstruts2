package pojo;

/**
 * @author chengjinging
 * @date 2020/9/21 下午11:23
 */
public class User {
    private String id;
    private String uname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}
