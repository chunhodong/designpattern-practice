package structure_pattern.adapter.before;

import structure_pattern.adapter.after.AccountService;
import structure_pattern.adapter.after.security.UserDetails;
import structure_pattern.adapter.after.security.UserDetailsService;

/**
 * 기존의 AccountService를 관련없는 UserDetailsService타입으로 바꿔주는 클래스
 */
public class AccountUserDetailsService implements UserDetailsService {
    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService){
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
