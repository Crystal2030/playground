# 本 module 的作用
尝试 JSP 的简单使用, 包括
1. 通过 JSP 展示一个简单的页面
2. 通过 JSP 展示请求中的 header 信息
3. 通过 JSP 展示函数调用栈
4. 通过 JSP 展示一个 MySQL 表中的数据
5. 通过 JSP 展示 Cookie 信息
6. Filter 与 Listener 的使用入门


| JSP 名称  | 作用 | url |
------------- | ------------- | --- |
| index.jsp  | 展示一个简单的页面 | /index |
| showHeader.jsp  | 展示请求中的 header 信息 | /showHeader |
| showStackTrace.jsp | 展示函数调用栈 | /showStackTrace |
| showPopulation.jsp | 展示一个 MySQL 表中的数据 | /showPopulation |
| addCookie.jsp | 添加一个 Cookie | /addCookie |
| showCookie.jsp | 展示 Cookie | /showCookie |

# 通过 JSP 展示一个简单的页面
## 操作步骤
1. 在本 module 的顶层目录执行 `mvn jetty:run` 命令, 启动项目
2. 项目启动后向 http://localhost:8080/basic-jsp/index 发送 http 请求

## 如何发送 http 请求
可以采取以下方式向 http://localhost:8080/basic-jsp/index 发送 http 请求
1. 在浏览器地址栏输入 `http://localhost:8080/basic-jsp/index` 或直接点击 [http://localhost:8080/basic-jsp/index](http://localhost:8080/basic-jsp/index)
2. 运行 Python3 程序: [scripts/python3/run/index.py](scripts/python3/run/index.py)
3. 运行 shell 程序: [scripts/sh/index.sh](scripts/sh/index.sh)


# 通过 JSP 展示请求中的 header 信息
## 操作步骤
1. 在本 module 的顶层目录执行 `mvn jetty:run` 命令, 启动项目
2. 项目启动后向 http://localhost:8080/basic-jsp/showHeader 发送 http 请求

## 如何发送 http 请求
可以采取以下方式向 http://localhost:8080/basic-jsp/showHeader 发送 http 请求
1. 在浏览器地址栏输入 `http://localhost:8080/basic-jsp/showHeader` 或直接点击 [http://localhost:8080/basic-jsp/showHeader](http://localhost:8080/basic-jsp/showHeader)
2. 运行 Python3 程序: [scripts/python3/run/showHeader.py](scripts/python3/run/showHeader.py)
3. 运行 shell 程序: [scripts/sh/showHeader.sh](scripts/sh/showHeader.sh)


# 通过 JSP 展示函数函数调用栈
## 操作步骤
1. 在本 module 的顶层目录执行 `mvn jetty:run` 命令, 启动项目
2. 项目启动后向 http://localhost:8080/basic-jsp/showStackTrace 发送 http 请求

## 如何发送 http 请求
可以采取以下方式向 http://localhost:8080/basic-jsp/showStackTrace 发送 http 请求
1. 在浏览器地址栏输入 `http://localhost:8080/basic-jsp/showStackTrace` 或直接点击 [http://localhost:8080/basic-jsp/showStackTrace](http://localhost:8080/basic-jsp/showStackTrace)
2. 运行 Python3 程序: [scripts/python3/run/showStackTrace.py](scripts/python3/run/showStackTrace.py)
3. 运行 shell 程序: [scripts/sh/showStackTrace.sh](scripts/sh/showStackTrace.sh)


# 展示一个 MySQL 表中的数据
## 操作步骤
1. 在 [scripts/python3/sql/data.txt](scripts/python3/sql/data.txt) 文件中已经准备好了一些数据
2. 运行 [scripts/python3/sql/fill.py](scripts/python3/sql/fill.py) 就会产生一个 insert 语句, 这个语句会被保存在 [scripts/python3/sql/insert.sql](scripts/python3/sql/insert.sql) 中
3. 在本地创建一个名为 `study` 的 MySQL 数据库, 在 `study` 这个数据库中创建一个名为 `Population` 的表(建表语句在 [scripts/python3/sql/create.sql](scripts/python3/sql/create.sql) 中)
4. 创建一个名为 `naive` 的用户, 并授权它可以操作 `study.Population` 这张表(具体的语句在 [scripts/python3/sql/grant.sql](scripts/python3/sql/grant.sql) 中)
5. 执行 [scripts/python3/sql/insert.sql](scripts/python3/sql/insert.sql) 中的 SQL 语句
6. 在本 module 的顶层目录执行 `mvn jetty:run` 命令, 启动项目
7. 项目启动后向 http://localhost:8080/basic-jsp/showPopulation 发送 http 请求

## 如何发送 http 请求
可以采取以下方式向 http://localhost:8080/basic-jsp/showPopulation 发送 http 请求
1. 在浏览器地址栏输入 `http://localhost:8080/basic-jsp/showPopulation` 或直接点击 [http://localhost:8080/basic-jsp/showPopulation](http://localhost:8080/basic-jsp/showPopulation)
2. 运行 Python3 程序: [scripts/python3/showPopulation.py](scripts/python3/showPopulation.py)
3. 运行 shell 程序: [scripts/sh/showPopulation.sh](scripts/sh/showPopulation.sh)

# 添加 Cookie 与展示 Cookie
1. 在本 module 的顶层目录执行 `mvn jetty:run` 命令, 启动项目
2. 项目启动后访问 [http://localhost:8080/basic-jsp/addCookie](http://localhost:8080/basic-jsp/addCookie), 将响应里的 html 页面称为 R1
3. 点击 R1 中的链接, 将本次响应的 html 页面称为 R2. R2 中可以看到相关的 Cookie 信息

# 后面的部分有待补充

# 一些参考资料
1. [web.xml from google doc](https://cloud.google.com/appengine/docs/standard/java/config/webxml)
2. [jsp in tutorialspoint](https://www.tutorialspoint.com/jsp/)
3. [mybatis 入门](http://www.mybatis.org/mybatis-3/zh/getting-started.html)