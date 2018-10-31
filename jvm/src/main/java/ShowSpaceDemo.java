package com.qdtx.test;

import sun.security.jca.GetInstance;

/**
 * Created by yn on 2018-10-23
 */
public class ShowSpaceDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime(); // 获取Runtime实例化对象
        System.out.println("MAX_MEMBER：" + runtime.maxMemory());    // 最大可用内存
        System.out.println("TOTAL_MEMBER：" + runtime.totalMemory());    // 默认的可用内存

       new testSingle().GetInstance();
    }
}

class testSingle {
    public static testSingle testSingle = new testSingle();

    static {
        System.out.println(testSingle.getClass());
    }

    public static testSingle GetInstance(){
        return  testSingle;
    }
}
