package com.rong.block.data;

import com.rong.block.pojo.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {


    /**
     * 获取投递到指定邮编（Zip）的订单
     *
     * @param deliveryZip
     * @return
     */
//    List<Order> findByDeliveryZip(String deliveryZip);

//    @Query("Order o where o.deliveryCity='Seattle'")
//    List<Order> readOrdersDeliveredInSeattle();
}
