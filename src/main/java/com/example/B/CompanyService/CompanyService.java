package com.example.B.CompanyService;

import com.example.B.Model.Company;
import com.example.B.Model.Orders;
import com.example.B.Repo.CompanyRepo;
import com.example.B.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {


    @Autowired
    private CompanyRepo companyRepo;

    @Autowired
    private OrderRepo orderRepo;


    //addCompany
    public Company addCompany(Company company){
        return companyRepo.save(company);
    }

    //getCompany
    public Company getCompany(String username){
        return companyRepo.findByUsername(username);
    }

    //B2B
    public Orders B2B (Orders order){
        return orderRepo.save(order);
    }


    //B2C
    public Orders B2C (Orders order){
        return orderRepo.save(order);
    }
}
