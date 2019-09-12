package com.diyiliu.jwt.security;

import com.diyiliu.jwt.respository.SysUser;
import com.diyiliu.jwt.respository.SysUserJpa;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * Description: JwtUserDetailsService
 * Author: DIYILIU
 * Update: 2019-09-11 16:17
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Resource
    private SysUserJpa sysUserJpa;

    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = sysUserJpa.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList());
    }

    public SysUser save(SysUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return sysUserJpa.save(user);
    }
}
