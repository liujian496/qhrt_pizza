package com.qhfax.pizza.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysController {
	
	private static final Logger logger = LogManager.getLogger(SysController.class);
	
	@RequestMapping(value="/fire")
	public @ResponseBody String fire() throws Exception {
//		String result = "";
//		Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//        try {
//            conn = this.getConnection("jdbc:mysql://192.168.5.17:3306/test","root","paic1234");
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery("select userid, username from qhfax_user");
//            while (rs.next()){
//            	result += String.join("|", rs.getString(1), rs.getString(2));
//            }
//        } catch (Exception e) {
//            logger.error("init apps error:" + e.getMessage(), e);
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//                if (stmt != null) {
//                    stmt.close();
//                }
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                logger.error("close ds error:" + e.getMessage(), e);
//            }
//        }
//        return "My First Fire Starting, " + result + ", OK...LIUJIAN...123456789";
		logger.info("==== my first qhrt pizza starting3 ====");
		return "==== my first qhrt pizza starting3 ====";
	}
	
//	private Connection getConnection(String url, String username, String password) {
//        Connection conn = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            logger.info("init url:{} driver success", url);
//            conn = DriverManager.getConnection(url,username,password);
//            logger.info("connect url:{} success", url);
//        } catch (Exception e) {
//            logger.error("get connection error:" + e.getMessage(), e);
//        }
//        return conn;
//    }
}
