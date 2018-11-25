# 单例模式

**定义**

​	确保一个类只有一个实例，并提供全局访问点。

# 要点

1. 单例模式确保一个程序中一个类最多只有一个实例
2. 单例模式也提供访问这个实例的全局点
3. 在Java中实现单例模式需要私有的构造器，一个静态方法和一个静态变量
4. 确定在性能和资源上的限制，然后小心的选择适当的方案来实现单例，以解决多线程的问题 

# 笔记

lazy是最基础的单例模式，但是在多线程情况下并不能保证只有一个对象。

多线程下保证只有一个对象的方式
1. 懒汉模式的getInstance加上同步。(性能最差，对性能没有考虑时使用)
2. 饿汉模式(对于加载和创建时间影响不大或者不考虑时使用)
3. 双重检查加锁