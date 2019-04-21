####使用Mycat+springBoot完成分库分表。
`sql目录`:存放的是建表语句
`config`:存放的是scheme.xml、server.xml和rule.xml配置文件

测试:
在地址栏输入:
http://localhost:8080/user/save?id=1&name=tom
http://localhost:8080/user/save?id=2&name=jack
查看数据库发现：
id为1的数据插入到数据库db02中的user表。
id为2的数据插入到数据库db01中的user表。
在地址栏输入:
http://localhost:8080/user/list
是可以看到刚刚插入的两条记录