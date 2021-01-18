package com.mmd.book.entity;

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
@Table(name = "book")
@EntityListeners(AuditingEntityListener.class)
public class Book {
    /**ID*/
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    /**
     * 书籍名称
     */
    private String bookname;
    /**
     * 作者笔名
     */
    private String penname;
    /**
     * 作者id
     */
    private Integer authorId;
    /**
     * 小说简介
     */
    private String introduction;
    /**
     * 小说分类
     */
    private Integer bookCategoryId;
    /**
     * 小说类型
     */
    private Integer bookType;
    /**
     * 封面图片
     */
    private String image;
    /**
     * 是否有效
     */
    private Integer isActive;
    /**
     * 是否列出
     */
    private Integer isList;
    /**
     * 是否上架
     */
    private Integer isMarketable;
    /**
     * 是否置顶
     */
    private Integer isTop;

    /*创建日期*/
    @CreatedDate
    private Date createTime;

    /*最后修改日期*/
    @LastModifiedDate
    private Date modifyTime;

}
