package studio.aroundhub.membership.account;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import studio.aroundhub.membership.common.entity.BaseEntity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account extends BaseEntity { // JPAAuditing

  @Id private String number;
  private String type;
  private long balance; // BigDecimal
  private String password;
  private int branchId;
  private int customerId;
}
