package studio.aroundhub.membership.transaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AutoIncrement 관리
    private long id;
    private long balance;
    private String type;
    private long balanceAfterTransaction;
    private String accountNumber;
}
