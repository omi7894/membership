package studio.aroundhub.membership.account;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Account {

    @Id
    private String number;
    private String type;
    private long balance; //BigDecimal
    private String password;
    private int branchId;
    private int customerId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
