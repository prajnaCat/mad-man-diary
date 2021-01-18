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
public class AdminRole {
    /**
     * 管理员
     */
    private Integer adminsId;
    /**
     * 角色
     */
    private Integer rolesId;
}
