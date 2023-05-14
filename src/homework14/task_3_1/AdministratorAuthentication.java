package homework14.task_3_1;

import java.util.Map;


public class AdministratorAuthentication extends AbstractAuthentication {
    @Override
    public void authenticate(Account account, Map<String, String> users, Map<String, String> admins) {
        if (account.getAccessType() == Account.AccessType.Administrator) {
            String accountLogin = account.getLogin();
            String accountPassword = account.getPassword();

            String adminPassword = admins.get(accountLogin);

            if (accountPassword.equals(adminPassword)) {
                System.out.println("Admin access provided: " + accountLogin);
            } else {
                System.out.println("Access denied: " + accountLogin);
            }
        } else if (nextAuthentication != null) {
            nextAuthentication.authenticate(account, users, admins);
        }
    }
}
