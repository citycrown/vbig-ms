/*
 * 天虹商场股份有限公司所有.
 */
package net.cn.vbig.ms.mapper;

import org.apache.ibatis.annotations.Param;

import javax.management.relation.Role;
import java.util.List;

/**
 * 功能说明
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/5/24
 */
public interface RoleMapper {
    List<Role> roles();

    int addNewRole(@Param("role") String role, @Param("roleZh") String roleZh);

    int deleteRoleById(Long rid);
}
