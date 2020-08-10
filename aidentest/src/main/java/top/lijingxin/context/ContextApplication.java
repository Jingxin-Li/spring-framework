package top.lijingxin.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.lijingxin.context.config.AppConfig;
import top.lijingxin.context.service.UserServer;

public class ContextApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserServer bean = context.getBean(UserServer.class);
		System.out.println(bean);
	}
}
