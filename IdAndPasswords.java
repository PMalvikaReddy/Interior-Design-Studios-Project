package InteriorDesignStudios;

import java.util.HashMap;

public class IdAndPasswords {
	HashMap<String,String>logininfo=new HashMap<String,String>();
	IdAndPasswords(){
		logininfo.put("malvika", "hello123");
		logininfo.put("p", "p");
		logininfo.put("mellisa", "123456");
	}
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
