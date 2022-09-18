package structure_pattern.adapter.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
