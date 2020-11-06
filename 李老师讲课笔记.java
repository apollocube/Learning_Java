20201016 java中的类和对象、继承、派生等
上课老师讲的：
Object Class    对象类是所有类的父类
equals(Object obj)

来自RUNOBB.com：
Java对象和类
    对象：是类的一个实例，有属性和行为
    类：是一个对象的模板
        类可以包含以下类型变量：
            局部变量：方法中
            成员变量：方法体外类内
            类变量：方法体外类内，声明为static
        构造方法：
            创建一个对象时候至少要调用一个构造方法
        创建对象：
            java用new关键词创建对象：
            Puppy myPuppy=new Puppy("tommy");
        访问实例变量和方法
            用"."点号来访问对象成员和方法

自己看书笔记：

20201106
1. 接口：
    实现一个界面访问多个对象函数（通用程序设计思想）
    定义方式：
    [public] interface interface_name [extends interface1_name[, interface2_name,…]] {
    // 接口体，其中可以包含定义常量和声明方法
    [public] [static] [final] type constant_name = value;    // 定义常量
    [public] [abstract] returnType method_name(parameter_list);    // 声明方法
    }
    常用接口：
    1. Comparable接口    public interface Comparable<E>
    {
    public int comparedTo(E o) {

    }
    }

    2. Cloneable接口

2. 异常对象
    1. JAVA错误
        1. 语法
            编译器
        2. 运行时错误操作
            异常处理机制
        3. 逻辑问题
            分步调试

    2. 异常处理机制
        类:
        Throwable
            Exception
                RuntimeException
                    ArithmeticException
                    NullPointerException
                    IllegalArgumentException
                    ...
            Error
        
        成员:
            +getMessage():String
            +toString():String
            +printStackTrace():void
            +getStackTrace():void

        









