package com.qdtx.test;

/**
 * Created by yn on 2018-10-23
 */

class Member{}
public class TestClassLoaderDemo {
    public static void main(String[] args) {
        String str = "";
        System.out.println(str.getClass());
        System.out.println(str.getClass().getClassLoader());    // Bootstrap加载器

        Member member=new Member();
        System.out.println(member.getClass());// Bootstrap加载器
        System.out.println(member.getClass().getClassLoader());
        System.out.println(member.getClass().getClassLoader().getParent());    // Bootstrap加载器
        System.out.println(member.getClass().getClassLoader().getParent().getParent());    // Bootstrap加载器
    }
}
