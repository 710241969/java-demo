# 普通 spring 项目

** WARNING ** : Your ApplicationContext is unlikely to start due to a @ComponentScan of the default package.

our code is in the default package, i.e. you have .java files in src/main/java with no package statement at the top. There's a warning message in the log indicating that this is likely to cause problems:

** WARNING ** : Your ApplicationContext is unlikely to start due to a @ComponentScan of the default package.
You need to move your code into a package of its own. For example, move your .java files into src/main/java/com/example and add package com.example; to the top of each file.
ApplicationContext 不能从一个组件的默认包启动
一般发出这个警告的原因是你把启动类直接放在的src目录下面
需要在src目录下面再建一个包，比如controlcenter，然后把启动类放到controlcenter下面