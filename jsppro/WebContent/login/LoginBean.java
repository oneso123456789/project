package beans;

public class LoginBean {	
	
	private String userid;
	private String passwd;

	private String _userid;
	private String _passwd;
	
	// ������
	public LoginBean() {
		// ������ ����� �⺻�� ����
		_userid = "myuser";
		_passwd = "1234";
	}
	
	// ���̵�� ��й�ȣ�� �´��� üũ�ϴ� �޼���
	public boolean checkUser() {
		if(userid.equals(_userid) && passwd.equals(_passwd))
			return true;
		else
			return false;
	}		
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}	
	
	public String getUserid() {
		return userid;
	}
	
	public String getPasswd() {
		return passwd;
	}
}