/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import com.bean.BuroBean;
import com.dao.BuroDao;

/**
 *
 * @author Donut
 */
public class Checkbacklist {
    public String checkbacklistburo(String code) throws Exception{
        String status = "";
        BuroDao buroDao = new BuroDao();
        BuroBean burobean = new BuroBean();
        try {
           
                
            
          burobean =  buroDao.selectCode(code); ///
          if(burobean.getStatus().equals("1")){
            status = "1";
          }else{
            status = "2";
          }
        } catch (Exception e) {
           
        }
    return status;
    }
}
