# study
# JavaLearning
技术学习与分享


Java安装包

百度网盘 链接: https://pan.baidu.com/s/19f1jPgknTO4pDBmqrzd8rQ 提取码: r231

github怎样在一个仓库中创建多个项目


IDE

IntelliJ IDEA如何将普通java项目变为web项目

https://jingyan.baidu.com/article/08b6a591681e5414a8092212.html

idea设置jsp文件模板的方法

https://blog.csdn.net/gnail_oug/article/details/79667746

IDEA 2018.2提示不区分大小写设置

https://blog.csdn.net/sinat_34405629/article/details/81913230

intellij idea如何修改主题样式、字体

https://jingyan.baidu.com/article/915fc41488f2a051384b206c.html



vue

Windows怎么下载vue.js

https://jingyan.baidu.com/article/91f5db1b7172421c7e05e360.html

vue教程

https://cn.vuejs.org/v2/guide/

vue快速入门

http://www.cnblogs.com/keepfool/p/5619070.html


几种常用的网络协议
https://www.cnblogs.com/liyanbin/p/5951869.html



SQL第一范式 第二范式 第三范式 BC范式

https://blog.csdn.net/douunderstand/article/details/70159540

MySQL explain执行计划和索引

https://blog.csdn.net/wuseyukui/article/details/71512793

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

存储过程，触发器之类的能避就全避免了吧，维护不方便，人员变动时，很多时候就忘了，时间一长全是定时炸弹

update时，where语句尽量要走索引，不然会全表扫描，一般情况下，1G的数据至少10S（想想这可是update啊，锁住10S意味着啥）

or尽量不用，改为in(),当然in的范围太多也不行，尽量别超100

or如果：select a from A where b=1 or c=1这种where里面不同字段进行or，这种尽量改为union。

分页时：Select a from A limit 10000,10; 这种大偏移量下效率非常低。可以考虑如下几个方案：

select a from A WHERE id>=xxxx limit 11;(将上一页的最大值通过where id> 进行预处理，然后分页)


数据结构与算法

可视化算法

https://www.cs.usfca.edu/~galles/visualization/StackArray.html

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



JVM

Java程序编译和运行的过程Blog

https://www.cnblogs.com/qiumingcheng/p/5398610.html

常见面试题

https://www.cnblogs.com/yhason/archive/2012/05/08/2489932.html

深入理解Java反射

https://www.cnblogs.com/luoxn28/p/5686794.html

几张图轻松理解String.intern()

https://blog.csdn.net/soonfly/article/details/70147205

并发

如何扩展和优化线程池？

https://mp.weixin.qq.com/s?__biz=MzAxNjM2MTk0Ng==&mid=2247485466&idx=1&sn=a25ff6166ee36a611e08bb209eeb5edf&chksm=9bf4b8afac8331b948d08df3aaaba0ee4566fe155b3368b76734fe01bbaf05a67be57728943d&mpshare=1&scene=24&srcid=1031THjiorNHYhENAVBPj1CK#rd


MVC

Servlet

struts1

struts2

SpringMVC


Spring

Spring 框架简介

https://www.ibm.com/developerworks/cn/java/wa-spring1/

Spring AOP的实现原理

http://www.importnew.com/24305.html


ORM

hibernate

MyBatis



SpringBoot

springboot之启动原理解析

https://www.cnblogs.com/shamo89/p/8184960.html

构建微服务：Spring boot

https://www.cnblogs.com/ityouknow/p/5662753.html

理解RESTful架构

https://blog.csdn.net/mywcyfl/article/details/46609633

使用SpringBoot编写Restful风格接口

https://blog.csdn.net/forMelo/article/details/79016952

fastdfs等中间件（图片等文件存储）


redis

Redis 总结Blog

https://blog.csdn.net/hjm4702192/article/details/80518856

Spring基于注解整合Redis项目

https://github.com/qidiantianxia/redisdemo.git



权限管理

shiro

http://shiro.apache.org/

https://www.cnblogs.com/zhouguanglin/archive/2018/02/27/8477807.html


超市管理系统

https://github.com/qidiantianxia/adminweb.git
