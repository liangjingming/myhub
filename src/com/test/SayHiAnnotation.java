package com.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // ��ʾע��������ʱ��Ȼ����
@Target(ElementType.METHOD) // ��ʾע����Ա�ʹ���ڷ�����
public @interface SayHiAnnotation {
	String paramValue() default "johness";
}
