package studio.aroundhub.membership.branch;

import studio.aroundhub.membership.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AutoIncrement 관리
    private long id;
    private String name;
    private String address;
}
