package com.mmd.author.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
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
@Table(name = "author")
@EntityListeners(AuditingEntityListener.class)
public class Author {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    /**
     * 作者等级
     */
    private Integer authorRankId;
    /**
     * 出生日期
     */
    private Date birth;
    /**
     * E-mail
     */
    private String email;
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
     * 地址
     */
    private String address;
    /**
     * 笔名
     */
    private String penname;
    /**
     * 创建日期
     */
    @CreatedDate
    private Date createDate;
    /**
     * 最后修改日期
     */
    @LastModifiedDate
    private Date modifyDate;
}
