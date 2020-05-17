package com.bay.springcloudalibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.bay.springcloud.entities.CommonResult;

/**
 * @ClassName CustomerBlockHandler
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/15 23:35
 * @Vsrsion 1.0
 **/
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "按客户自定义, global handlerException");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "按客户自定义2, global handlerException");
    }
}
