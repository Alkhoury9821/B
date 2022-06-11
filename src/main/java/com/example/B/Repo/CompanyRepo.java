package com.example.B.Repo;

import com.example.B.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Integer> {
        Company findByUsername(String username);
}
