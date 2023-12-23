package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.SuperBO;
import com.example.layeredarchitecture.entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SuperBO {
     ArrayList<Customer> getAll() throws SQLException, ClassNotFoundException;
    boolean save(Customer dto) throws SQLException, ClassNotFoundException;
    boolean update(Customer dto) throws SQLException, ClassNotFoundException;
    void delete(String id) throws SQLException, ClassNotFoundException;

    boolean exist(String id) throws SQLException, ClassNotFoundException;
    String generateID() throws SQLException, ClassNotFoundException;
    Customer search(String id) throws SQLException, ClassNotFoundException;
}
