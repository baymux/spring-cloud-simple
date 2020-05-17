package com.bay.springcloud.service;

/**
 * @ClassName IMessageProvider
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/13 15:21
 * @Vsrsion 1.0
 **/
public interface IMessageProvider {

    /**
     * 消息发送接口
     * @return
     */
    public String send();
}
