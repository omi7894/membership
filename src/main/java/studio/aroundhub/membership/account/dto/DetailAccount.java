package studio.aroundhub.membership.account.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import studio.aroundhub.membership.transaction.Transaction;

import java.util.List;

@Builder
@Getter
@ToString
public class DetailAccount {
    private String accountNumber;
    private String accountType;
    private String accountName;
    private long accountAmount;
    private List<Transaction> depositAndWithdrawalHistory;

}
