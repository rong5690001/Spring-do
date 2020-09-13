package com.rong.block.data;

import com.rong.block.pojo.Order;

public interface OrderRepository {
    
    Order save(Order order);
    
}
