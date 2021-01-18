package com.mmd.book.entity;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;


/**
 * 书籍标签
 */
@Entity
@Data
@Table(name = "bk_tag")
@EntityListeners(AuditingEntityListener.class)
public class Tag {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    /**
     * 标签名称
     */
    private String name;
    /**
     * 图标
     */
    private String icon;
    /**
     * 备注
     */
    private String memo;
    /**
     * 排序
     */
    private Integer sort;
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
