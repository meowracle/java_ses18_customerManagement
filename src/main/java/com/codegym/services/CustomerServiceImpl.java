package com.codegym.services;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {

        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Tung", "aprilerd34@gmail.com", "Thainguyen"));
        customers.put(2, new Customer(2, "Tung", "tungdaudat@gmail.com", "Hanoi"));
        customers.put(3, new Customer(3, "Du", "dusida@gmail.com", "Bacninh"));
        customers.put(4, new Customer(4, "Quy", "quyquyenluc@gmail.com", "Thainguyen"));
        customers.put(5, new Customer(5, "Hoang", "hoanghuhong@gmail.com", "Hungyen"));
        customers.put(6, new Customer(6, "Duc", "duckhonghienloi@gmail.com", "Hanoi"));
        customers.put(7, new Customer(7, "Cau Vang", "cauvangvuive@gmail.com", "Hanoi"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
