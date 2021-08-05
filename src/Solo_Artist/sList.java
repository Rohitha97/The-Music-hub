package Solo_Artist;


public class sList {
    private int scID;
    private String scUName;
    private String scName;
    private String scBDate;
    private String scBLoction;
    private int scNOS;
    private int scTotal;
    
    
    public sList(int Id,String UName,String aName,String BDate,String BL,int nos,int tot)
    {
        this.scID= Id;
        this.scUName = UName;
        this.scName = aName;
        this.scBDate = BDate;
        this.scBLoction = BL;
        this.scNOS = nos;
        this.scTotal = tot;
    }

    public int getId()
    {
        return scID;
    }
    
    public String getUName()
    {
        return scUName;
    }
    
    public String getaName()
    {
        return scName;
    }
    
    public String getBDate()
    {
        return scBDate;
    }
    
    public String getBL()
    {
        return scBLoction;
    }
    
    public int getnos()
    {
        return scNOS;
    }
    
    public int gettot()
    {
        return scTotal;
    }    
  
}

