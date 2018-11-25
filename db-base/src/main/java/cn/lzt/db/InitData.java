package cn.lzt.db;

import cn.lzt.db.entity.Company;
import cn.lzt.db.entity.Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luoyong
 * @date 2018-11-25下午 11:03
 */
public class InitData {

    private static List<Company> companies = new ArrayList<>(8);

    public static List<Company> getCompanies() {
        return companies;
    }

    public static void setCompanies(List<Company> companies) {
        InitData.companies = companies;
    }

    static {

        companies.add(new Company(){{
            setId(001);
            setName("上海汽车股份有限公司");
            setCompanyAddress("上海中心大厦");
            setPhone("021-88888");
            setRegistered(50000000D);
            setFactories(new ArrayList<Factory>(){{
                add(new Factory(){{
                    setId(1000000001);
                    setFactoryCode("zx8999");
                    setName("无锡工厂");
                    setFactoryAddress("无锡尚德路3999号");
                }
            });

                add(new Factory(){{
                    setId(1000000002);
                    setFactoryCode("zx8996");
                    setName("广东东莞制造厂");
                    setFactoryAddress("广东东莞天河区泰和路231号");
                }
                });

                add(new Factory(){{
                    setId(1000000003);
                    setFactoryCode("xjgl222");
                    setName("神州工厂");
                    setFactoryAddress("火星市地区村中国区222dc");
                }
                });
            }});
        }});

        companies.add(new Company(){{
            setId(002);
            setName("皇家壳牌石油 ");
            setCompanyAddress("英国/荷兰");
            setPhone("98989-88888");
            setRegistered(7777777D);
            setFactories(new ArrayList<Factory>(){{
                add(new Factory(){{
                    setId(2000000001);
                    setFactoryCode("YXGK22");
                    setName("英国德克赛斯州城市高速20");
                    setFactoryAddress("英国德克赛斯州城市高速20");
                }
                });

                add(new Factory(){{
                    setId(2000000002);
                    setFactoryCode("hkq2213");
                    setName("艾欧尼亚去");
                    setFactoryAddress("艾欧尼亚去泰和路231号");
                }
                });

                add(new Factory(){{
                    setId(2000000003);
                    setFactoryCode("xjgl2322");
                    setName("神州工厂222");
                    setFactoryAddress("火星市地区村中国区22213232dc");
                }
                });
            }});
        }});
    }
}
