package Action;

import com.opensymphony.xwork2.Action;

/**
 * @author chengjinging
 * @date 2020/9/21 下午10:01
 */
public class HelloAction implements Action {

    private String username;
    private String message;
    @Override
    public String execute() throws Exception {
        System.out.println("username="+username);
        message="1221212";
        if (username.equals("111")){
            return ERROR;
        }
        System.out.println("message"+message);
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
