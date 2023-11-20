package studio.aroundhub.membership.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    void test(){
        Account account = Account.builder()
                .number("111-1111-11111")
                .balance(100000)
                .build();
    }
}
