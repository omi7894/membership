package studio.aroundhub.membership.account;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import studio.aroundhub.membership.account.dto.AccountGetResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AccountController {

  private final AccountService accountService;

  @GetMapping("/accounts")
  public List<AccountGetResponse> getAccounts(@RequestParam long id) { // api/v1/accounts?id=00

    return accountService.getAccounts(id);
  }
}
