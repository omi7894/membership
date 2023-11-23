package studio.aroundhub.membership.account.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Id;

@Builder
@Getter
@ToString
public class AccountGetResponse {
    @Id private String number;
    private String type;
    private boolean isFirst;
    private long balance; // BigDecimal
    private String password;
    private int employeeId;
    private int branchId;
    private long customerId;
}
