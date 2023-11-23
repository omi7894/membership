package studio.aroundhub.membership.account;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

import studio.aroundhub.membership.common.entity.BaseEntity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
public class Account extends BaseEntity { // JPAAuditing

  @Id private String number;
  private String type;
  private boolean isFirst;
  private long balance; // BigDecimal
  private String password;
  private int employeeId;
  private int branchId;
  private long customerId;
}
