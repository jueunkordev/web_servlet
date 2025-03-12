package mallpage;

import java.util.ArrayList;

public abstract class ab_footer {
	// copyright 정보 model
	copyright cr = new copyright();
	ArrayList<String> cpdata = null;
	public void fts() {
		this.cpdata = this.cr.copyright_info();
		
	}
	
		
}
