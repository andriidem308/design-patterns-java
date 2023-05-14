package homework14.task_3_1;

import java.util.Map;

public class GuestAuthentication extends AbstractAuthentication {
    @Override
    public void authenticate(Account account, Map<String, String> users, Map<String, String> admins) {
        if (account.getAccessType() == Account.AccessType.Guest) {
            System.out.println("Guest access provided!");
        } else if (nextAuthentication != null) {
            nextAuthentication.authenticate(account, users, admins);
        }
    }
}
