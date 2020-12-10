import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        //Mail content
        String subject = "Ämne test";
        String body = "body content";
        //User details
        String from = "elliot@ensotech.io";
        String pass = "-v3@BG4Zg@7KrnX";
        //Recipient
        String to = "rasmus@ensotech.io";
        //Server to send from
        String server = "mailcluster.loopia.se";
        String port = "587";

        MailUtil.sendMail(from, pass, to, server, port, subject, body);

    }
    public static void getMailContents(){

    }
    public static void getSender(){

    }
    public static void getRecipient(){

    }
    public static void getServer(){

    }

}
