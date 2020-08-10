package top.lijingxin.context.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import top.lijingxin.context.service.UserServer;
@Service
@Scope("singleton")
public class UserServiceImpl implements UserServer {
	public UserServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + "构造函数执行了");
	}
}
