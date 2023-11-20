package studio.aroundhub.membership.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import studio.aroundhub.membership.account.dto.AccountDTO;

@RestController
public class AccountController {

   private AccountService accountService;

   /*@Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public AccountDTO getAccount(String id, String password){

       AccountDTO accountDTO = accountService.getAccount(id, password);
       return  accountDTO;
    }*/
}
