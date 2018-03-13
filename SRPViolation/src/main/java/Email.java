public class Email implements EmailInterface
{
    private String sender;
    private String receiver;
    private String content;

    public void setSender(String sender)
    {
        this.sender = sender;
    }
    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }
    public void setContent(String content)
    {
        this.content = content;
    }
}
