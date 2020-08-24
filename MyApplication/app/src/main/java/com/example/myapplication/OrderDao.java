package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface OrderDao {

    @Insert
    void insertOrder(Order order);

    @Query("SELECT * FROM orders WHERE orderStatus='Pending'")
    List<Product> findProduct(String name);

}
