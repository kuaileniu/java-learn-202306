package com.ruanjian.learn.javaobject.memory;

import org.apache.lucene.util.RamUsageEstimator;
import org.openjdk.jol.info.ClassLayout;

public class Main {

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        u2.setUsername("abcde");
        System.out.println(ClassLayout.parseInstance(u1).instanceSize());
        System.out.println(ClassLayout.parseInstance(u2).instanceSize());
        System.out.println(ClassLayout.parseInstance(u2).toPrintable());
        System.out.println("使用lucene的内存工具测出的 u2 及子对象(username)占用总内存字节数为："+RamUsageEstimator.sizeOf(u2));


        String str1 = "abcde";
        System.out.println(str1+"的size："+ClassLayout.parseInstance(str1).instanceSize());
        System.out.println(str1+"的Printable："+ClassLayout.parseInstance(str1).toPrintable());
    }
}
