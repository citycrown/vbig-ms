/*
 * 天虹商场股份有限公司所有.
 */
package net.cn.vbig.ms.service.impl;

import net.cn.vbig.ms.mapper.HrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * HrService 用来执行登陆操作
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/5/24
 */
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(s);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不对");
        }
        return null;
    }
}
