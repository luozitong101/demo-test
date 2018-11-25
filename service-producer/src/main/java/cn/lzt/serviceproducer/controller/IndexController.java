package cn.lzt.serviceproducer.controller;

import cn.lzt.db.entity.Company;
import cn.lzt.db.entity.Factory;
import cn.lzt.serviceproducer.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author luoyong
 * @date 2018-11-25下午 10:41
 */
@RestController
public class IndexController {


    @Autowired
    CompanyService service;

    @RequestMapping("/company/findall")
    public List<Company> findAll(){

        return service.findAll();
    }

    @RequestMapping("/company/{companyId}")
    public List<Factory> findFactoryById(@PathVariable int companyId){

        return service.findFactoryByCompanyId(companyId);
    }

}
