public class pause1
{
    //pauses specified chunks of code for given timeframe
    //difference from class pause is time frame for this is 750ms
    //typically used for printing out options to questions in class hatchet
        public void pause(){
        try
        {
            Thread.sleep(750);
        }
        catch(InterruptedException m)
        {
            ;
        }
    }
}