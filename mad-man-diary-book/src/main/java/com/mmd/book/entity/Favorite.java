package com.mmd.book.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * 书籍收藏
 */
@Entity
@Data
@Table(name = "bk_favorite")
@EntityListeners(AuditingEntityListener.class)
public class Favorite {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Integer id;
    /**
     * 创建日期
     */
    protected Date createDate;
    /**
     * 最后修改日期
     */
    protected Date modifyDate;
    /**
     * 会员
     */
    protected Integer memberId;
    /**
     * 书籍
     */
    protected Integer bookId;
}
