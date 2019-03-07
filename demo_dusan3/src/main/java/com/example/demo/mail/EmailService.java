package com.example.demo.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.example.demo.domain.Clan;

@Service
public class EmailService{
	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public EmailService(JavaMailSender javaMailSender) {
		super();
		this.javaMailSender = javaMailSender;
	}
	

	public void sendEmail(Clan clan) throws MailException {
		
		SimpleMailMessage mail = new SimpleMailMessage();

		mail.setTo("netcastproba@gmail.com");
		mail.setFrom("netcastproba@gmail.com");
		mail.setSubject("Automatski mail!");
		mail.setText("imlementiraj cenu");
				
		javaMailSender.send(mail);
	}
	
	public void sendEmailWithAttachment(Clan clan) throws MailException, MessagingException {

		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setTo(clan.getEmail());
		helper.setSubject("Mail sa atacmentom");
		helper.setText("potrazi atacment");

		FileSystemResource file = new FileSystemResource("");
		helper.addAttachment(file.getFilename(), file);

		javaMailSender.send(message);
	}

}
