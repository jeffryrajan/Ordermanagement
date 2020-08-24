package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
@Entity(tableName = "orders")
public class Order {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "orderId")
    private int id;
    @ColumnInfo(name = "customerName")
    private String name;
    @ColumnInfo(name = "productName")
    private String product;
    @ColumnInfo(name = "deliveryAddress")
    private String delivery_address;
    @ColumnInfo(name = "dateOfOrder")
    private Date date_of_order;
    @ColumnInfo(name = "expectedDispatch")
    private Date expected_dispatch;
    @ColumnInfo(name = "notes")
    private String notes;
    @ColumnInfo(name = "orderStatus")
    private String order_status;
    @ColumnInfo(name = "amountPaid")
    private int amount_paid;

    public Order(int id,
                 String name,
                 String product,
                 String delivery_address,
                 Date date_of_order,
                 Date expected_dispatch,
                 String notes,
                 String order_status,
                 int amount_paid){
        this.id =id;
        this.name=name;
        this.product=product;
        this.delivery_address= delivery_address;
        this.date_of_order=date_of_order;
        this.expected_dispatch=expected_dispatch;
        this.notes=notes;
        this.order_status=order_status;
        this.amount_paid=amount_paid;
    }

    public  int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getProduct(){
        return this.product;
    }
    public String getDelivery_address(){
        return this.delivery_address;
    }
    public Date getDate_of_order(){
        return this.date_of_order;
    }
    public Date getExpected_dispatch(){
        return this.expected_dispatch;
    }
    public String getNotes(){
        return this.notes;
    }
    public String getOrder_status(){
        return this.order_status;
    }
    public int getAmount_paid(){
        return this.amount_paid;
    }
}
