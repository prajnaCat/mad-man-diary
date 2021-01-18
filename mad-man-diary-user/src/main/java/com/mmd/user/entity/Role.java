package com.mmd.user.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "socialuser")
@EntityListeners(AuditingEntityListener.class)
public class Role {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Integer id;
    /**
     * 描述
     */
    protected String description;
    /**
     * 是否内置
     */
    protected Boolean isSystem;
    /**
     * 名称
     */
    protected String name;
    /**
     * 权限
     */
    protected String permissions;
    /**
     * 创建日期 默认为当前时间
     */
    @CreatedDate
    private Date createDate;
    /**
     * 修改日期 默认为当前时间
     */
    @LastModifiedDate
    private Date modifyDate;
}
