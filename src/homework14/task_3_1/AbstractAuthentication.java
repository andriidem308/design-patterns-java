package homework14.task_3_1;

import java.util.Map;


public abstract class AbstractAuthentication {
    protected AbstractAuthentication nextAuthentication;

    public void setNextAuthentication(AbstractAuthentication nextAuthentication) {
        this.nextAuthentication = nextAuthentication;
    }

    public abstract void authenticate(Account account, Map<String, String> users, Map<String, String> admins);
}
