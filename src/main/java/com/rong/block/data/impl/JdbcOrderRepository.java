//package com.rong.block.data.impl;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.rong.block.data.OrderRepository;
//import com.rong.block.pojo.Order;
//import com.rong.block.pojo.Taco;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
//import org.springframework.stereotype.Repository;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Repository
//public class JdbcOrderRepository implements OrderRepository {
//
//    private SimpleJdbcInsert orderInserter;
//    private SimpleJdbcInsert orderTacoInserter;
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    public JdbcOrderRepository(JdbcTemplate jdbcTemplate) {
//        this.orderInserter = new SimpleJdbcInsert(jdbcTemplate)
//                .withTableName("TACO_ORDER")
//                .usingGeneratedKeyColumns("id");
//        this.orderTacoInserter = new SimpleJdbcInsert(jdbcTemplate)
//                .withTableName("TACO_ORDER_TACOS");
//        this.objectMapper = new ObjectMapper();
//    }
//
//    @Override
//    public Order save(Order order) {
//        order.setPlacedAt(new Date());
//        long orderId = saveOrderDetails(order);
//        order.setId(orderId);
//        List<Taco> tacos = order.getTacos();
//        for (Taco taco : tacos) {
//            saveTacoToOrder(taco, orderId);
//        }
//        return order;
//    }
//    private long saveOrderDetails(Order order) {
//        @SuppressWarnings("unchecked")
//        Map<String, Object> values =
//                objectMapper.convertValue(order, Map.class);
//        values.put("placedAt", order.getPlacedAt());
//        return orderInserter
//                .executeAndReturnKey(values)
//                .longValue();
//    }
//
//    private void saveTacoToOrder(Taco taco, long orderId) {
//        Map<String, Object> values = new HashMap<>();
//        values.put("tacoOrder", orderId);
//        values.put("taco", taco.getId());
//        orderTacoInserter.execute(values);
//    }
//
//}
