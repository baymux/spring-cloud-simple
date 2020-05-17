package com.bay.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName LoadBalancer
 * @Description TODO 手写负载
 * @Author baymux
 * @Date 2020/5/10 15:58
 * @Vsrsion 1.0
 **/
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
