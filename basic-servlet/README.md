# 本 module 的作用
尝试 Servlet 的简单使用

# 操作步骤
下列步骤中, `1` 要最先完成, `2` `3` `4` `5` 之间没有顺序的要求
1. 在本 module 的顶层目录执行 `mvn jetty:run` 命令, 启动项目
2. 项目启动后向 `http://localhost:8080/basic-servlet/basic` 发送 http 请求
3. 项目启动后向 `http://localhost:8080/basic-servlet/stackTrace` 发送 http 请求
4. 项目启动后向 `http://localhost:8080/basic-servlet/simpleHttp` 发送 http 请求
5. 项目启动后向 `http://localhost:8080/basic-servlet/initParam` 发送 http 请求

# 解释
在 [src/main/webapp/WEB-INF/web.xml](src/main/webapp/WEB-INF/web.xml) 中配置了几个 servlet, 具体如下

| servlet 名称  | 作用 | url |
------------- | ------------- | --- |
| basicServlet | 展示一个简单的页面 | /basic |
| stackTraceServlet | 展示函数调用栈 | /stackTrace |
| simpleHttp | 展示一个简单的页面(Get 请求和 Post 请求对应的页面内容不同) | /simpleHttp |
| initParamServlet | 展示 `web.xml` 文件中配置的 `init-param` 标签的相关信息 | /initParam |

## basicServlet
`basicServlet` 这个 servlet 对应的 class 为 `com.study.servlet.BasicServlet` (它实现了 `Servlet` 接口),
`basicServlet` 可以生成一个简单的 html 文件作为响应.

按照 [web.xml](src/main/webapp/WEB-INF/web.xml) 中的配置, 对 [http://localhost:8080/basic-servlet/basic](http://localhost:8080/basic-servlet/basic) 这个 url 的请求会由 `basicServlet` 来处理.

可以通过以下几种方式向这个 url 发送 http 请求
1. 在浏览器地址栏输入 `http://localhost:8080/basic-servlet/basic` 或直接点击 [http://localhost:8080/basic-servlet/basic](http://localhost:8080/basic-servlet/basic)
2. 运行 `Python3` 程序: [scripts/python3/basic.py](scripts/python3/basic.py) 
3. 运行 `shell` 程序: [scripts/sh/basic.sh](scripts/sh/basic.sh)
 

## stackTraceServlet
`stackTraceServlet` 这个 servlet 对应的 class 为 `com.study.servlet.StackTraceServlet` (它是 `GenericServlet` 的子类)
`GenericServlet` 是一个抽象类, `extends` 这个抽象类比 `implements` `Servlet` 接口要容易(因为 `implements` `Servlet` 接口时需要实现其中的每一个方法, 而 `GenericServlet` 抽象类中已经实现了一些)
`stackTraceServlet` 可以生成一个简单的 html 文件作为响应. 这个 html 文件中有一个 `table` 标签, 其中展示了程序执行期间的函数调用栈.

按照 [web.xml](src/main/webapp/WEB-INF/web.xml) 中的配置, 对 [http://localhost:8080/basic-servlet/stackTrace](http://localhost:8080/basic-servlet/stackTrace) 这个 url 的请求会由 `stackTraceServlet` 来处理.

可以通过以下几种方式向这个 url 发送 http 请求
1. 在浏览器地址栏输入 `http://localhost:8080/basic-servlet/stackTrace` 或直接点击 [http://localhost:8080/basic-servlet/stackTrace](http://localhost:8080/basic-servlet/stackTrace)
2. 运行 `Python3` 程序: [scripts/python3/stackTrace.py](scripts/python3/stackTrace.py) 
3. 运行 `shell` 程序: [scripts/sh/stackTrace.sh](scripts/sh/stackTrace.sh)

## simpleHttpServlet
`simpleHttpServlet` 这个 servlet 对应的 class 为 `com.study.servlet.SimpleHttpServlet` (它是 `HttpServlet` 的子类)
`simpleHttpServlet` 可以生成一个简单的 html 文件作为响应.
`HttpServlet` 是 `GenericServlet` 的抽象子类. 
`HttpServlet` 中采用了 `Template Method` 这个设计模式.

按照 [web.xml](src/main/webapp/WEB-INF/web.xml) 中的配置, 对 [http://localhost:8080/basic-servlet/simpleHttp](http://localhost:8080/basic-servlet/simpleHttp) 这个 url 的请求会由 `simpleHttpServlet` 来处理.

可以通过以下几种方式向这个 url 发送 http 请求
1. 在浏览器地址栏输入 `http://localhost:8080/basic-servlet/simpleHttp` 或直接点击 [http://localhost:8080/basic-servlet/simpleHttp](http://localhost:8080/basic-servlet/simpleHttp) 来发送 `GET` 请求
2. 通过运行 `Python3` 程序发送 `GET` 请求: [scripts/python3/sendGet.py](scripts/python3/sendGet.py) 
3. 通过运行 `Python3` 程序发送 `POST` 请求: [scripts/python3/sendPost.py](scripts/python3/sendPost.py) 
4. 通过运行 `shell` 程序发送 `GET` 请求: [scripts/sh/sendGet.sh](scripts/sh/sendGet.sh)
5. 通过运行 `shell` 程序发送 `POST` 请求: [scripts/sh/sendPost.sh](scripts/sh/sendPost.sh)

## initParamServlet
`initParamServlet` 这个 servlet 对应的 class 为 `com.study.servlet.InitParamServlet` (它是 `HttpServlet` 的子类)
`initParamServlet` 可以生成一个简单的 html 文件作为响应. 这个 html 文件中有一个 `table` 标签, 其中展示了 `web.xml` 中为 `initParamServlet` 配置的 `param-name` 和 `param-value`.

按照 [web.xml](src/main/webapp/WEB-INF/web.xml) 中的配置, 对 [http://localhost:8080/basic-servlet/initParam](http://localhost:8080/basic-servlet/initParam) 这个 url 的请求会由 `initParamServlet` 来处理.

可以通过以下几种方式向这个 url 发送 http 请求
1. 在浏览器地址栏输入 `http://localhost:8080/basic-servlet/initParam` 或直接点击 [http://localhost:8080/basic-servlet/initParam](http://localhost:8080/basic-servlet/initParam)
2. 运行 `Python3` 程序: [scripts/python3/initParam.py](scripts/python3/initParam.py) 
3. 运行 `shell` 程序: [scripts/sh/initParam.sh](scripts/sh/initParam.sh)


# 部分参考文章和书籍:
1. [Template Method 模式](https://openhome.cc/Gossip/DesignPattern/TemplateMethod.htm)
2. [語言技術：Servlet/JSP Gossip](https://openhome.cc/Gossip/ServletJSP/)
3. [template-method(from github)](https://github.com/iluwatar/java-design-patterns/tree/master/template-method)
4. [Servlet JSP和Spring MVC初学指南(是一个豆瓣链接)](https://book.douban.com/subject/26956492/)
