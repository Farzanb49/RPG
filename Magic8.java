public class Magic8
{
    public static void main (String args [])
    {
        new Magic8 ();
    }
    
    public Magic8 ()
    {
        String ques = IBIO.inputString ("Ask the magic 8 ball if the animal will eat him: ");
        //generates random number and outputs response based on number generated using if/elseif/else loops
        int num = (int) (Math.random () * 16) + 1;
        if (num == 1)
            System.out.println ("outlook not so good");
        else if (num == 2)
            System.out.println ("don't count on it");
        else if (num == 3)
            System.out.println ("my sources say no");
        else if (num == 4)
            System.out.println ("very doubtful");
        else if (num == 5)
            System.out.println ("without a doubt");
        else if (num == 6)
            System.out.println ("reply hazy, try again");
        else if (num == 7)
            System.out.println ("it is certain");
        else if (num == 8)
            System.out.println ("my reply is no");
        else if (num == 9)
            System.out.println ("as I see it yes");
            else 
            System.out.println ("yes definitely");
    }
}