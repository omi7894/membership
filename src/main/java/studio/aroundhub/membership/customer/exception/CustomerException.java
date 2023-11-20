package studio.aroundhub.membership.customer.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import studio.aroundhub.membership.common.exception.BaseException;

@Getter
@RequiredArgsConstructor
public class CustomerException extends BaseException {
    private final long id;
    private final String name;

    /*
    고객 정보를 찾을 수 없습니다
    고객id : ?
    고객명 : ?
    */

}
