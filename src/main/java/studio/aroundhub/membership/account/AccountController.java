package studio.aroundhub.membership.account;

import java.time.LocalDateTime;
import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import studio.aroundhub.membership.account.dto.AccountGetResponse;
import studio.aroundhub.membership.account.dto.DetailAccount;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AccountController {

  private final AccountService accountService;

  @GetMapping("/accounts")
  public ResponseEntity<List<AccountGetResponse>> getAccounts(@RequestParam long customerId) { // api/v1/accounts?id=00

    //return accountService.getAccounts(customerId);
    //return ResponseEntity.status(HttpStatus.OK).body(accountService.getAccounts(customerId));
    return ResponseEntity.ok(accountService.getAccounts(customerId));
  }

  @GetMapping("/account/{accountNumber}/detail")
  public ResponseEntity<DetailAccount> getAccountDetail(@RequestParam long customerId,
                                                        @PathVariable String accountNumber,
                                                        @RequestParam LocalDateTime viewYearMonth){
    //LocalDateTime viewYearMonth = LocalDateTime.now().minusDays(1);
    //TODO : customerId 검증
    return ResponseEntity.ok(accountService.getAccountDetail(accountNumber, viewYearMonth));
  }
}
