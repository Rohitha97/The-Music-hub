
package Music_Band;


public class bList {
    private int bcID;
    private String bcCName;
    private String bcName;
    private String bcBDate;
    private String bcBLoction;
    private int bcNOH;
    private int bcTotal;
    
    
    public bList(int Id,String bCName,String bName,String BDate,String BL,int noh,int tot)
    {
        this.bcID= Id;
        this.bcCName = bCName;
        this.bcName = bName;
        this.bcBDate = BDate;
        this.bcBLoction = BL;
        this.bcNOH = noh;
        this.bcTotal = tot;
    }

    public int getId()
    {
        return bcID;
    }
    
    public String getbCName()
    {
        return bcCName;
    }

    public String getbName()
    {
        return bcName;
    }
    
    public String getBDate()
    {
        return bcBDate;
    }
    
    public String getBL()
    {
        return bcBLoction;
    }
    
    public int getnoh()
    {
        return bcNOH;
    }
    
    public int gettot()
    {
        return bcTotal;
    }    
      
    
}
