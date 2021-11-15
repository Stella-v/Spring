1、注解使用步骤
    （1）添加xml文件，配置注解扫描的范围：<context:component-scan base-package="com.spring.ioc"></context:component-scan>
    （2）在类上添加注解：@Service:服务类 @Controller:控制器类 @Repository:数据持久化类 @Component:组件类
    （3）加载xml文件
