package srp;

public class GetConfiguration {
	private String smtpHost = null;
	private String altSmtpHost = null; 
	private String fromAddress = null;
	private static Configuration config; 
	{
		config=new Configuration();
		smtpHost = config.getProperty(ConfigurationKeys.SMTP_SERVER); 
		altSmtpHost = config.getProperty(ConfigurationKeys.ALT_SMTP_SERVER); 
		fromAddress = config.getProperty(ConfigurationKeys.EMAIL_ADMIN); 
	}
	public String getSmtpHost() {
		return smtpHost;
	}
	public String getAltSmtpHost() {
		return altSmtpHost;
	}
	public String getFromAddress() {
		return fromAddress;
	}
	public static Configuration getConfig() {
		return config;
	}
}
