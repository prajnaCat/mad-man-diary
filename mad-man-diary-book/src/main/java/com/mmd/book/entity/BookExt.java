package com.mmd.book.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "bk_ext")
@EntityListeners(AuditingEntityListener.class)
public class BookExt {
    /**ID*/
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    /**
     * 书籍id
     */
    private Integer bookId;
    /**
     * 搜索关键词
     */
    private String keyword;
    /**
     * 周点击数
     */
    private String weekHits;
    /**
     * 周点击数更新日期
     */
    private Date weekHitsDate;
    /**
     * 月点击数
     */
    private Integer monthHits;
    /**
     * 月点击数更新日期
     */
    private Date monthHitsDate;
    /**
     * 总点击数
     */
    private Integer hits;
    /**
     * 章节订阅价(分)
     */
    private Integer price;
    /**
     * 周订阅
     */
    private Integer weekSales;
    /**
     * 周订阅更新日期
     */
    private Date weekSalesDate;
    /**
     * 月订阅
     */
    private Integer monthSales;
    /**
     * 月订阅更新日期
     */
    private Date monthSalesDate;
    /**
     * 总订阅
     */
    private Integer sales;
    /**
     * 评分
     */
    private Float score;
    /**
     * 评分数
     */
    private Integer scoreCount;
    /**
     * 总评分
     */
    private Integer totalScore;
    /**
     * 属性值0
     */
    private String attribute0;
    /**
     * 属性值1
     */
    private String attribute1;
    /**
     * 属性值2
     */
    private String attribute2;
    /**
     * 属性值3
     */
    private String attribute3;
    /**
     * 属性值4
     */
    private String attribute4;
    /**
     * 属性值5
     */
    private String attribute5;
    /**
     * 属性值6
     */
    private String attribute6;
    /**
     * 属性值7
     */
    private String attribute7;
    /**
     * 属性值8
     */
    private String attribute8;
    /**
     * 属性值9
     */
    private String attribute9;

    /*创建日期*/
    @CreatedDate
    private Date createTime;

    /*最后修改日期*/
    @LastModifiedDate
    private Date modifyTime;
}
