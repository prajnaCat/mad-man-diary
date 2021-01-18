package com.mmd.user.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "member_rank")
public class MemberRank {
    /**
     * ID
     */
    private Integer id;
    /**
     * 消费金额
     */
    private BigDecimal amount;
    /**
     * 是否默认
     */
    private Boolean isDefault;
    /**
     * 是否特殊
     */
    private Boolean isSpecial;
    /**
     * 等级名称
     */
    private String name;
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
