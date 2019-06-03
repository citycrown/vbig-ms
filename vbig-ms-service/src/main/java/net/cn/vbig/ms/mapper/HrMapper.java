/*
 * 天虹商场股份有限公司所有.
 */
package net.cn.vbig.ms.mapper;

import net.cn.vbig.ms.service.impl.Hr;

/**
 * hr mapper
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/5/24
 */
public interface HrMapper {
    Hr loadUserByUsername(String s);
}
