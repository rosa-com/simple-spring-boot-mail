# simple-automatic-spring-mail
Sending an email with Spring. This version uses the annotation @EventListener and runs when the application is ready so cannot be implemented at other times. The code is compatible with the gmail SMTP.

For the mail server properties to work, your gmail password must be correct and available for a third party app/service to use. For security I used a google app password. The instructions to set one up is here: https://support.google.com/accounts/answer/185833?hl=en (select custom app in the dropdown). You would use that 16-digit passcode in application.properties.
