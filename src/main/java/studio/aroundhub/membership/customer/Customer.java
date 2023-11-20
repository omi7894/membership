package studio.aroundhub.membership.customer;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import studio.aroundhub.membership.common.entity.BaseEntity;

@Entity
public class Customer extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrement 관리
  private long id;

  private String name;
  private String grade;
  private int age;
  private String email;
  private String organization;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
