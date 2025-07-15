package com.tnsif.OnlineShopping.Services;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.OnlineShopping.entities.Admin;

public class AdminService {
    private List<Admin> adminList = new ArrayList<>();

    public void addAdmin(Admin admin) {
        adminList.add(admin);
    }

    public List<Admin> getAdmins() {
        return new ArrayList<>(adminList);
    }
}