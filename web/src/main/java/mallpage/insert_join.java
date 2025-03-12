package mallpage;
// 회원가입 처리 model

import java.sql.Connection;
import java.sql.PreparedStatement;

import event.dbconfig;

public class insert_join {
    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    dbconfig db = new dbconfig();
    Integer result = null;
    // m_member mb = new m_member(); // DTO
    public Integer insert_member(m_member m) {
    	try {
			this.con = this.db.info();
			this.sql = "insert into joins value('0',?,?,?,?,?,?,?,now())";
			this.ps = this.con.prepareStatement(this.sql);
			/* DTO에서 getter 값을 DB에 저장시키는 방법 */
			this.ps.setString(1, m.getMid());
			this.ps.setString(2, m.getMpass());
			this.ps.setString(3, m.getMname());
			this.ps.setString(4, m.getMemail());
			this.ps.setString(5, m.getMtel());
			this.ps.setString(6, m.getEvent_mail());
			this.ps.setString(7, m.getEvent_sms());
			this.result = this.ps.executeUpdate();
		} catch (Exception e) {
			
		} finally {
			try {
				this.ps.close();
				this.con.close();
			} catch (Exception e) {
				this.result = null;
			}
		}
        return this.result;
    }
}
