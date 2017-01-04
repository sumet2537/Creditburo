/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.BuroBean;
import com.util.DBConnect;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Donut
 */
public class BuroDao {
    
    public void updateStatus(BuroBean bean) throws Exception {
             DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "update tbl_backlist  set br_Status=? where br_code=?";

        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, bean.getStatus());
            p.setString(2, bean.getBr_Code());

            p.executeUpdate();

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void insert(BuroBean buro) throws Exception {
       DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "insert into tbl_backlist values(?,?,?,?,?,?,?,?)";
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, 0);
            p.setString(2, buro.getBr_Code());
            p.setString(3, buro.getBr_Account());
            p.setString(4, buro.getBr_Bank());
            p.setString(5, buro.getBr_Name());
            p.setString(6, buro.getBr_Lastname());
            p.setDouble(7, buro.getSt_Total());
            p.setString(8, buro.getStatus());
            

            p.executeUpdate();

        } finally {
            try {
                p.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //ค้นหาด้วยไอดี
    public BuroBean selectCode(String Code) throws Exception {
        BuroBean bean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_backlist  where  br_Code = ? ";
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, Code);

            rs = p.executeQuery();

            while (rs.next()) {
                bean = new BuroBean();
                bean.setBr_Code(rs.getString("br_Code"));
                bean.setBr_Account(rs.getString("br_Account"));
                bean.setBr_Bank(rs.getString("br_Bank"));
                bean.setBr_Name(rs.getString("br_Name"));
                bean.setBr_Lastname(rs.getString("br_Lastname"));
                bean.setBr_Total(rs.getString("br_Total"));
                bean.setStatus(rs.getString("br_Status"));    
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return bean;

    }
    
     public Boolean selectCodeBo(String Code) throws Exception {
        BuroBean bean = null;
        ResultSet rs = null;
      DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_backlist  where  br_Code = ? ";
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, Code);

            rs = p.executeQuery();

   

        } finally {
            try {
                p.close();
                con.close();
                
            } catch (Exception e) {
                e.printStackTrace();
             
            }
            
        }

     return true;

    }

    public ArrayList<BuroBean> selectaccount(String account) throws Exception {
        BuroBean bean = null;
        ResultSet rs = null;
    DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_backlist  where  br_Account = ? ";
        PreparedStatement p = null;
        ArrayList<BuroBean> list = new ArrayList<BuroBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, account);

            rs = p.executeQuery();

            while (rs.next()) {
                bean = new BuroBean();
                        bean = new BuroBean();
                bean.setBr_Code(rs.getString("br_Code"));
                bean.setBr_Account(rs.getString("br_Account"));
                bean.setBr_Bank(rs.getString("br_Bank"));
                bean.setBr_Name(rs.getString("br_Name"));
                bean.setBr_Lastname(rs.getString("br_Lastname"));
                bean.setBr_Total(rs.getString("br_Total"));
                String sta = rs.getString("br_Status");
                if(sta.equals("1")){
                bean.setStatus("ติดเครดิตบูโร");
                }else{
                    bean.setStatus("ไม่ติดเครดิตบูโร");
                }
                
      
                list.add(bean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;

    }
    //selectAll

    public ArrayList<BuroBean> selectStatus(String Status) throws Exception {
        BuroBean bean = null;
        ResultSet rs = null;
          DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_backlist where br_Status=?";
        PreparedStatement p = null;
        ArrayList<BuroBean> list = new ArrayList<BuroBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, Status);
            rs = p.executeQuery();

            while (rs.next()) {
                               bean = new BuroBean();
                bean.setBr_Code(rs.getString("br_Code"));
                bean.setBr_Account(rs.getString("br_Account"));
                bean.setBr_Bank(rs.getString("br_Bank"));
                bean.setBr_Name(rs.getString("br_Name"));
                bean.setBr_Lastname(rs.getString("br_Lastname"));
                bean.setBr_Total(rs.getString("br_Total"));
                bean.setStatus(rs.getString("br_Status"));
      
                list.add(bean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
}
        public ArrayList<BuroBean> selectAll() throws Exception {
        BuroBean bean = null;
        ResultSet rs = null;
         DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_backlist ";
        PreparedStatement p = null;
        ArrayList<BuroBean> list = new ArrayList<BuroBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);           
rs = p.executeQuery();
            while (rs.next()) {
                bean = new BuroBean();
                bean.setBr_Code(rs.getString("br_Code"));
                bean.setBr_Account(rs.getString("br_Account"));
                bean.setBr_Bank(rs.getString("br_Bank"));
                bean.setBr_Name(rs.getString("br_Name"));
                bean.setBr_Lastname(rs.getString("br_Lastname"));
                bean.setBr_Total(rs.getString("br_Total"));
                   String sta = rs.getString("br_Status");
                if(sta.equals("1")){
                bean.setStatus("ติดเครดิตบูโร");
                }else{
                    bean.setStatus("ไม่ติดเครดิตบูโร");
                }
      
                list.add(bean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
}
        
        public ArrayList<BuroBean> selectlike (String data) throws Exception {
        BuroBean bean = null;
        ResultSet rs = null;
         DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "select * from tbl_backlist where br_Code like'%" + data + "%' or br_Account like'%" + data + "%' or br_Bank like'%" + data + "%' "
                + "or br_Name like'%" + data + "%' or br_Lastname like'%" + data + "%' " ;
        PreparedStatement p = null;
        ArrayList<BuroBean> list = new ArrayList<BuroBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            
            rs = p.executeQuery();

            while (rs.next()) {
               bean = new BuroBean();
                bean.setBr_Code(rs.getString("br_Code"));
                bean.setBr_Account(rs.getString("br_Account"));
                bean.setBr_Bank(rs.getString("br_Bank"));
                bean.setBr_Name(rs.getString("br_Name"));
                bean.setBr_Lastname(rs.getString("br_Lastname"));
                bean.setBr_Total(rs.getString("br_Total"));
                bean.setStatus(rs.getString("br_Status"));
      
                list.add(bean);
            
            }
        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return list;
    } 

        
        public static void main(String[] args) throws Exception {
        BuroBean bb = new BuroBean();
        BuroDao bd = new BuroDao();
        ArrayList<BuroBean> list = new ArrayList<BuroBean>();
        
       bb = bd.selectCode("1");
            System.out.println("code" + bb.getBr_Code());
            System.out.println("status" + bb.getStatus());
            
            
//                list = bd.selectlike("กสิกร");
//           int chk = list.size();
//             System.out.println("size==="+ chk);
//             for (BuroBean buroBean : list){
//                 System.out.println("id" + buroBean.getBr_Account());
//                 System.out.println("firstname" + buroBean.getBr_Name());
//                 System.out.println("---------------------------------");
//             }
        
    }
}
