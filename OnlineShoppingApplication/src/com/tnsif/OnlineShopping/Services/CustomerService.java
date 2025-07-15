package com.tnsif.OnlineShopping.Services;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.OnlineShopping.entities.Customer;

public class CustomerService {
    private List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public Customer getCustomer(int userId) {
        return customerList.stream()
                           .filter(c -> c.getUserId() == userId)
                           .findFirst()
                           .orElse(null);
    }

    public List<Customer> getCustomers() {
        return new ArrayList<>(customerList);
    }
}

