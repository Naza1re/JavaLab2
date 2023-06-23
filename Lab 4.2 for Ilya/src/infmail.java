import java.util.Date;
import java.text.SimpleDateFormat;

public class infmail {
private final String SendMail;
    private final String getMail;
    private final Date dateandtime;
    private final int MailBites;
    public infmail(String SendMail, String getMail,Date dateandtime,int MailBites){
        this.SendMail=SendMail;
        this.getMail=getMail;
        this.dateandtime=dateandtime;
        this.MailBites=MailBites;
    }

    public Date getDateandtime() { return dateandtime;}

    public int getMailBites() {
        return MailBites;
    }

    public String getGetMail() {
        return getMail;
    }

    public String getSendMail() {
        return SendMail;
    }
    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return "\"" + SendMail + "\";\"" + getMail + "\";\"" + format.format(dateandtime) + "\";\"" + MailBites + "\"\n";
    }
}
