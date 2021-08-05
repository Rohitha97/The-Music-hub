
package Dj_Artist;


public class djList {
    
    private int dcID;
    private String dcCName;
    private String dcName;
    private String dcBDate;
    private String dcBLoction;
    private int dcNOH;
    private int dcTotal;

   public djList(int Id,String djCName,String djName,String BDate,String BL,int noh,int tot)
    {
        this.dcID= Id;
        this.dcCName = djCName;
        this.dcName = djName;
        this.dcBDate = BDate;
        this.dcBLoction = BL;
        this.dcNOH = noh;
        this.dcTotal = tot;
    }

    public int getId()
    {
        return dcID;
    }
    
    public String getdjCName()
    {
        return dcCName;
    }
    
    public String getdjName()
    {
        return dcName;
    }
    
    public String getBDate()
    {
        return dcBDate;
    }
    
    public String getBL()
    {
        return dcBLoction;
    }
    
    public int getnoh()
    {
        return dcNOH;
    }
    
    public int gettot()
    {
        return dcTotal;
    }    
            
    
}
