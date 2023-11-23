package studio.aroundhub.membership.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, String> {

    List<Account> findAccountByCustomerId(long customerId);
}
