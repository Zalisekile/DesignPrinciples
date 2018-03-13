public class Email
{
    private String sender;
    private String receiver;
    private  ContentInterface content;

    public void setSender(String sender)
    {
        this.sender = sender;
    }
    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }
    public void setContent(ContentInterface content)
    {
        this.content = content;
    }
}
