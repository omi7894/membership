package studio.aroundhub.membership.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import studio.aroundhub.membership.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account extends BaseEntity { //JPAAuditing

    @Id
    private String number;
    private String type;
    private long balance; //BigDecimal
    private String password;
    private int branchId;
    private int customerId;

}
