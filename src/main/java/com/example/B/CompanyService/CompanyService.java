package com.example.B.CompanyService;

import com.example.B.Model.Company;
import com.example.B.Model.Order;
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


    //getCompany
    public Company getCompany(String username){
        return companyRepo.findByUsername(username);
    }

    //b2b
    public Order B2B (Order order){
        if (companyRepo.findByUsername(order.getFrom()) == null){
            return null;
        }
        else
        return orderRepo.save(order);
    }


    //B2C
    public Order B2C (Order order){
        return orderRepo.save(order);
    }
}
