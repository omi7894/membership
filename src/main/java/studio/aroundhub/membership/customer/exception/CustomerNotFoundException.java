package studio.aroundhub.membership.customer.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import studio.aroundhub.membership.common.exception.BaseException;

public class CustomerNotFoundException extends CustomerException {
    public CustomerNotFoundException(long id, String name) {
        super(id, name);
    }
}

