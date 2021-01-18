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
@Table(name = "bk_volume")
@EntityListeners(AuditingEntityListener.class)
public class Volume {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    /**
     * 书籍id
     */
    private Integer bookId;
    /**
     * 卷名称
     */
    private String name;
    /**
     * 描述注释
     */
    private String memo;
    /**
     * 排序
     */
    private Integer sort;
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
