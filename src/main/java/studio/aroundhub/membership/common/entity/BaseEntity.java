package studio.aroundhub.membership.common.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import lombok.Getter;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class BaseEntity {

  // 자동으로 아래값들이 들어간다
  @CreatedDate
  @Column(nullable = false, updatable = false)
  private LocalDateTime createdAt;

  @LastModifiedDate
  @Column(nullable = false)
  private LocalDateTime updatedAt;
}
