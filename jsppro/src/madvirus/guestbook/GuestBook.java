package madvirus.guestbook;

import java.sql.Timestamp;

public class GuestBook extends Object{
	private int id;
	private Timestamp register;
	private String name;
	private String email;
	private String password;
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getRegister() {
		return register;
	}

	public void setRegister(Timestamp register) {
		this.register = register;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
