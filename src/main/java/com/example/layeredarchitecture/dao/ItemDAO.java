package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
     void saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException;
     boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
     void deleteItem(String code) throws SQLException, ClassNotFoundException ;
     ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;
      String generateID() throws SQLException, ClassNotFoundException ;
      boolean existItem(String code) throws SQLException, ClassNotFoundException ;
    ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;

     }
