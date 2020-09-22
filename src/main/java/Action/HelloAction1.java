package Action;

import com.opensymphony.xwork2.Action;
import pojo.User;

/**
 * @author chengjinging
 * @date 2020/9/21 下午10:01
 */
public class HelloAction1 implements Action {
    private User user;

    @Override
    public String execute() throws Exception {
        if(user != null){
            System.out.println("user.getId()="+user.getId());
            System.out.println("user.getUname()"+user.getUname());
            System.out.println(user.toString());
        }

        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
