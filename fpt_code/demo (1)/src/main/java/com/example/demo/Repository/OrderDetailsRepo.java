package com.example.demo.Repository;

import com.example.demo.Entity.OrderDetail;
import lombok.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDetailsRepo extends JpaRepository<OrderDetail, Integer> {

    @Query(value = " select id,order_id,product_id,price,quantity from Order_Details \n" +
            " where order_id =?", nativeQuery = true)
    List<OrderDetail> getAllOrderDetailById(Integer id);

    @Query(value = "SELECT * FROM order_details od WHERE order_id = ? and product_id = ? ", nativeQuery = true)
    OrderDetail getByOrderIdAndProductId(Integer orderId, Integer producId);
}
