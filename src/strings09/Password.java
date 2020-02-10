package strings09;

public class Password {
	private String pass;

	public Password() {
		pass = "1aaaaa!?";
	}

	public boolean match(String xPass) {
		boolean answ = false;
		if (pass.equals(xPass) == true)
			answ = true;
		else
			answ=false;
		return answ;
	}

	public boolean setPass(String newPass) {
		boolean answ2 = false;
		if (newPass.charAt(0) >= '0' && newPass.charAt(0) <= '9'&&newPass.length() > 7 && newPass.length() < 22
				&&newPass.contains("!") && newPass.contains("?")&&!newPass.contains(" ")){
						answ2 = true;
						pass=newPass;
		}
		return answ2;
	}
}
