package com.example.B.Controller;

import com.example.B.CompanyService.CompanyService;
import com.example.B.Model.Company;
import com.example.B.Model.Consumer;
import com.example.B.Model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Company")
public class CompanyController {


    @Autowired
    private CompanyService companyService;


    @Autowired
    private RestTemplate restTemplate ;


    @PostMapping("/save")
    public ResponseEntity<Company> addCompany(@RequestBody Company company){
        return ResponseEntity.ok().body(companyService.addCompany(company));
    }

    @GetMapping("/getCompany/{username}")
    public ResponseEntity<Company> getCompany(@PathVariable String username){
        return ResponseEntity.ok().body(companyService.getCompany(username));
    }


    @PostMapping("/orderFromCompany")
    public ResponseEntity<Orders> B2B (@RequestBody Orders order){
        Company company = companyService.getCompany(order.getOrderFrom());
        if(company != null) {
            return ResponseEntity.ok().body(companyService.B2B(order));
        } else return null;
    }


    @PostMapping("/orderFromConsumer/")
    public ResponseEntity<Orders> B2C ( @RequestBody Orders order){
        Consumer consumer = restTemplate.getForObject("http://localhost:8081/Consumer/getConsumer/" + order.getOrderFrom() ,Consumer.class);
        if (consumer != null ){
            return ResponseEntity.ok().body(companyService.B2C(order));
        }
        else return  null;
    }

}
