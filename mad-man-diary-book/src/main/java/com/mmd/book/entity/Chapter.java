package com.mmd.book.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;

/**
 * 章节
 * @author xch
 * @description
 * @date 2020-05-06
 */
@Entity
@Data
@Table(name = "bk_chapter")
@EntityListeners(AuditingEntityListener.class)
public class Chapter {
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
     * 所属的卷
     */
    private Integer volumeId;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 单价（单位币）
     */
    private Integer price;
    /**
     * 内容文件id
     */
    private String contentFileType;
    /**
     * 内容文件id
     */
    private String contentFileId;
    /**
     * 是否发布
     */
    private Boolean isPublication;
    /**
     * 是否置顶
     */
    private Boolean isTop;
    /**
     * 点击数
     */
    private Integer hits;
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


