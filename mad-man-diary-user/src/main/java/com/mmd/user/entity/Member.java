package com.mmd.user.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "socialuser")
@EntityListeners(AuditingEntityListener.class)
public class Member {
    /**
     * ID
     */
    private Integer id;
    /**
     * 昵称
     */
    private String username;
    /**
     * 会员等级
     */
    private Integer memberRankId;
    /**
     * 地址
     */
    private String address;
    /**
     * 消费金额
     */
    private BigDecimal amount;
    /**
     * 余额
     */
    private BigDecimal balance;
    /**
     * 出生日期
     */
    private Date birth;
    /**
     * E-mail
     */
    private String email;
    /**
     * 加密密码
     */
    private String encodedPassword;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 姓名
     */
    private String name;
    /**
     * 积分
     */
    private Integer point;
    /**
     * 安全密匙
     */
    private Date safeKeyExpire;
    /**
     * 安全密匙
     */
    private String safeKeyValue;

    /*创建日期*/
    @CreatedDate
    private Date createTime;

    /*最后修改日期*/
    @LastModifiedDate
    private Date modifyTime;

}
