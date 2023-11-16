package studio.aroundhub.membership.account;

import studio.aroundhub.membership.account.dto.AccountDTO;

public interface AccountService {

    AccountDTO getAccount(String id, String password);
}
