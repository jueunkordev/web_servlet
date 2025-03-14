package mallpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import event.dbconfig;

//Copyright Model
public class copyright {
   Connection con = null;
   PreparedStatement ps = null;
   ResultSet rs = null;
   String sql = null;
   ArrayList<String> cp = null;
   dbconfig db = new dbconfig();
   // 연결 안 되면 m_dbinfo db = new db_info

   public static void main(String[] args) {
      new copyright().copyright_info();
   }

   public ArrayList<String> copyright_info() {
      try {
         this.con = this.db.info();
         this.sql = "select * from corp_info";
         this.ps = this.con.prepareStatement(this.sql);
         this.rs = this.ps.executeQuery();
         this.rs.next();
         this.cp = new ArrayList<String>();
         
         this.cp.add(this.rs.getString("corp_nm"));
         this.cp.add(this.rs.getString("ceo_nm"));
         this.cp.add(this.rs.getString("corp_addr"));
         this.cp.add(this.rs.getString("corp_tel"));
         this.cp.add(this.rs.getString("corp_time"));
         this.cp.add(this.rs.getString("ceo_email"));
         this.cp.add(this.rs.getString("corp_no"));
         this.cp.add(this.rs.getString("corp_no2"));
         this.cp.add(this.rs.getString("corp_master"));
         this.cp.add(this.rs.getString("corp_domain"));
         //System.out.println(this.cp);
         
      } catch (Exception e) {

      } finally {
    	  try {
    		  this.rs.close();
    		  this.ps.close();
    		  this.con.close();
		} catch (Exception e) {
			System.out.println("데이터베이스 Error!!");
		}
      }
      return this.cp;
   }
}
