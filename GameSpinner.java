public class GameSpinner 
{
    private int sector;
    private int spins;
    private int spinNum;
    private int spinResult;
    public GameSpinner(int sec){
        sector = sec;
    }
    public int spin(){
        int result= (int)((Math.random() * sector) + 1);
         System.out.println(result);
        if (spinNum == 0 || spinResult == result){
            spinNum++;
        }
            spinResult = result;
            return spinResult ;
        }
        public int currentRun(){
            return spinNum;
        }
    }