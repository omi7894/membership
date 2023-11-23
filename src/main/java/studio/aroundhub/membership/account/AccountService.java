package studio.aroundhub.membership.account;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import studio.aroundhub.membership.account.dto.AccountGetResponse;
import studio.aroundhub.membership.account.dto.DetailAccount;
import studio.aroundhub.membership.transaction.Transaction;
import studio.aroundhub.membership.transaction.TransactionRepository;

@Service
@RequiredArgsConstructor
public class AccountService {

  private final AccountRepository accountRepository;
  private final TransactionRepository transactionRepository;

  public List<AccountGetResponse> getAccounts(long customerId) {
    return accountRepository.findAccountByCustomerId(customerId).stream()
        .map(
            account ->
                AccountGetResponse.builder()
                    .number(account.getNumber())
                    .balance(account.getBalance())
                    .branchId(account.getBranchId())
                    .customerId(account.getCustomerId())
                    .build())
        .toList();
  }

  public DetailAccount getAccountDetail(String accountNumber, LocalDateTime viewYearMonth){
    Account account = accountRepository.findAccountByNumber(accountNumber);

    LocalDateTime startDate = viewYearMonth;
    LocalDateTime endDate = viewYearMonth.plusMonths(1).minusDays(1);
    List<Transaction> transactionList = transactionRepository.findByAccountNumberAndCreatedAtBetween(accountNumber, startDate, endDate);

    return DetailAccount.builder()
            .accountNumber(account.getNumber())
            .accountAmount(account.getBalance())
            .accountType(account.getType())
            .depositAndWithdrawalHistory(transactionList)
            .build();
  }

}
