package com.mmd.user.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "socialuser")
@EntityListeners(AuditingEntityListener.class)
public class Admin {
    /**
     * ID
     */
    private Integer id;
    /**
     * 部门
     */
    private String department;
    /**
     * E-mail
     */
    private String email;
    /**
     * 加密密码
     */
    private String encodedPassword;
    /**
     * 姓名
     */
    private String name;
    /**
     * 用户名
     */
    private String username;

}
