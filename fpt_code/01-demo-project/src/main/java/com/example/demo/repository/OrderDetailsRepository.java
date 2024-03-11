package com.example.demo.repository;

import com.example.demo.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
    @Query(value = "select id, order_id,product_id,price,quantily from order_details\n" +
            "where order_id=?", nativeQuery = true)
    List<OrderDetails> getByOrderId(Integer orderId);

    @Query(value = "select * from order_details od where order_id=? and product_id=?", nativeQuery = true)
    OrderDetails getByOrderIdAndProductId(Integer orderId, Integer productId);

    @Query(value = "SELECT SUM(price * quantily) as total_amount " +
            "FROM order_details " +
            "WHERE order_id = ?1 " +
            "GROUP BY order_id", nativeQuery = true)
    Double getTotalAmount(Integer orderId);

    @Transactional
    @Modifying
    @Query(value = "delete from order_details\n" +
            "where order_id=?", nativeQuery = true)
    void deleteOrderDetailsByIdOrder(Integer orderId);

    @Query(value = "select quantily from order_details \n" +
            "where id=?", nativeQuery = true)
    Integer getOrderDetailsById(Integer id);


    @Transactional
    @Modifying
    @Query(value = "DELETE FROM order_details\n" +
            "WHERE product_id IN (SELECT id FROM products WHERE category =?)", nativeQuery = true)
    void deleteOrderDetailsByProductId(Integer id);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM order_details\n" +
            "WHERE order_id IN (SELECT id FROM orders WHERE username = ?)", nativeQuery = true)
    void deleteOrderDetailByIdOrder(String id);
}
