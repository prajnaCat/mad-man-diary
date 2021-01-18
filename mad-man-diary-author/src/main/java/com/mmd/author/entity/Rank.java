package com.mmd.author.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "author_rank")
@EntityListeners(AuditingEntityListener.class)
public class Rank {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    /**
     * 等级名称
     */
    private String rankName;
    /**
     * 人气值-min
     */
    private Long minPopularity;
    /**
     * 人气值-max
     */
    private Long maxPopularity;
    /**
     * 是否默认
     */
    @Column(columnDefinition = "tinyint(1) default 1 ")
    private Integer defaultflag;
    /**
     * 是否特殊
     */
    @Column(columnDefinition = "tinyint(1) default 1 ")
    private Integer specialflag;
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
