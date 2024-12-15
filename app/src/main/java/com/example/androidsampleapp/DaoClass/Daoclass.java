package com.example.androidsampleapp.DaoClass;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.androidsampleapp.EntityClass.PurchaseModel;

import java.util.List;

@Dao
public interface Daoclass {

    @Insert
    void insertAllData(PurchaseModel model);

    //GET All USER
    @Query("select * from  Purchase")
    List< PurchaseModel > getAllData();

    //DELETE USER
    @Query("delete from Purchase where `id`= :id")
    void deleteData(int id);

    //Update USER DATA

    @Query("update Purchase SET customerName= :customername ,productName =:productname, quantity =:quantity, purchaseDate =:purchasedate, contactNumber =:contactnumber, outletLocation =:outletlocation where `id`= :id")
    void updateData(String customername, String productname, String quantity, String purchasedate, String contactnumber, String outletlocation , int id);


}
