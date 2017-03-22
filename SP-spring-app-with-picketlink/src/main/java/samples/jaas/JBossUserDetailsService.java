package samples.jaas;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class JBossUserDetailsService implements UserDetailsService {


	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


		ArrayList<GrantedAuthority> dbAuths = new ArrayList<GrantedAuthority>();


		dbAuths.add(new SimpleGrantedAuthority("myrole1"));
		dbAuths.add(new SimpleGrantedAuthority("myrole2"));
		dbAuths.add(new SimpleGrantedAuthority("myrole3"));
		dbAuths.add(new SimpleGrantedAuthority("king"));
		




		return new JBossUserDetails(username, null, dbAuths);


		//	    Admin admin = this.findAdminByUsername(username);
		//	       ArrayList<GrantedAuthority> dbAuths = new ArrayList<GrantedAuthority>();
		//
		//	       for (RolePermission role : admin.getRole().getRolePermissions()) {
		//	           dbAuths.add(new SimpleGrantedAuthority(role.getPermission().getPermission()));
		//	       }
		//
		//	       return createUserDetails(username, admin.getPasswordHash(), dbAuths);

	}



	//	@Override
	//	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
	//		
	//		LOGGER.error(arg0);
	//		LOGGER.error("In JBossUserDetailsService");
	//		
	//		// TODO Auto-generated method stub
	//		return new UserDetails() {
	//			
	//			@Override
	//			public boolean isEnabled() {
	//				// TODO Auto-generated method stub
	//				return true;
	//			}
	//			
	//			@Override
	//			public boolean isCredentialsNonExpired() {
	//				// TODO Auto-generated method stub
	//				return true;
	//			}
	//			
	//			@Override
	//			public boolean isAccountNonLocked() {
	//				// TODO Auto-generated method stub
	//				return true;
	//			}
	//			
	//			@Override
	//			public boolean isAccountNonExpired() {
	//				// TODO Auto-generated method stub
	//				return true;
	//			}
	//			
	//			@Override
	//			public String getUsername() {
	//				// TODO Auto-generated method stub
	//				return "MyLogin";
	//			}
	//			
	//			@Override
	//			public String getPassword() {
	//				// TODO Auto-generated method stub
	//				return null;
	//			}
	//			
	//			@Override
	//			public Collection<? extends GrantedAuthority> getAuthorities() {
	//				// TODO Auto-generated method stub
	//				return null;
	//			}
	//		};
	//	}




}
