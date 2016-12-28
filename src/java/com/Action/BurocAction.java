/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Action;

import com.Form.BurocForm;
import com.bean.BuroBean;
import com.dao.BuroDao;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author Donut
 */
public class BurocAction extends DispatchAction {

    public ActionForward ckeck(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
              ArrayList<BuroBean> list = null ;
        BuroDao Dao = new BuroDao();
        list = Dao.selectStatus("1");
        request.getSession().setAttribute("listBuro", list);
        return mapping.findForward("listburo");
    
    }
        public ActionForward addData(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
 BurocForm buroform = (BurocForm) form;
        return mapping.findForward("gotoadddata");
    
    }
    
      public ActionForward insertburo(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            BurocForm buroform = (BurocForm) form;
            BuroBean bean = new BuroBean();
            BuroDao dao = new BuroDao();
            String part;
            bean.setBr_Code(buroform.getBr_Code());
            bean.setBr_Account(buroform.getBr_Account());
            bean.setBr_Bank(buroform.getBr_Bank());
            bean.setBr_Name(buroform.getBr_Name());
            bean.setBr_Lastname(buroform.getBr_Lastname());
            bean.setSt_Total(buroform.getBr_Total());
            bean.setStatus("1");
            try{
            dao.insert(bean);
            part = "gotosuccess";
            String msg = "บันทึกข้อมูลสำเร็จ";
            request.setAttribute("msgsuccess", msg);
            }catch(Exception e){
                part = "gotoerror";
                String msg = "ไม่สามารถเพิ่มข้อมูลได้";
                request.setAttribute("msgerror", msg);
            }
            
        ArrayList<BuroBean> list = null ;
        BuroDao Dao = new BuroDao();
        list = Dao.selectStatus("1");
        request.getSession().setAttribute("listBuro", list);
        return mapping.findForward(part);
    
    }
      
        public ActionForward selectlike(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            BurocForm buroform = (BurocForm) form;
            BuroBean bean = new BuroBean();
            BuroDao dao = new BuroDao();
         String data = buroform.getSert();
            request.getSession().removeAttribute("listBuro");
        ArrayList<BuroBean> list = null ;
        BuroDao Dao = new BuroDao();
        list = Dao.selectlike(data);
        request.getSession().setAttribute("listBuro", list);
        return mapping.findForward("gotosuccess");
    
    }


}
