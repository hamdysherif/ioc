public class IoC {

    public static void main(String[] args) {

        IoC container = new IoC();

        MailService mailSvc = container.new MailService();
        mailSvc.send();
    }


    // MailService class
    public class MailService {

        private SendGridMailer mailer;

        public MailService() {
            this.mailer = new SendGridMailer();
        }

        public void send() {
            mailer.send("Test email");
        }
    }


    // SendGrid provider
    public class SendGridMailer {

        public void send(String body) {
            System.out.println(body + " sent by SendGrid");
        }
    }


    // SesMail provider
    public class SesMailer {

        public void send(String body) {
            System.out.println(body + " sent by AWS SES Mail");
        }
    }

}
