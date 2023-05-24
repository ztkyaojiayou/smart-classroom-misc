/**
 * smart-classroom.com Inc. Copyright (c) 2015-present All Rights Reserved.
 * generated by SaberGenerator
 */
package com.smart.classroom.misc.repository.orm.commission;

import com.smart.classroom.misc.domain.biz.commission.enums.CommissionStatus;
import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 佣金表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CommissionDO extends BaseEntityDO {

    /**
     * 名称
     */
    private String name = null;

    /**
     * 金额(单位：分)
     */
    private Long amount = null;

    /**
     * 合同id
     */
    private Long contractId = null;

    /**
     * 作者id
     */
    private Long authorId = null;

    /**
     * 收款单id
     */
    private Long receiptId = null;

    /**
     * 账期
     */
    private String paymentDays = null;

    /**
     * 状态 CREATED/RECEIVED/CANCELED/CLOSED 未收款/已收款/已取消/已关闭
     */
    private CommissionStatus status = CommissionStatus.CREATED;


}