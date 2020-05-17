package com.bay.springcloudalibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName StorageDao
 * @Description TODO
 * @Author baymux
 * @Date 2020/5/17 0:15
 * @Vsrsion 1.0
 **/
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId,
                  @Param("count") Integer count);
}
