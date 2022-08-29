package com.example.okey.service;

import com.example.okey.model.Admin;
import com.example.okey.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void registerAdmin(Admin admin){
        adminRepository.save(admin);
    }

    public Optional<Admin> getAdminByEmail(String email){
        return adminRepository.findAdminByEmail(email);
    }
}
