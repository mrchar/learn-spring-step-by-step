# 手把手带你学会 Spring

很多同学想学 Spring，但一看到复杂的模块和配置就头疼。网上教程又零散，学完还是不知道怎么用，这都是学习 Spring 时常遇到的问题。

这本教程就是来帮你解决这些困扰的。我们会带着你开发一个校务管理系统，从项目搭建到功能实现，把 Spring 的核心知识点都融入到实际开发里。每一步都有详细操作和代码，还会讲清楚背后的原理。跟着教程学完，你既能掌握 Spring 技术，也能学会用它开发实用的项目，真正做到学以致用。

## 目录

1. [前言](./preface.md)
2. [绪论](./introduction.md)
3. [词汇表](./glossary.md)
4. [扩展内容](./explanations.md)
5. [校长说](./chapter0/index.md)
6. [万事开头难](./chapter1/index.md)
7. [开发接口](./chapter2/index.md)
8. 单元测试
   - Spring Boot Test
   - 编写 Controller 层测试（MockMvc）
9. 使用数据库
   - 配置 H2 内存数据库
   - 使用 Spring Data JPA 实现 CRUD
   - 自定义 Repository 查询方法
10. 日志管理
11. 构建项目
    - 理解 Maven 依赖管理
    - 项目打包与部署
12. 创建安全的软件
    - 集成 Spring Security
    - 实现用户认证（表单登录 / JWT）
    - 基于角色的权限控制（RBAC）
    - 单元测试
13. 外部化配置
    - @ConfigurationProperties 绑定配置
    - Spring Profile
14. 数据库事务
    - 声明式事务（@Transactional）
    - 事务传播行为与隔离级别
15. 数据库迁移工具（Flyway/Liquibase）
    - Flyway/Liquibase 版本控制
    - 生产环境数据库更新策略
16. 异步程序
    - @Async 注解与线程池配置
    - 异步响应
17. 面向切面编程
    - 日志记录与性能监控
    - 自定义注解实现业务增强
18. 使用缓存
    - 集成 Redis 缓存
    - 使用 @Cacheable 注解优化性能
19. 事件驱动
    - SpringEventPublisher
    - EventListener
20. 可观测性与工具
    - 使用 Actuator 监控应用指标
    - 集成 ELK 日志系统
