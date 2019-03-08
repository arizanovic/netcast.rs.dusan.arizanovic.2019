package com.example.demo.mail;

import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Clan;


@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;
	/*@Autowired
	private Clan clan;
	*/	
	@RequestMapping("/sendMail")
	@Scheduled(cron = "0 0 0 1 * ? ")
	public String send() {

		Clan clan = new Clan();
		clan.setIme("Teretana");
		clan.setPrezime("Teretancevic");
		clan.setEmail("netcastproba@gmail.com");
		
		
		try {
			emailService.sendEmail(clan);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Vasa posta je poslata clanu!";
	}
	 
	@RequestMapping("/sendMailAttachment")
	public String sendWithAttachment() throws MessagingException {
		
		try {
			Clan clan = new Clan();
			emailService.sendEmailWithAttachment(clan);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Vasa posta ce biti poslata clanu!";
	}	
}
