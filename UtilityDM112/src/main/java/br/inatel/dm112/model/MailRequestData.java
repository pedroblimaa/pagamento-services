package br.inatel.dm112.model;

public class MailRequestData {

	private String from;
	private String password;
	private String to;
	private String content;

	public MailRequestData() {
	}

	public MailRequestData(String from, String password, String to, String content) {
		super();
		this.from = from;
		this.password = password;
		this.to = to;
		this.content = content;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "MailRequestData [from=" + from + ", password=" + password + ", to=" + to + "]";
	}

}
