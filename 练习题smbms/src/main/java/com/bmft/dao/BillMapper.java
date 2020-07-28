package com.bmft.dao;


import com.bmft.pojo.Bill;

import java.util.List;
import java.util.Map;

public interface BillMapper {
    /**
     * 获取bill list 集合，
     * bill 是前端的查询信息的参数封装
     * @return
     */
    List<Bill> getBillList(Map<String,Object> map);

    /**
     * 记得在Service层调用ProviderDaoImpl实现 供应商名字的设置.
      * @param id
     * @return
     */
    Bill getBillById(String id);
    /**
     *  添加订单bill,开启事务，记得提交
     * @return
     */
    boolean addBill(Bill bill) ;

    /**
     * 订单修改 bill modify
     * @param bill
     * @return
     */
    boolean modifyBill(Bill bill) ;

    /**
     * 点击删除按钮通过id 删除 bill
     * @param id
     * @return
     */
    boolean deleteBillById(String id) ;
}
