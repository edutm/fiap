package br.com.fiap.quaisquerocio.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class JwtUser implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	public JwtUser(Integer id, String username, String password,
			Collection<? extends GrantedAuthority> authorities) {
			this.id = id;
			this.username = username;
			this.password = password;
			this.authorities = authorities;
	}
	
	private Integer id;
	private String username;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;


	public Integer getId() {
		return id;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
