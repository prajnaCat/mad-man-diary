package com.mmd.user.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * 社会化用户
 */
@Entity
@Data
@Table(name = "socialuser")
@EntityListeners(AuditingEntityListener.class)
public class Socialuser {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    /**
     * 登录插件ID
     */
    private String loginPluginId;
    /**
     * 唯一ID
     */
    private String uniqueId;
    /**
     * 用户
     */
    private Integer userId;
    /*创建日期*/
    @CreatedDate
    private Date createTime;

    /*最后修改日期*/
    @LastModifiedDate
    private Date modifyTime;
    
}
