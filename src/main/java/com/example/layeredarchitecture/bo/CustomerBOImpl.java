package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.bo.custom.CustomerBO;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO= (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public ArrayList<Customer> getAll() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();
    }

    @Override
    public boolean save(Customer dto) throws SQLException, ClassNotFoundException{
        //customer business logic example
        return customerDAO.save( new Customer(dto.getId(), dto.getName(),dto.getAddress()));

    }

    @Override
    public boolean update(Customer dto) throws SQLException, ClassNotFoundException {
        return customerDAO.update( new Customer(dto.getId(), dto.getName(),dto.getAddress()));

    }

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {
         customerDAO.exist(id);
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.exist(id);
    }

    @Override
    public String generateID() throws SQLException, ClassNotFoundException {
        return customerDAO.generateID();
    }

    @Override
    public Customer search(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.search(id);
    }


}
