/**
 * smart-classroom.com Inc. Copyright (c) 2015-present All Rights Reserved.
 * generated by SaberGenerator
 */
package com.smart.classroom.misc.repository.orm.reader;

import com.smart.classroom.misc.repository.orm.base.BaseEntityDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 读者表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ReaderDO extends BaseEntityDO {

    /**
     * 用户名
     */
    private String username = null;

    /**
     * 密码
     */
    private String password = null;


}