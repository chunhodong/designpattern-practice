package structure_pattern.adapter.before;

import structure_pattern.adapter.after.Account;
import structure_pattern.adapter.after.security.UserDetails;

/**
 * 기존의 Account클래스를 관련없는 UserDetails타입으로 바꿔주는 클래스
 * 어댑터
 */
public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account){
        this.account = account;
    }
    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
