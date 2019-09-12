package com.diyiliu.jwt.respository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description: SysUserJpa
 * Author: DIYILIU
 * Update: 2019-09-12 09:16
 */
public interface SysUserJpa extends JpaRepository<SysUser, Long> {

    SysUser findByUsername(String name);
}
