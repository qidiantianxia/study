# study
# JavaLearning
技术学习与分享

# 系统安装

VMWare

Linux系统安装（VMware 14+ CentOS 7，2018年最新）

https://blog.csdn.net/qq_39750782/article/details/79828213

https://my.vmware.com/cn/web/vmware/downloads

VMware提示此主机支持Intel VT-x,但Intel VT-x处于禁用状态怎么解决

http://www.xitongcheng.com/jiaocheng/xtazjc_article_38955.html

CentOS

https://www.centos.org/download/

如何重装系统，没有光驱的，要装win7的？

https://www.zhihu.com/question/23042197

怎样解决装系统选中的磁盘采用的是GPT分区形式

https://jingyan.baidu.com/article/7c6fb42862d63a80642c90b8.html

Linux 教程

http://www.runoob.com/linux/linux-tutorial.html

# 安装Git

https://blog.csdn.net/sishen47k/article/details/80211002

Git可视化教程——Git Gui的使用

https://blog.csdn.net/qq_34842671/article/details/70916587

git 本地分支与远程分支关联的一种方法

https://www.cnblogs.com/a-flydog/p/5520999.html

study

http://www.cnblogs.com/cposture/category/642672.html


# Java安装包

百度网盘 链接: https://pan.baidu.com/s/19f1jPgknTO4pDBmqrzd8rQ 提取码: r231

github怎样在一个仓库中创建多个项目

JDK

java环境变量的配置步骤及其作用详细解读

https://jingyan.baidu.com/article/4ae03de320d99f3eff9e6bfd.html

eclipse

手把手教你在Eclipse上创建一个Maven+Spring MVC的HelloWord项目

https://blog.csdn.net/u012660464/article/details/53199439

eclipse插件 properties Editor离线安装

https://blog.csdn.net/diyu122222/article/details/78082691


IDE

https://www.w3cschool.cn/intellij_idea_doc/intellij_idea_doc-34852d55.html

适合初学者的IDEA使用教程

https://www.jianshu.com/p/0f6a513e20c8

IntelliJ IDEA使用教程（很全）

https://www.cnblogs.com/yjd_hycf_space/p/7483921.html

IDEA的安装

https://blog.csdn.net/newabcc/article/details/80601933

IntelliJ IDEA如何将普通java项目变为web项目

https://jingyan.baidu.com/article/08b6a591681e5414a8092212.html

IntelliJ Idea 常用快捷键列表

https://www.cnblogs.com/zhangpengshou/p/5366413.html

idea设置jsp文件模板的方法

https://blog.csdn.net/gnail_oug/article/details/79667746

IDEA 2018.2提示不区分大小写设置

https://blog.csdn.net/sinat_34405629/article/details/81913230

intellij idea如何修改主题样式、字体

https://jingyan.baidu.com/article/915fc41488f2a051384b206c.html

IDEA创建Maven工程多模块继承和聚合创建(详解)

https://jingyan.baidu.com/article/48b37f8dc9c54c1a64648820.html

intellij IDEA 如何设置默认的maven配置？

https://www.oschina.net/question/948439_243781


# 网络协议

几种常用的网络协议
https://www.cnblogs.com/liyanbin/p/5951869.html

iptables详解

http://blog.chinaunix.net/uid-26495963-id-3279216.html


# SQL

SQL第一范式 第二范式 第三范式 BC范式

https://blog.csdn.net/douunderstand/article/details/70159540

MySQL explain执行计划和索引

https://blog.csdn.net/wuseyukui/article/details/71512793

7款经典的MySQL客户端软件

https://blog.csdn.net/lidujun1028/article/details/54616000

SQL错误用法

https://mp.weixin.qq.com/s?__biz=MzAxNjM2MTk0Ng==&mid=2247485509&idx=1&sn=9d27c86645878904e93bd159128ee520&chksm=9bf4b8f0ac8331e67620911f7648d1729adfb58733752a09104b6918579c10c5801269f2a982&mpshare=1&scene=24&srcid=1031hH1xhwLhNFsDmD20yc1m#rd

mysql水平拆分和垂直拆分

MySQL主从复制与读写分离

https://www.cnblogs.com/luckcs/articles/2543607.html

sql语句

instr()函数达到模糊查询 like查询相同的结果，效率高，如果过滤的条件有索引， like查询时，以'%'开头，列所加的索引是不起作用的，like查询时，以'%'开头，列所加的索引是不起作用的。

mysql使用instr达到in(字符串)的效果：instr(concat(',','3,4,5,12',','),concat(',',id,','))

CREATE TABLE grade AS SELECT * FROM class

ip用int类型存储

https://blog.csdn.net/liwenbin_940818/article/details/71101962

MySql优化方法

https://www.2cto.com/database/201710/694244.html

优化原理

https://www.cnblogs.com/liujiacai/p/7605612.html

性能优化

https://www.cnblogs.com/claireyuancy/p/7258314.html

mysql数据库的DDL,DML, DCL, TCL

https://www.cnblogs.com/wxishang/p/3443967.html

存储过程，触发器之类的能避就全避免了吧，维护不方便，人员变动时，很多时候就忘了，时间一长全是定时炸弹

update时，where语句尽量要走索引，不然会全表扫描，一般情况下，1G的数据至少10S（想想这可是update啊，锁住10S意味着啥）

or尽量不用，改为in(),当然in的范围太多也不行，尽量别超100

or如果：select a from A where b=1 or c=1这种where里面不同字段进行or，这种尽量改为union。

分页时：Select a from A limit 10000,10; 这种大偏移量下效率非常低。可以考虑如下几个方案：

select a from A WHERE id>=xxxx limit 11;(将上一页的最大值通过where id> 进行预处理，然后分页)


# 数据结构与算法

十大经典排序算法（动图演示）

http://www.cnblogs.com/onepixel/articles/7674659.html

可视化算法

https://www.cs.usfca.edu/~galles/visualization/StackArray.html

Java集合类: Set、List、Map、Queue使用场景梳理

https://www.cnblogs.com/LittleHann/p/3690187.html

算法与设计思维(对于未知变量：时间复杂度O(n)和空间复杂度)

1.n是否为2的整数幂

while(true){n%2==0?N/2}

n 2进制 n-1|
2 10  01  1|
4 100 001 3|
8 1000  0111  7|

n&(n-1)

2.二分查找（有序序列）



3.HashMap

数据结构:数组+链表+红黑树（平衡二叉树）

HashMap源码分析与实现

https://blog.csdn.net/sdksdk0/article/details/79299286


4.B-树（索引算法）

https://blog.csdn.net/guoziqing506/article/details/64122287

MySQL和B树的那些事

https://www.cnblogs.com/xiaoxi/p/6868087.html

实现：索引InnoDB和MyISAM的数据结构

# 源码分析

深入理解Java中的String

https://www.cnblogs.com/xiaoxi/p/6036701.html#undefined

浅谈Java中的对象和引用

http://www.cnblogs.com/dolphin0520/p/3592498.html

字符、字节的概念及其区别

http://blog.sina.com.cn/s/blog_6ede15b10100nrxp.html

sendRedirect和forward方法的区别

https://www.cnblogs.com/mzzy/p/4724428.html

java中的静态变量、静态方法与静态代码块详解与初始化顺序

https://www.cnblogs.com/lubocsu/p/5099558.html

# JVM

Java程序编译和运行的过程Blog

https://www.cnblogs.com/qiumingcheng/p/5398610.html

常见面试题

https://www.cnblogs.com/yhason/archive/2012/05/08/2489932.html

深入理解Java反射

https://www.cnblogs.com/luoxn28/p/5686794.html

几张图轻松理解String.intern()

https://blog.csdn.net/soonfly/article/details/70147205

内存溢出(Memory Overflow)和内存泄露(Memory Leak)的区别

http://www.cnblogs.com/fryy/archive/2013/11/27/3445281.html

常见的内存泄漏原因及解决方法

https://www.jianshu.com/p/90caf813682d


# 并发

并发要考虑多线程同步的问题

如何扩展和优化线程池？

https://mp.weixin.qq.com/s?__biz=MzAxNjM2MTk0Ng==&mid=2247485466&idx=1&sn=a25ff6166ee36a611e08bb209eeb5edf&chksm=9bf4b8afac8331b948d08df3aaaba0ee4566fe155b3368b76734fe01bbaf05a67be57728943d&mpshare=1&scene=24&srcid=1031THjiorNHYhENAVBPj1CK#rd

Java高并发，如何解决，什么方式解决

https://www.cnblogs.com/lr393993507/p/5909804.html

如何解决多线程并发访问一个资源的安全性问题？

https://blog.csdn.net/dreamzuora/article/details/79527064

Java线程(八)：锁对象Lock-同步问题更完美的处理方式

https://blog.csdn.net/ghsau/article/details/7461369

Java并发编程：volatile关键字解析

https://www.cnblogs.com/dolphin0520/p/3920373.html

进程切换小结

https://blog.csdn.net/u013456079/article/details/52584224

进程切换分析篇

https://blog.csdn.net/xiaohuima_dong/article/details/44804393

Quartz

https://blog.csdn.net/w405722907/article/details/72458059


# 前端

vue

Windows怎么下载vue.js

https://jingyan.baidu.com/article/91f5db1b7172421c7e05e360.html

vue教程

https://cn.vuejs.org/v2/guide/

vue快速入门

http://www.cnblogs.com/keepfool/p/5619070.html

# MVC

Servlet

struts1

struts2

SpringMVC

SpringMVC工作原理

https://www.cnblogs.com/xiaoxi/p/6164383.html


# Spring

Spring 框架简介

https://www.ibm.com/developerworks/cn/java/wa-spring1/

Spring AOP的实现原理

http://www.importnew.com/24305.html

Spring IOC和AOP 原理彻底搞懂

https://blog.csdn.net/luoshenfu001/article/details/5816408


# ORM

hibernate

MyBatis

懒加载

https://www.cnblogs.com/ysocean/p/7336945.html?utm_source=debugrun&utm_medium=referral

一级缓存、二级缓存

https://www.cnblogs.com/ysocean/p/7342498.html


# SpringBoot

springboot之启动原理解析

https://www.cnblogs.com/shamo89/p/8184960.html

构建微服务：Spring boot

https://www.cnblogs.com/ityouknow/p/5662753.html

理解RESTful架构

https://blog.csdn.net/mywcyfl/article/details/46609633

使用SpringBoot编写Restful风格接口

https://blog.csdn.net/forMelo/article/details/79016952

fastdfs等中间件（图片等文件存储）


# SpringCloud

分布式开发五大神兽

https://www.cnblogs.com/ilinuxer/p/6580998.html

史上最简单的 SpringCloud 教程 | 终章

https://blog.csdn.net/forezp/article/details/70148833/

Spring Cloud 系列文章

http://www.ityouknow.com/spring-cloud

Dubbo和Spring Cloud微服务架构对比

https://blog.csdn.net/zhangweiwei2020/article/details/78646252

# redis

redis的五大数据类型实现原理

https://www.cnblogs.com/ysocean/p/9102811.html

Redis 总结Blog

https://blog.csdn.net/hjm4702192/article/details/80518856

Spring基于注解整合Redis项目

https://github.com/qidiantianxia/redisdemo.git

Redis和RedisClient 官网下载方式

http://blog.51cto.com/zhuws/2299945

# mongodb

MongoDB 教程

https://docs.mongodb.com/manual/introduction/

http://www.runoob.com/mongodb/mongodb-tutorial.html




# 权限管理

shiro

http://shiro.apache.org/

https://www.cnblogs.com/zhouguanglin/archive/2018/02/27/8477807.html

http://jinnianshilongnian.iteye.com/blog/2018936

示例

https://github.com/zhangkaitao/shiro-example


超市管理系统

https://github.com/qidiantianxia/adminweb.git

# 优化与调试

chrome浏览器自带的开发者工具查看http头

https://segmentfault.com/a/1190000013924583

https://blog.csdn.net/wangshuai6707/article/details/51350558

Throwable、Error、Exception、RuntimeException 区别 联系

https://www.cnblogs.com/zhihaowu/p/8877225.html

用java语言写如何写一个7进制数字转化成10进制

https://zhidao.baidu.com/question/211061176.html

# Java

一位资深程序员大牛给予Java初学者的学习路线建议

https://www.cnblogs.com/java1024/p/9018528.html

https://www.liaoxuefeng.com/

100+经典Java面试题及答案解析

https://www.cnblogs.com/pureEve/p/6546280.html

https://www.zhihu.com/question/60949531

https://blog.csdn.net/hope900/article/details/78647466

https://www.cnblogs.com/java1024/p/7685400.html

# 架构师

架构师之路总结

https://baijiahao.baidu.com/s?id=1590207120160725337&wfr=spider&for=pc

年薪40万的架构师之路，你不得不了解的技术栈

https://baijiahao.baidu.com/s?id=1590207120160725337&wfr=spider&for=pc

# 产品经理

产品经理小技术（三）：二维码这把利刃，产品应该用到极致

https://www.jianshu.com/p/60f33497c8c7
