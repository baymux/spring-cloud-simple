package com.bay.springcloudalibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName Order
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/16 22:43
 * @Vsrsion 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    /**
     * 订单状态,0 创建中,1 已完结
     */
    private Integer status;
}
