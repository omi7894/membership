package studio.aroundhub.membership.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, String> {

    //조회
    List<Account> findByAccountId(String id);
}
