package cn.lzt.serviceconsumer.controller;

import cn.lzt.db.entity.Company;
import cn.lzt.db.entity.Factory;
import cn.lzt.serviceconsumer.service.CompanyRemot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author luoyong
 * @date 2018-11-25下午 11:34
 */

@RestController
public class IndexController {

    @Autowired
    CompanyRemot companyRemot;

    @RequestMapping("/company/findall")
    public List<Company> findAll(){

        return companyRemot.findAll();
    }

    @RequestMapping("/company/{companyId}")
    public List<Factory> findFactoryByCompanyId(@PathVariable int companyId){
        return companyRemot.findFactoryByCompanyId(companyId);
    }

}
