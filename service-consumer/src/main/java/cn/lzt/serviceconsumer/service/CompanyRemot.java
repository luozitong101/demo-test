package cn.lzt.serviceconsumer.service;

import cn.lzt.db.entity.Company;
import cn.lzt.db.entity.Factory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author luoyong
 * @date 2018-11-25下午 11:35
 */
@FeignClient(name = "service-producer")
public interface CompanyRemot {

    @RequestMapping("/company/findall")
    public List<Company> findAll();

    @RequestMapping("/company/companyId")
    public List<Factory> findFactoryByCompanyId(@PathVariable(value = "companyId") int companyId);
}
