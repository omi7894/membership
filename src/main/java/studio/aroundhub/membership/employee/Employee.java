package studio.aroundhub.membership.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AutoIncrement 관리
    private long id;
    private String name;
    private String branchId;
}
