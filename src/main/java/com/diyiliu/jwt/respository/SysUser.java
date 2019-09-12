package com.diyiliu.jwt.respository;

import lombok.Data;

import javax.persistence.*;

/**
 * Description: SysUser
 * Author: DIYILIU
 * Update: 2019-09-12 09:14
 */

@Data
@Entity
@Table(name = "t_user")
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;
}
