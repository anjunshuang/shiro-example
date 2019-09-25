package com.github.zhangkaitao.shiro.chapter10.web.listener;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-8
 * <p>Version: 1.0
 */
public class MySessionListener1 implements SessionListener {

    @Override
    public void onStart(Session session) {//会话创建时触发
        System.out.println("会话创建：MySessionListener1 create = " + session.getId());
    }
    @Override
    public void onExpiration(Session session) {//会话过期时触发
        System.out.println("会话过期：MySessionListener1 expiration = " + session.getId());
    }
    @Override
    public void onStop(Session session) {//退出/会话停止时触发
        System.out.println("会话停止：MySessionListener1 stop = " + session.getId());
    }

}
