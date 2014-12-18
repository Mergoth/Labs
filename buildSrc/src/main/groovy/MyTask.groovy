import org.apache.commons.mail.DefaultAuthenticator
import org.apache.commons.mail.Email
import org.apache.commons.mail.SimpleEmail
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction


/**
 * Created by Admin on 18.12.2014.
 */
class MyTask extends DefaultTask{


    @TaskAction
    sendMail() {
        String to = project.properties['mail.to']?:"evgeny@inwhite.pro"
        String content = project.properties['mail.content']?:"me no build only send!"
        simpleMail(to,content)
    }

    public static void simpleMail(String to,String body) throws Exception {

        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("nowspamhere", ""));
        email.setSSLOnConnect(true);
        email.setFrom("nowspamhere@gmail.com");
        email.setSubject("TestMail");
        email.setMsg(body);
        email.addTo(to);
        email.send();
    }


}
