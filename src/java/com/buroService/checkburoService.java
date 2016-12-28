/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buroService;

import com.dao.BuroDao;
import com.util.Checkbacklist;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Donut
 */
@WebService(serviceName = "checkburoService")
public class checkburoService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkburo")
    public String checkburo(@WebParam(name = "code") String code) throws Exception {
        Checkbacklist check = new Checkbacklist();
      String ok = check.checkbacklistburo(code);     
        return ok;
    }
}
