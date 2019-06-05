# Spring 最简单核心功能的 demo

要学习 spring boot ，首先要学习 spring mvc ，知道 spring mvc 的演进过程
学习 spring mvc ，首先又要学习 spring
那么就通过这个简单例子来搞一搞

spring 其实核心思想就是 IOC/DI


特别注意
spring-test + junit5 的单元测试不用 @RunWith(value = SpringJUnit4ClassRunner.class) 这是以前的
现在用
@ExtendWith(value = {SpringExtension.class})