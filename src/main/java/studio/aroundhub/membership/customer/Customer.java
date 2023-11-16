package studio.aroundhub.membership.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AutoIncrement 관리
    private long id;
    private String name;
    private String grade;
    private int age;
    private String email;
    private String organization;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
