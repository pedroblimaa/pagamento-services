package br.inatel.dm112.service;

import org.springframework.stereotype.Service;

import br.inatel.dm112.adapter.MailAdapter;
import br.inatel.dm112.model.MailRequestData;
import br.inatel.dm112.rest.support.UtilityException;

@Service
public class MailService {

	public void sendMail(MailRequestData mailData) {
		if (mailData.getFrom() == null ||
				mailData.getPassword() == null ||
				mailData.getTo() == null ||
				mailData.getContent() == null) {
			throw new UtilityException("Null values not allowed in MailRequestData.");
		}

		MailAdapter sender = new MailAdapter();
		try {
			sender.sendMail(mailData.getFrom(), mailData.getPassword(), mailData.getTo(), mailData.getContent());
		} catch(Exception e) {
			e.printStackTrace();
			throw new UtilityException("Error sending email: " + e.getMessage());
		}
		System.out.println("Email sent success.");
	}
}
