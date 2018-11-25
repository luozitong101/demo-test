package cn.lzt.db.entity;

import java.util.List;

/**
 * @author luoyong
 * @date 2018-11-25下午 11:00
 */
public class Company {

    private int id;
    private String name;
    private String phone;
    private String companyAddress;
    /**
     * 注册资金
     */
    private double registered;

    private List<Factory> factories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public double getRegistered() {
        return registered;
    }

    public void setRegistered(double registered) {
        this.registered = registered;
    }

    public List<Factory> getFactories() {
        return factories;
    }

    public void setFactories(List<Factory> factories) {
        this.factories = factories;
    }
}
