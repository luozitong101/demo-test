package cn.lzt.serviceproducer.service;


import cn.lzt.db.InitData;
import cn.lzt.db.entity.Company;
import cn.lzt.db.entity.Factory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luoyong
 * @date 2018-11-25下午 11:17
 */
@Service
public class CompanyService {

    static {
        try {
            Thread.currentThread().getContextClassLoader().loadClass("cn.lzt.db.InitData");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public List<Company> findAll(){

        return InitData.getCompanies();
    }

    public List<Factory> findFactoryByCompanyId(int companyId){
        List<Company> companies = InitData.getCompanies();
        for (Company company : companies){
            if (company.getId() == companyId){
                return company.getFactories();
            }
        }
        return null;
    }



}
