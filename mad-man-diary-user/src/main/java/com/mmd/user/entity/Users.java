package com.mmd.user.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @author xch
 * @description
 * @date 2020-05-06
 */
@Entity
@Data
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class Users {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Integer id;
    /**
     * 是否启用
     */
    protected Integer isEnabled;
    /**
     * 最后登录日期
     */
    protected Date lastLoginDate;
    /**
     * 最后登录IP
     */
    protected String lastLoginIp;
    /**
     * 是否锁定
     */
    protected Integer isLocked;
    /**
     * 锁定日期
     */
    protected Date lockDate;

}
