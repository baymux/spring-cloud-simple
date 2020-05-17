# spring-cloud-simple

## 完整的spring cloud所有组件实现项目

**[来源于B站尚硅谷springcloud课程](https://www.bilibili.com/video/BV18E411x7eT)**, 已全部全部实现，可以直接在项目中直接使用

- 服务注册中心：Eureka，zookeeper，consul，**nacos(spring cloud alibaba)**
- 服务调用：ribbon，open feign
- 服务降级：hystrix，**sentinel(spring cloud alibaba)**
- 服务网关：zuul，gatewa
- 服务配置：config，**nacos(spring cloud alibaba)**
- 服务总线：bus，**nacos(spring cloud alibaba)**

### 部分软件下载地址
- [nacos](https://github.com/alibaba/nacos/releases)
- [sentinel-dashboard](https://github.com/alibaba/Sentinel/releases)
- [seata](https://github.com/seata/seata/releases)
- [zipkin](https://search.maven.org/remote_content?g=io.zipkin&a=zipkin-server&v=LATEST&c=exec)
### 项目module说明

**Spring Cloud**

[cloud-api-commons](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-api-commons): 自定义的api工具包，可以包含springcloud项目各组件中使用到的公共的API

[cloud-eureka-server-7001](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-eureka-server-7001)：eureka服务，服务注册与发现组件

[cloud-eureka-server-7002](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-eureka-server-7002)：eureka服务，服务注册与发现组件

[cloud-consumer-order-80](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-consumer-order-80)：服务消费者，调用支付服务，注册到eureka，**ribbon+RestTemplate** 做服务调用，整合sleuth+zipkin 链路跟踪

[cloud-consumer-zk-order-81](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-consumer-zk-order-81)：服务消费者，调用支付服务，注册到zookeeper

[cloud-consumer-consul-order-82](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-consumer-consul-order-82)：服务消费者，调用支付服务，注册到consul

[cloud-consumer-feign-order-80](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-consumer-feign-order-80)：服务消费者，调用支付服务，注册到eureka，**open feign**做服务调用

[cloud-provider-payment-8001](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-provider-payment-8001)：支付服务提供者，注册到eureka，整合sleuth+zipkin 链路跟踪

[cloud-provider-payment-8002](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-provider-payment-8002)：支付服务提供者，注册到eureka，整合sleuth+zipkin 链路跟踪

[cloud-provider-payment-8004](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-provider-payment-8004)：支付服务提供者，注册到**zookeeper**

[cloud-provider-payment-8006](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-provider-payment-8006)：支付服务提供者，注册到**consul**

[cloud-consumer-feign-hystrix-order-80](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-consumer-feign-hystrix-order-80)：服务消费者，调用支付服务，**opne feign**做服务调用，**hystrix**作服务降级熔断

[cloud-provider-hystrix-payment-8001](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-provider-hystrix-payment-8001)：支付服务提供者，**hystrix**作服务降级熔断

[cloud-consumer-hystrix-dashboard-9001](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-consumer-hystrix-dashboard-9001)：**hystrix-dashborad**，服务调用监控可视化

[cloud-gateway-gateway-9527](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-gateway-gateway-9527)：服务网关，路由规则

[cloud-config-center-3344](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-config-client-3344)：服务配置中心，github，整合bus消息总线，支持rabbitmq

[cloud-config-client-3355](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-config-client-3355)：服务配置客户端，github，整合bus消息总线，支持rabbitmq

[cloud-config-client-3366](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-config-client-3366)：服务配置客户端，github，整合bus消息总线，支持rabbitmq

[cloud-stream-rabbitmq-provider-8801](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-stream-rabbitmq-provider-8801)：服务消息驱动，服务提供者，整合rabbirmq

[cloud-stream-rabbitmq-consumer-8802](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-stream-rabbitmq-consumer-8802)：服务消息驱动，服务消费者，整合rabbirmq

[cloud-stream-rabbitmq-consumer-8803](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-stream-rabbitmq-consumer-8803)：服务消息驱动，服务消费者，整合rabbirmq



**Spring Cloud Alibaba**

[cloud-alibaba-provider-payment-9001](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-provider-payment-9001): 服务提供者，注册到nacos

[cloud-alibaba-provider-payment-9002](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-provider-payment-9002): 服务提供者，注册到nacos

[cloud-alibaba-consumer-nacos-order-83](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-consumer-nacos-order-83): 服务消费者，注册到nacos，**ribbon+RestTemplate** 做服务调用

[cloud-alibaba-config-nacos-client-3377](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-config-nacos-client-3377)：服务配置中心，nacos

[cloud-alibaba-sentinel-service-8401](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-sentinel-service-8401)：Alibaba sentinel 服务，功能说明

[cloud-alibaba-provider-payment-9003](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-provider-payment-9003): 服务提供者，注册到nacos

[cloud-alibaba-provider-payment-9004](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-provider-payment-9004): 服务提供者，注册到nacos

[cloud-alibaba-consumer-nacos-order-84](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-consumer-nacos-order-84)：服务消费者，整合sentinel做降级，使用open feign做服务调用

[cloud-alibaba-seata-order-service-2001](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-seata-order-service-2001)：**Alibaba 分布式事务组件 seata**, 订单服务

[cloud-alibaba-seata-storage-service-2002](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-seata-storage-service-2002)：**Alibaba 分布式事务组件 seata**，库存服务

[cloud-alibaba-seata-account-service-2003](https://github.com/baymux/spring-cloud-simple/tree/master/cloud-alibaba-seata-account-service-2003)：**Alibaba 分布式事务组件 seata**，账户服务
