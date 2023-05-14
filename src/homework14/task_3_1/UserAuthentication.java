package homework14.task_3_1;

import java.util.Map;

public class UserAuthentication extends AbstractAuthentication {
    @Override
    public void authenticate(Account account, Map<String, String> users, Map<String, String> admins) {
        if (account.getAccessType() == Account.AccessType.User) {
            String accountLogin = account.getLogin();
            String accountPassword = account.getPassword();

            String userPassword = users.get(accountLogin);

            if (accountPassword.equals(userPassword)) {
                System.out.println("User access provided: " + accountLogin);
            } else {
                System.out.println("Access denied: " + accountLogin);
            }
        } else if (nextAuthentication != null) {
            nextAuthentication.authenticate(account, users, admins);
        }
    }
}
