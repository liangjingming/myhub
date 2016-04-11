package com.test;

public class SayHiEmlement {

	// ��ͨ�ķ���
    public void SayHiDefault(String name){
        System.out.println("Hi, " + name);
    }
    
    // ʹ��ע�Ⲣ��������ķ���
    @SayHiAnnotation(paramValue="Jack")
    public void SayHiAnnotation(String name){
        System.out.println("Hi, " + name);
    }
    
    // ʹ��ע�Ⲣʹ��Ĭ�ϲ����ķ���
    @SayHiAnnotation
    public void SayHiAnnotationDefault(String name){
        System.out.println("Hi, " + name);
    }
}
