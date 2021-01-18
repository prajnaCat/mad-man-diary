package com.mmd.user.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "socialuser")
@EntityListeners(AuditingEntityListener.class)
public class Memberattribute {
    /**
     * ID
     */
    private Integer id;
    /**
     * 排序
     */
    private Integer orders;
    /**
     * 是否启用
     */
    private Boolean isEnabled;
    /**
     * 是否必填
     */
    private Boolean isRequired;
    /**
     * 名称
     */
    private String name;
    /**
     * 可选项
     */
    private String options;
    /**
     * 配比
     */
    private String pattern;
    /**
     * 属性序号
     */
    private Integer propertyIndex;
    /**
     * 类型
     */
    private Integer type;
    /*创建日期*/
    @CreatedDate
    private Date createTime;

    /*最后修改日期*/
    @LastModifiedDate
    private Date modifyTime;
}
