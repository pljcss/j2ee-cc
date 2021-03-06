package com.iocdemo.xml.lifecycle;

/**
 * @Author: cs
 * @Date: 2021/1/27 10:03 下午
 * @Desc:
 */
public class Orders {
    private String product;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
        System.out.println("第二步 调用set方法设置属性值");
    }

    public Orders() {
        System.out.println("第一步 调用无参构造器 ...");
    }

    /**
     * 创建执行初始化的方法
     */
    public void initMethod() {
        System.out.println("第三步 执行初始化方法");
    }

    /**
     * 创建执行销毁的方法
     */
    public void destroyMethod() {
        System.out.println("第五 步 执行销毁方法");
    }
}
