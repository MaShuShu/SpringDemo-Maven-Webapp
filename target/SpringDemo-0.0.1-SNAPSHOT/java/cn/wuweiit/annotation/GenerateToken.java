package cn.wuweiit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;




/**
 * 生成重复表单验证Token注解
 * 
 * @author marker
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)//运行时注解
@Target({ElementType.METHOD})// 方法注解
public @interface GenerateToken {
	
}
