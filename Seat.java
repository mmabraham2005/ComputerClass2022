public class Seat

{

    private boolean available;

    private int tier;

    public Seat(boolean isAvailable, int tierNum)
    {
        available = isAvailable;
        tier = tierNum;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public int getTier()
    {  
        return tier;
    }

    public void setAvailability(boolean isAvail)
    {  
        available = isAvail;  
    }

}