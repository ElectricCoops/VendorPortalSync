package pwr.lcec.sync.email;

import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmailHelper {
	private static Logger logger = LogManager.getLogger(EmailHelper.class);

	private String emailMessage;

	public boolean sendEmail(List<String> recipients, String subject, String body) {
		String from = "donot.reply@lcec.net";
		String host = "webmail.lcec.pwr";
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);
		Session session = Session.getDefaultInstance(properties);

		try {
			MimeMessage message = new MimeMessage(session);

			message.setFrom(new InternetAddress(from));
			recipients.stream().forEach(to -> {

				try {
					message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				} catch (MessagingException e) {
					logger.error("Error Occured: " + e.getMessage());
				}
			});

			message.setSubject(subject);
			message.setContent(body, "text/html");

			Transport.send(message);
			logger.info("Sent message successfully....");
			return true;
		} catch (MessagingException mex) {
			logger.error(mex.getMessage());
			return false;
		}
	}

	public String getEmailMessage(String fileName, String filePath, boolean hasExport) {
		String message;
		if (hasExport) {
			message = "<div class=\"\">\r\n\t<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\r\n\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 10px;\">\t\r\n\t\t<div style=\"line-height:18px;font-size:12px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;line-height: 18px;text-align: center;font-size: 12px\"><span style=\"font-size: 16px; line-height: 24px;\"><strong>"
					+

					fileName + "   </strong></span></p></div>\t\r\n" + "\t</div>\r\n"
					+ "\t<!--[if mso]></td></tr></table><![endif]-->\r\n" + "</div>\r\n" + "                  \r\n"
					+ "                  \r\n";
		} else {
			message = "<div class=\"\">\r\n\t<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\r\n\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 10px;\">\t\r\n\t\t<div style=\"line-height:18px;font-size:12px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;line-height: 18px;text-align: center;font-size: 12px\"><span style=\"font-size: 16px; line-height: 24px;\"><strong>No Invoice export today.</strong></span></p></div>\t\r\n\t</div>\r\n\t<!--[if mso]></td></tr></table><![endif]-->\r\n</div>\r\n                  \r\n                  \r\n";
		}

		this.emailMessage = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\"><head>\r\n    <!--[if gte mso 9]><xml>\r\n     <o:OfficeDocumentSettings>\r\n      <o:AllowPNG/>\r\n      <o:PixelsPerInch>96</o:PixelsPerInch>\r\n     </o:OfficeDocumentSettings>\r\n    </xml><![endif]-->\r\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width\">\r\n    <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\r\n    <title></title>\r\n    \r\n    \r\n    <style type=\"text/css\" id=\"media-query\">\r\n      body {\r\n  margin: 0;\r\n  padding: 0; }\r\n\r\ntable, tr, td {\r\n  vertical-align: top;\r\n  border-collapse: collapse; }\r\n\r\n.ie-browser table, .mso-container table {\r\n  table-layout: fixed; }\r\n\r\n* {\r\n  line-height: inherit; }\r\n\r\na[x-apple-data-detectors=true] {\r\n  color: inherit !important;\r\n  text-decoration: none !important; }\r\n\r\n[owa] .img-container div, [owa] .img-container button {\r\n  display: block !important; }\r\n\r\n[owa] .fullwidth button {\r\n  width: 100% !important; }\r\n\r\n[owa] .block-grid .col {\r\n  display: table-cell;\r\n  float: none !important;\r\n  vertical-align: top; }\r\n\r\n.ie-browser .num12, .ie-browser .block-grid, [owa] .num12, [owa] .block-grid {\r\n  width: 600px !important; }\r\n\r\n.ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div {\r\n  line-height: 100%; }\r\n\r\n.ie-browser .mixed-two-up .num4, [owa] .mixed-two-up .num4 {\r\n  width: 200px !important; }\r\n\r\n.ie-browser .mixed-two-up .num8, [owa] .mixed-two-up .num8 {\r\n  width: 400px !important; }\r\n\r\n.ie-browser .block-grid.two-up .col, [owa] .block-grid.two-up .col {\r\n  width: 300px !important; }\r\n\r\n.ie-browser .block-grid.three-up .col, [owa] .block-grid.three-up .col {\r\n  width: 200px !important; }\r\n\r\n.ie-browser .block-grid.four-up .col, [owa] .block-grid.four-up .col {\r\n  width: 150px !important; }\r\n\r\n.ie-browser .block-grid.five-up .col, [owa] .block-grid.five-up .col {\r\n  width: 120px !important; }\r\n\r\n.ie-browser .block-grid.six-up .col, [owa] .block-grid.six-up .col {\r\n  width: 100px !important; }\r\n\r\n.ie-browser .block-grid.seven-up .col, [owa] .block-grid.seven-up .col {\r\n  width: 85px !important; }\r\n\r\n.ie-browser .block-grid.eight-up .col, [owa] .block-grid.eight-up .col {\r\n  width: 75px !important; }\r\n\r\n.ie-browser .block-grid.nine-up .col, [owa] .block-grid.nine-up .col {\r\n  width: 66px !important; }\r\n\r\n.ie-browser .block-grid.ten-up .col, [owa] .block-grid.ten-up .col {\r\n  width: 60px !important; }\r\n\r\n.ie-browser .block-grid.eleven-up .col, [owa] .block-grid.eleven-up .col {\r\n  width: 54px !important; }\r\n\r\n.ie-browser .block-grid.twelve-up .col, [owa] .block-grid.twelve-up .col {\r\n  width: 50px !important; }\r\n\r\n@media only screen and (min-width: 620px) {\r\n  .block-grid {\r\n    width: 600px !important; }\r\n  .block-grid .col {\r\n    vertical-align: top; }\r\n    .block-grid .col.num12 {\r\n      width: 600px !important; }\r\n  .block-grid.mixed-two-up .col.num4 {\r\n    width: 200px !important; }\r\n  .block-grid.mixed-two-up .col.num8 {\r\n    width: 400px !important; }\r\n  .block-grid.two-up .col {\r\n    width: 300px !important; }\r\n  .block-grid.three-up .col {\r\n    width: 200px !important; }\r\n  .block-grid.four-up .col {\r\n    width: 150px !important; }\r\n  .block-grid.five-up .col {\r\n    width: 120px !important; }\r\n  .block-grid.six-up .col {\r\n    width: 100px !important; }\r\n  .block-grid.seven-up .col {\r\n    width: 85px !important; }\r\n  .block-grid.eight-up .col {\r\n    width: 75px !important; }\r\n  .block-grid.nine-up .col {\r\n    width: 66px !important; }\r\n  .block-grid.ten-up .col {\r\n    width: 60px !important; }\r\n  .block-grid.eleven-up .col {\r\n    width: 54px !important; }\r\n  .block-grid.twelve-up .col {\r\n    width: 50px !important; } }\r\n\r\n@media (max-width: 620px) {\r\n  .block-grid, .col {\r\n    min-width: 320px !important;\r\n    max-width: 100% !important;\r\n    display: block !important; }\r\n  .block-grid {\r\n    width: calc(100% - 40px) !important; }\r\n  .col {\r\n    width: 100% !important; }\r\n    .col > div {\r\n      margin: 0 auto; }\r\n  img.fullwidth, img.fullwidthOnMobile {\r\n    max-width: 100% !important; }\r\n  .no-stack .col {\r\n    min-width: 0 !important;\r\n    display: table-cell !important; }\r\n  .no-stack.two-up .col {\r\n    width: 50% !important; }\r\n  .no-stack.mixed-two-up .col.num4 {\r\n    width: 33% !important; }\r\n  .no-stack.mixed-two-up .col.num8 {\r\n    width: 66% !important; }\r\n  .no-stack.three-up .col.num4 {\r\n    width: 33% !important; }\r\n  .no-stack.four-up .col.num3 {\r\n    width: 25% !important; }\r\n  .mobile_hide {\r\n    min-height: 0px;\r\n    max-height: 0px;\r\n    max-width: 0px;\r\n    display: none;\r\n    overflow: hidden;\r\n    font-size: 0px; } }\r\n\r\n    </style>\r\n</head>\r\n<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #283C4B\">\r\n  <style type=\"text/css\" id=\"media-query-bodytag\">\r\n    @media (max-width: 520px) {\r\n      .block-grid {\r\n        min-width: 320px!important;\r\n        max-width: 100%!important;\r\n        width: 100%!important;\r\n        display: block!important;\r\n      }\r\n\r\n      .col {\r\n        min-width: 320px!important;\r\n        max-width: 100%!important;\r\n        width: 100%!important;\r\n        display: block!important;\r\n      }\r\n\r\n        .col > div {\r\n          margin: 0 auto;\r\n        }\r\n\r\n      img.fullwidth {\r\n        max-width: 100%!important;\r\n      }\r\n\t\t\timg.fullwidthOnMobile {\r\n        max-width: 100%!important;\r\n      }\r\n      .no-stack .col {\r\n\t\t\t\tmin-width: 0!important;\r\n\t\t\t\tdisplay: table-cell!important;\r\n\t\t\t}\r\n\t\t\t.no-stack.two-up .col {\r\n\t\t\t\twidth: 50%!important;\r\n\t\t\t}\r\n\t\t\t.no-stack.mixed-two-up .col.num4 {\r\n\t\t\t\twidth: 33%!important;\r\n\t\t\t}\r\n\t\t\t.no-stack.mixed-two-up .col.num8 {\r\n\t\t\t\twidth: 66%!important;\r\n\t\t\t}\r\n\t\t\t.no-stack.three-up .col.num4 {\r\n\t\t\t\twidth: 33%!important;\r\n\t\t\t}\r\n\t\t\t.no-stack.four-up .col.num3 {\r\n\t\t\t\twidth: 25%!important;\r\n\t\t\t}\r\n      .mobile_hide {\r\n        min-height: 0px!important;\r\n        max-height: 0px!important;\r\n        max-width: 0px!important;\r\n        display: none!important;\r\n        overflow: hidden!important;\r\n        font-size: 0px!important;\r\n      }\r\n    }\r\n  </style>\r\n  <!--[if IE]><div class=\"ie-browser\"><![endif]-->\r\n  <!--[if mso]><div class=\"mso-container\"><![endif]-->\r\n  <table class=\"nl-container\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #283C4B;width: 100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tbody>\r\n\t<tr style=\"vertical-align: top\">\r\n\t\t<td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\r\n    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #283C4B;\"><![endif]-->\r\n\r\n    <div style=\"background-color:#283C4B;\">\r\n      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #3AAEE0;\" class=\"block-grid \">\r\n        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#3AAEE0;\">\r\n          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#283C4B;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#3AAEE0;\"><![endif]-->\r\n\r\n              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n              <div style=\"background-color: transparent; width: 100% !important;\">\r\n              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n\r\n                  \r\n                    <div class=\"\">\r\n\t<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 20px; padding-left: 20px; padding-top: 30px; padding-bottom: 20px;\"><![endif]-->\r\n\t<div style=\"color:#FFFFFF;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:120%; padding-right: 20px; padding-left: 20px; padding-top: 30px; padding-bottom: 20px;\">\t\r\n\t\t<div style=\"font-size:12px;line-height:14px;color:#FFFFFF;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 18px;line-height: 22px;text-align: center\"><span style=\"font-size: 24px; line-height: 28px;\">Vendor Portal Invoice Notification</span></p></div>\t\r\n\t</div>\r\n\t<!--[if mso]></td></tr></table><![endif]-->\r\n</div>\r\n                  \r\n              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n              </div>\r\n            </div>\r\n          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n        </div>\r\n      </div>\r\n    </div>\r\n    <div style=\"background-color:#283C4B;\">\r\n      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #FFFFFF;\" class=\"block-grid \">\r\n        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#FFFFFF;\">\r\n          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#283C4B;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#FFFFFF;\"><![endif]-->\r\n\r\n              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:15px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n              <div style=\"background-color: transparent; width: 100% !important;\">\r\n              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:15px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n\r\n                  \r\n"
				+

				message + "                    \r\n"
				+ "<div align=\"center\" class=\"button-container center \" style=\"padding-right: 0px; padding-left: 0px; padding-top:25px; padding-bottom:0px;\">\r\n"
				+ "  <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-spacing: 0; border-collapse: collapse; mso-table-lspace:0pt; mso-table-rspace:0pt;\"><tr><td style=\"padding-right: 0px; padding-left: 0px; padding-top:25px; padding-bottom:0px;\" align=\"center\"><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\""
				+ filePath
				+ "\" style=\"height:39pt; v-text-anchor:middle; width:129pt;\" arcsize=\"8%\" strokecolor=\"#3AAEE0\" fillcolor=\"#3AAEE0\"><w:anchorlock/><v:textbox inset=\"0,0,0,0\"><center style=\"color:#ffffff; font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size:16px;\"><![endif]-->\r\n"
				+ "    <div style=\"color: #ffffff; background-color: #3AAEE0; border-radius: 4px; -webkit-border-radius: 4px; -moz-border-radius: 4px; max-width: 172px; width: 132px;width: auto; border-top: 0px solid transparent; border-right: 0px solid transparent; border-bottom: 0px solid transparent; border-left: 0px solid transparent; padding-top: 10px; padding-right: 20px; padding-bottom: 10px; padding-left: 20px; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; text-align: center; mso-border-alt: none;\">\r\n"
				+ "      <span style=\"font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;font-size:16px;line-height:32px;\"><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; font-size: 14px; line-height: 32px;\">Open File Share</span></span>\r\n"
				+ "    </div>\r\n"
				+ "  <!--[if mso]></center></v:textbox></v:roundrect></td></tr></table><![endif]-->\r\n" + "</div>\r\n"
				+ "\r\n" + "                  \r\n"
				+ "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + "              </div>\r\n"
				+ "            </div>\r\n"
				+ "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n"
				+ "        </div>\r\n" + "      </div>\r\n" + "    </div>\r\n"
				+ "    <div style=\"background-color:transparent;\">\r\n"
				+ "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\r\n"
				+ "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\r\n"
				+ "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\r\n"
				+ "\r\n"
				+ "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n"
				+ "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n"
				+ "              <div style=\"background-color: transparent; width: 100% !important;\">\r\n"
				+ "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n"
				+ "\r\n" + "                  \r\n" + "                    \r\n"
				+ "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider \" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n"
				+ "    <tbody>\r\n" + "        <tr style=\"vertical-align: top\">\r\n"
				+ "            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 10px;padding-left: 10px;padding-top: 10px;padding-bottom: 10px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n"
				+ "                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n"
				+ "                    <tbody>\r\n" + "                        <tr style=\"vertical-align: top\">\r\n"
				+ "                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n"
				+ "                                <span></span>\r\n" + "                            </td>\r\n"
				+ "                        </tr>\r\n" + "                    </tbody>\r\n"
				+ "                </table>\r\n" + "            </td>\r\n" + "        </tr>\r\n" + "    </tbody>\r\n"
				+ "</table>\r\n" + "                  \r\n"
				+ "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + "              </div>\r\n"
				+ "            </div>\r\n"
				+ "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n"
				+ "        </div>\r\n" + "      </div>\r\n" + "    </div>\r\n"
				+ "   <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\r\n" + "\t\t</td>\r\n" + "  </tr>\r\n"
				+ "  </tbody>\r\n" + "  </table>\r\n" + "  <!--[if (mso)|(IE)]></div><![endif]-->\r\n" + "\r\n" + "\r\n"
				+ "</body></html>";

		return this.emailMessage;
	}
}
