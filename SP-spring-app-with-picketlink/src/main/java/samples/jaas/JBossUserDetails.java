package samples.jaas;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class JBossUserDetails implements UserDetails{

	private String username, passwordHash;
	private ArrayList<GrantedAuthority> dbAuths;

	public  JBossUserDetails(String username, String passwordHash, ArrayList<GrantedAuthority> dbAuths) {
		this.username = username;
		this.passwordHash = passwordHash;
		this.dbAuths = dbAuths;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return dbAuths;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return passwordHash;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
