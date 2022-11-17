/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class koneksi {
     Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud/","root","0751");
        ResultSet hasil = koneksi.createStatement().executeQuery ("Select * from tes ");

}
