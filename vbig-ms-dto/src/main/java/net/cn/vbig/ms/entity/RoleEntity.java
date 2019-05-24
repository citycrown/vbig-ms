/*
 * 天虹商场股份有限公司所有.
 */
package net.cn.vbig.ms.entity;

import java.io.Serializable;

/**
 * 角色表实体
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/5/24
 */
public class RoleEntity implements Serializable {

    private Long id;
    private String name;
    private String nameZh;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
}
