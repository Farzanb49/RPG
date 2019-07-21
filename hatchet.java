/**
 * Brian Robeson is travelling to visit his father, who is divorced and lives away from his 
 * mother. Robeson is on a plane ride alone with only the pilot flying the plane. Suddenly 
 * the pilot has a heart attack and Brian presumes he is dead. Now the 13 year old is left to 
 * fly the plane on his own. Of course, as if things could not get any worse, the engine stops
 * working. Now a 13 year old is basically trapped alone inside a crashing plane. Well, 
 * Brian somehow crash lands the plane in the water, get out barely harmed, and make it to 
 * shore before going unconscious. Soon he wakes up to find himself stranded alone in the 
 * wilderness. He spends months on his own adapting to the wilderness, fighting for his own 
 * survival each day. The RPG game will take you through his journey and put you in his shoes.
 * You will have to make some tough decisions. In a world where it is survival for the fittest,
 * how far will you proceed on your own?
 * Are you smart enough to survive just like Brian did?
 * By Farzan Bhuiyan
 * April 12, 2019
 */
public class hatchet
{
    //global int variable that keeps track of survival points earned throughout the game
    int points = 0;
    //calls pause class and allows its code to run on this class
    pause pauseObject = new pause ();
    //same purpose as above function
    pause1 pause1Object = new pause1 ();
    public static void main (String args [])
    {
        new hatchet ();
    }

    public hatchet ()
    {
        //loop the game while the user prompts the game to continue
        char continu = 'y';
        while (continu == 'y'){
            points = 0;
            System.out.println ("Welcome. This is the survival journey of a 13 year old.");
            pauseObject.pause();
            System.out.println ("Brian Robeson is travelling to visit his father, who is divorced and lives away from"); 
            pauseObject.pause();
            System.out.println ("his mother. Robeson is on a plane ride alone with only the pilot flying the plane."); 
            pauseObject.pause();
            System.out.println ("Suddenly the pilot has a heart attack and Brian presumes he is dead. Now the 13 year");
            pauseObject.pause();
            System.out.println ("old is left to fly the plane on his own. Of course, as if things could not get any"); 
            pauseObject.pause();
            System.out.println ("worse, the engine stops working. Brian is able to somehow"); 
            pauseObject.pause();
            System.out.println ("crash land the plane in the water, get out barely harmed, and make it to shore before"); 
            pauseObject.pause();
            System.out.println ("going unconscious. Soon he wakes up to find himself stranded alone in the wilderness.");
            pauseObject.pause();
            System.out.println ("He spends months on his own adapting to the wilderness, fighting for his own survival"); 
            pauseObject.pause();
            System.out.println ("each day."); 
            pauseObject.pause();
            System.out.println ("\n in the text-based rpg, you will make some of the tough decisions that Brian had");
            pauseObject.pause();
            System.out.println ("to make in his quest for survival. Will you be able to survive just as Brian did?");
            pauseObject.pause();
            System.out.println ("For every right answer you make, 5 survival points get added each time.");
            pauseObject.pause();
            System.out.println ("To win you must get 70 survival points");
            pauseObject.pause();
            System.out.println ("The more points you win, the better you have performed on the game");
            pauseObject.pause();
            System.out.println ("Let's see how many survival points you can get!");
            pauseObject.pause();
            char start = IBIO.inputChar ("Ready to begin? (y/n) ");
            //output based on user reponse to whether they want to play the game or not
            if (start == 'y'){
                //prompts user to guess what the password is. A correct guess allows them to continue
                String password = IBIO.inputString ("Enter password here (hint: this line tells you literally what to do): ");
                if (password == password){
                    //this points function will frequently pop up throughout the program
                    //for each correct response, the user gains 5 survival points each time
                    points = points+5;
                    System.out.println ("You have " +points+ " survival points.");
                    pauseObject.pause();
                    System.out.println ("Before we go any further, let us test if you truly are worthy to play a game that is \"survival for the fittest\"");
                    int gcf = IBIO.inputInt ("What is the GCF of 16 and 64?");
                    //calls the GCF method
                    System.out.print (GCF (16, 64));
                    if (gcf == 16){
                        points = points+5;
                        System.out.println (" That is correct! You have " + points + " survival points.");
                    }
                    else {
                        System.out.println (" That is fine, you can still play, but you don't get the extra 5 survival points");
                    }

                    System.out.println ("\n Let's begin");
                    pauseObject.pause();
                    System.out.println ("Brian is on a plane to visit his father");
                    pauseObject.pause();
                    System.out.println ("             __  _ ");
                    System.out.println ("| `/ |");
                    System.out.println (" |__`!");
                    System.out.println (" / ,' `-.__________________");
                    System.out.println ("'-'|_____                LI`-.");
                    System.out.println ("   <____()-=O=O=O=O=O=[]====--)");
                    System.out.println ("     `.___ ,-----,_______...-'");
                    System.out.println ("          /    .'");
                    System.out.println ("         /   .'");
                    System.out.println ("        /  .'       ");  
                    System.out.println ("        `-'");
                    pauseObject.pause();
                    System.out.println ("He is the only passenger on the flight with the pilot. The pilot’s a nice guy and teaches Brian some fundamentals of flying a");
                    pauseObject.pause();
                    System.out.println ("plane, and even lets him play around with some of the controls. Suddenly, the pilot starts acting off. Next thing you know he");
                    pauseObject.pause();
                    System.out.println ("spasms and gets a heart attack. Brian attempt to give CPR but it does not seem to be working. He has three emergency options.");
                    pauseObject.pause();
                    multiplechoice1 ();
                    System.out.println (" .----------------.  .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .----------------.  .----------------."); 
                    System.out.println (" | .--------------. || .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. |");
                    System.out.println (" | |    ______    | || |      __      | || | ____    ____ | || |  _________   | | | |     ____     | || | ____   ____  | || |  _________   | || |  _______     | |");
                    System.out.println (" | |  .' ___  |   | || |     /  \\     | || ||_   \\  /   _|| || | |_   ___  |  | | | |   .'    `.   | || ||_  _| |_  _| | || | |_   ___  |  | || | |_   __ \\    | |");
                    System.out.println (" | | / .'   \\_|   | || |    / /\\ \\    | || |  |   \\/   |  | || |   | |_  \\_|  | | | |  /  .--.  \\  | || |  \\ \\   / /   | || |   | |_  \\_|  | || |   | |__) |   | |");
                    System.out.println (" | | \\ |    ____  | || |   / ____ \\   | || |  | |\\  /| |  | || |   |  _|  _   | | | |  | |    | |  | || |   \\ \\ / /    | || |   |  _|  _   | || |   |  __ /    | |");
                    System.out.println (" | | | `.___]  _| | || | _/ /    \\ \\_ | || | _| |_\\/_| |_ | || |  _| |___/ |  | | | |  \\  `--'  /  | || |    \\ ' /     | || |  _| |___/ |  | || |  _| |  \\ \\_  | |");
                    System.out.println (" | |  `._____.'   | || ||____|  |____|| || ||_____||_____|| || | |_________|  | | | |   `.____.'   | || |     \\_/      | || | |_________|  | || | |____| |___| | |");
                    System.out.println (" | |              | || |              | || |              | || |              | | | |              | || |              | || |              | || |              | |");
                    System.out.println (" | '--------------' || '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' |");
                    System.out.println ("  '----------------'  '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------'"); 

                }
                else{
                    System.out.println (" .----------------.  .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .----------------.  .----------------."); 
                    System.out.println (" | .--------------. || .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. |");
                    System.out.println (" | |    ______    | || |      __      | || | ____    ____ | || |  _________   | | | |     ____     | || | ____   ____  | || |  _________   | || |  _______     | |");
                    System.out.println (" | |  .' ___  |   | || |     /  \\     | || ||_   \\  /   _|| || | |_   ___  |  | | | |   .'    `.   | || ||_  _| |_  _| | || | |_   ___  |  | || | |_   __ \\    | |");
                    System.out.println (" | | / .'   \\_|   | || |    / /\\ \\    | || |  |   \\/   |  | || |   | |_  \\_|  | | | |  /  .--.  \\  | || |  \\ \\   / /   | || |   | |_  \\_|  | || |   | |__) |   | |");
                    System.out.println (" | | \\ |    ____  | || |   / ____ \\   | || |  | |\\  /| |  | || |   |  _|  _   | | | |  | |    | |  | || |   \\ \\ / /    | || |   |  _|  _   | || |   |  __ /    | |");
                    System.out.println (" | | | `.___]  _| | || | _/ /    \\ \\_ | || | _| |_\\/_| |_ | || |  _| |___/ |  | | | |  \\  `--'  /  | || |    \\ ' /     | || |  _| |___/ |  | || |  _| |  \\ \\_  | |");
                    System.out.println (" | |  `._____.'   | || ||____|  |____|| || ||_____||_____|| || | |_________|  | | | |   `.____.'   | || |     \\_/      | || | |_________|  | || | |____| |___| | |");
                    System.out.println (" | |              | || |              | || |              | || |              | | | |              | || |              | || |              | || |              | |");
                    System.out.println (" | '--------------' || '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' |");
                    System.out.println ("  '----------------'  '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------'"); 
                }
            }

            else {
                System.out.println (" .----------------.  .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .----------------.  .----------------."); 
                System.out.println (" | .--------------. || .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. |");
                System.out.println (" | |    ______    | || |      __      | || | ____    ____ | || |  _________   | | | |     ____     | || | ____   ____  | || |  _________   | || |  _______     | |");
                System.out.println (" | |  .' ___  |   | || |     /  \\     | || ||_   \\  /   _|| || | |_   ___  |  | | | |   .'    `.   | || ||_  _| |_  _| | || | |_   ___  |  | || | |_   __ \\    | |");
                System.out.println (" | | / .'   \\_|   | || |    / /\\ \\    | || |  |   \\/   |  | || |   | |_  \\_|  | | | |  /  .--.  \\  | || |  \\ \\   / /   | || |   | |_  \\_|  | || |   | |__) |   | |");
                System.out.println (" | | \\ |    ____  | || |   / ____ \\   | || |  | |\\  /| |  | || |   |  _|  _   | | | |  | |    | |  | || |   \\ \\ / /    | || |   |  _|  _   | || |   |  __ /    | |");
                System.out.println (" | | | `.___]  _| | || | _/ /    \\ \\_ | || | _| |_\\/_| |_ | || |  _| |___/ |  | | | |  \\  `--'  /  | || |    \\ ' /     | || |  _| |___/ |  | || |  _| |  \\ \\_  | |");
                System.out.println (" | |  `._____.'   | || ||____|  |____|| || ||_____||_____|| || | |_________|  | | | |   `.____.'   | || |     \\_/      | || | |_________|  | || | |____| |___| | |");
                System.out.println (" | |              | || |              | || |              | || |              | | | |              | || |              | || |              | || |              | |");
                System.out.println (" | '--------------' || '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' |");
                System.out.println ("  '----------------'  '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------'"); 
            }
            continu = IBIO.inputChar ("Would you like to play again? (y/n): ");
            //outputs total points user scored while playing one round of the game
            System.out.println ("You scored " +points+ " total survival points");
        }
    }
//method with the task to evaluate GCF of given int x and int y parameter values. 
//In this case, parameters are 16 and 64
    public int GCF (int x, int y)
    {
        if (y < x)
        {
            int temp = x;
            x = y;
            y = temp;
        }

        while (x > 1 && y%x != 0)
            x--;
        return x;
    }
//method that calls Magic8 ball class and runs the program on this code as well as continue program afterwards
    public void Magic8 ()
    {
        System.out.println ("     ,dP9CGG88@b,");
        System.out.println ("  ,IP  _   Y888@@b,");
        System.out.println (" dIi  (_)   G8888@b");
        System.out.println ("dCII  (_)   G8888@@b");
        System.out.println ("GCCIi     ,GG8888@@@");
        System.out.println ("GGCCCCCCCGGG88888@@@");
        System.out.println ("GGGGCCCGGGG88888@@@@...");
        System.out.println ("Y8GGGGGG8888888@@@@P.....");
        System.out.println (" Y88888888888@@@@@P......");
        System.out.println (" `Y8888888@@@@@@@P'......");
        System.out.println ("    `@@@@@@@@@P'.......");
        System.out.println("        \"\"\"\"........");
        pauseObject.pause();
        System.out.println ("He’s got a magic 8 ball and decides to ask:");
        //call class Magic8
        Magic8 object = new Magic8 ();
        pauseObject.pause();
        System.out.println (" He tries to drive it away by throwing his hatchet at it, but he misses and the hatchet hits the rock wall,"); 
        System.out.println ("shooting off sparks. The creature stabs his leg and leaves. It was a porcupine, and Brian finds its quills in his leg,"); 
        System.out.println ("which is now in pain. He spends a lot of time pulling them out.");
        pauseObject.pause();
        System.out.println (" .|||||||||.");
        System.out.println ("  |||||||||||||");        
        System.out.println (" |||||||||||' .\"");      
        System.out.println (" `||||||||||_,__o");
        pauseObject.pause();
        System.out.println (" Brian learns to build fire using sparks he makes with his hatchet."); 
        pauseObject.pause();
        System.out.println ("   (                 ,&&&.");
        System.out.println ("             )                .,.&&");
        System.out.println ("            (  (              |__/");
        System.out.println ("                )             ,'-'.");
        System.out.println ("          (    (  ,,      _.__|/ /|");
        System.out.println ("           ) /| -((------((_|___/ |");
        System.out.println ("         (  // | (`'      ((  `'--|");
        System.out.println ("       _ -.;_/ \\--._      \\ |-._/.");
        System.out.println ("      (_;-// | | |-'.|    <_,|_|`--'|");
        System.out.println ("      ( `.__ _  ___,')      <_,-'__,'");
        System.out.println ("       `'(_ )_)(_)_)'");
        pauseObject.pause();
        System.out.println (" That night, after he gets his fire going, he hears something sliding across the sand outside. He goes outside to find  *enter animal name here* eggs");
        pauseObject.pause();
        System.out.println ("  ,-\"\"\"\"-.     ,'\"`.\"");
        System.out.println ("  /        `.  /     \"");
        System.out.println (" |           );       :");
        System.out.println ("  |        ,' :       ;");
        System.out.println ("   `-....-'    `.___,'");
        mathproblem ();
    }
//,method for first multiple choice question
    public void multiplechoice1()
    {
        String a = "continue giving CPR";      
        String b = "instantly take control of the plane and try landing it in the closest area possible";        
        String c = "contact radio for help";
        System.out.println ("(a)" + a);
        pauseObject.pause();
        System.out.println ("(b)" + b);
        pauseObject.pause();
        System.out.println ("(c)" + c);
        char choice = IBIO.inputChar ("select a choice (a, b, or c): ");
        //if else loop based on user response from question above that determines whether game will end or continue
        if (choice == 'a'){
            pauseObject.pause();
            System.out.println ("pilot does not stand chance of survival with just CPR. He is dead. Brian used up too much time trying to save him and the"); 
            pauseObject.pause();
            System.out.println ("plane has crashed.");

        }
        else if (choice == 'b'){
            pauseObject.pause();
            System.out.println("________            _______");
            System.out.println("         /\\ \\ \\ \\/_______/     ______/\\      \\  /\\ \\/ /\\ \\/ /\\  \\_____________"); 
            System.out.println("        /\\ \\ \\ \\/______ /     /\\    /:\\\\      \\ ::\\  /::\\  /::\\ /____  ____ __"); 
            System.out.println("      /\\ \\ \\ \\/_______/     /:\\\\  /:\\:\\\\______\\::/  \\::/  \\::///   / /   //"); 
            System.out.println("      /\\ \\ \\ \\/_______/    _/____\\/:\\:\\:/_____ / / /\\ \\/ /\\ \\///___/ /___//___"); 
            System.out.println("_____/___ \\ \\/_______/    /\\::::::\\\\:\\:/_____ / \\ /::\\  /::\\ /____  ____  ____"); 
            System.out.println("         \\ \\/_______/    /:\\\\::::::\\\\:/_____ /   \\\\::/  \\::///   / /   / /   /"); 
            System.out.println("          \\/_______/    /:\\:\\\\______\\/______/_____\\\\/ /\\ \\///___/ /___/ /_____"); 
            System.out.println("\\          \\______/    /:\\:\\:/_____:/\\      \\ ___ /  /::\\ /____  ____  _/\\::::"); 
            System.out.println("\\__________\\____/    /:\\:\\:/_____:/:\\\\      \\__ /_______/____/_/___/_ /  \\:::"); 
            System.out.println("//__________/___/   _/____:/_____:/:\\:\\\\______\\ /                    /\\  /\\::"); 
            System.out.println("///\\          \\/   /\\ .----.\\___:/:\\:\\:/_____ // \\                   /  \\/  \\:"); 
            System.out.println("///\\          \\  /::\\\\ \\_\\ \\\\_:/:\\:\\:/_____ //:\\ \\                 /\\  /\\  /\\"); 
            System.out.println("//:/\\          \\//\\::\\\\ \\ \\ \\\\/:\\:\\:/_____ //:::\\ \\               /  \\/  \\/+/"); 
            System.out.println("/:/:/\\_________/:\\/:::\\`----' \\\\:\\:/_____ //o:/\\:\\ \\_____________/\\  /\\  / /"); 
            System.out.println(":/:/://________//\\::/\\::\\_______\\\\:/_____ ///\\_\\ \\:\\/____________/  \\/  \\/+/\\"); 
            System.out.println("/:/:///_/_/_/_/:\\/::\\ \\:/__  __ /:/_____ ///\\//\\\\/:/ _____  ____/\\  /\\  / /  \\"); 
            System.out.println(":/:///_/_/_/_//\\::/\\:\\///_/ /_//:/______/_/ :~\\/::/ /____/ /___/  \\/  \\/+/\\  /"); 
            System.out.println("/:///_/_/_/_/:\\/::\\ \\:/__  __ /:/____/\\  / \\\\:\\/:/ _____  ____/\\  /\\  / /  \\/"); 
            System.out.println(":///_/_/_/_//\\::/\\:\\///_/ /_//:/____/\\:\\____\\\\::/ /____/ /___/  \\/  \\/+/\\  /\\"); 
            System.out.println("///_/_/_/_/:\\/::\\ \\:/__  __ /:/____/\\:\\/____/\\\\/____________/\\  /\\  / /  \\/  \\"); 
            System.out.println("//_/_/_/_//\\::/\\:\\///_/ /_//::::::/\\:\\/____/  /----/----/--/  \\/  \\/+/\\  /\\  /"); 
            System.out.println("/_/_/_/_/:\\/::\\ \\:/__  __ /\\:::::/\\:\\/____/ \\/____/____/__/\\  /\\  / /  \\/  \\/_"); 
            System.out.println("_/_/_/_//\\::/\\:\\///_/ /_//\\:\\::::\\:\\/____/ \\_____________/  \\/  \\/+/\\  /\\  /"); 
            System.out.println("/_/_/_/:\\/::\\ \\:/__  __ /\\:\\:\\::::\\/____/   \\ _ _ _ _ _ /\\  /\\  / /  \\/  \\/___"); 
            System.out.println("_/_/_//\\::/\\:\\///_/ /_//\\:\\:\\:\\              \\_________/  \\/  \\/+/\\  /\\  /   /"); 
            System.out.println("/_/_/:\\/::\\ \\:/__  __ /\\:\\:\\:\\:\\______________\\       /\\  /\\  / /  \\/  \\/___/_"); 
            System.out.println("_/_//\\::/\\:\\///_/ /_//::\\:\\:\\:\\/______________/      /  \\/  \\/+/\\  /\\  /   /"); 
            System.out.println("/_/:\\/::\\ \\:/__  __ /::::\\:\\:\\/______________/\\     /\\  /\\  / /  \\/  \\/___/___"); 
            System.out.println("_//\\::/\\:\\///_/ /_//:\\::::\\:\\/______________/  \\   /  \\/  \\/+/\\  /\\  /   /   /"); 
            System.out.println("/:\\/::\\ \\:/__  __ /:\\:\\::::\\/______________/    \\ /\\  /\\  / /  \\/  \\/___/___/"); 
            System.out.println("/\\::/\\:\\///_/ /_//:\\:\\:\\                         \\  \\/\\\\\\/+/\\  /\\  /   /   /+/"); 
            System.out.println("\\/::\\ \\:/__  __ /:\\:\\:\\:\\_________________________\\ ///\\\\/  \\/  \\/___/___/ /_"); 
            System.out.println("::/\\:\\///_/ /_//:\\:\\:\\:\\/_________________________////::\\\\\\  /\\  /   /   /+/"); 
            System.out.println("::\\ \\:/__  __ /:\\:\\:\\:\\/_________________________/:\\/____\\\\\\/  \\/___/___/ /___"); 
            System.out.println("/\\:\\///_/ /_//:\\:\\:\\:\\/_________________________/:::\\    /\\/\\  /   /   /+/   /"); 
            System.out.println("\\ \\:/__  __ /:\\:\\:\\:\\/_________________________/:::::\\  ///  \\/___/___/ /___/_"); 
            System.out.println(":\\///_/ /_//:\\:\\:\\:\\/_________________________/:\\:::::\\///\\  /   /  __________"); 
            System.out.println("\\:/__  __ /:\\:\\:\\:\\/_________________________/:::\\:::::\\/  \\/___/__/\\"); 
            System.out.println("///_/ /_//:\\:\\:\\:\\/_________________________/:\\:::\\:::::\\  /   /  /::\\"); 
            System.out.println("/__  __ /\\::\\:\\:\\/_________________________/_____::\\:::::\\/___/__/:/\\:\\"); 
            System.out.println("/_/ /_//::\\::\\:\\/_____________________/\\/_/_/_/_/\\  \\           /::\\ \\:\\"); 
            System.out.println("_  __ /:\\::\\:8\\/_____________________/\\/\\   /\\_\\/\\  \\ 8       /:/\\:\\ \\:\\"); 
            System.out.println("/ /_//\\     \\|______________________//\\\\/\\::\\/__\\\\/\\  \\|______/::\\ \\:\\ \\:\\"); 
            System.out.println(" __ /  \\  \\                        /:\\/:\\/\\_______\\/\\        /:/\\:\\ \\:\\/::\\"); 
            System.out.println("/_//    8      -8  --  --  --  -- //\\::/\\\\/_/_/_/_/_/ --  --/::\\ \\:\\ \\::/\\:\\"); 
            System.out.println("_ /     |\\  \\   |________________/:\\/::\\///__/ /__//_______/:/\\:\\ \\:\\/::\\ \\:\\"); 
            System.out.println("__________\\     \\               //\\::/\\:/___  ___ /       /::\\ \\:\\ \\::/\\:\\ \\:\\"); 
            System.out.println("::::::::::\\  \\  \\             /:\\/::\\///__/ /__//       /:/\\:\\ \\:\\/::\\ \\:\\ \\:"); 
            pauseObject.pause();
            System.out.println ("closest area ends up being a city. \nYou crash into a building killing yourself and many in the area.");
            pauseObject.pause();
        }
        else{
            points = points+5;
            System.out.println ("You have " +points + " survival points");
            pauseObject.pause();
            System.out.println ("Good choice! Let's continue with Brian's adventure");
            pauseObject.pause();           
            System.out.println ("Brian contacts the radio and calls for help. He does not get a chance to talk for long, only being able to mention that there"); 
            pauseObject.pause();
            System.out.println ("is no one else to fly the plane. Then the connection broke. Brian kept trying to call but to no avail could he make successful contact."); 
            pauseObject.pause();
            System.out.println ("He realizes he will have to land the plane on his own. Does Brian land the plane successfully?");
            pauseObject.pause();
            multiplechoice2 ();
        }
    }
//method for second multiple choice question in program, asks a yes or no question
    public void multiplechoice2 ()
    {
        System.out.println ("a) no");
        pauseObject.pause();
        System.out.println ("b) yes");
        char choice1 = IBIO.inputChar ("select a choice (a or b): ");
        if (choice1 == 'a'){
            pauseObject.pause();
            System.out.println ("Great job. You killed Brian!"); 
            pauseObject.pause();
            System.out.println ("plane has crashed.");

        }
        else if (choice1 == 'b'){
            points = points+5;
            System.out.println ("You have " +points + " survival points");
            pauseObject.pause();
            System.out.println ("Let's continue");
            pauseObject.pause();
            System.out.println ("Well, not long after, the plane engine stops. Luck really is not on Brian’s side."); 
            pauseObject.pause();
            System.out.println ("Brian does the best he can to guide the plane. He sees a lake below and aims the gliding plane");
            pauseObject.pause();
            System.out.println ("toward it, thinking it might do less damage. He slams into some trees, wrecking the plane, which"); 
            pauseObject.pause();
            System.out.println ("lands in the lake. Brian tears himself out of the seatbelt, scrambles out of the plane, and");
            pauseObject.pause();
            System.out.println ("swims for the surface. He reaches the shore and passes out.");
            pauseObject.pause();
            System.out.println ("Later, he wakes up on the shore of the lake. He's alone in the wilderness. Mosquitos swarm all");
            pauseObject.pause();
            System.out.println ("over him. As he grows hungry, he realizes he will have to take care of himself. He inventories");
            pauseObject.pause();
            System.out.println ("his possessions and then remembers his English teacher Perpich's advice to stay motivated and have");
            pauseObject.pause();
            System.out.println ("faith in one's own abilities. He decides to start by looking for and building shelter."); 
            pauseObject.pause();
            fillinblank2 ();

        }
    }
//method that runs the first fill in the blank task, 
//it says fillinblanks2, but it is meant to be the first fill in the blank task
    public void fillinblank2 ()
    {
        pauseObject.pause();
        System.out.println ("Brian thinks about what kind of shelter is best.");
        pauseObject.pause();
        System.out.println ("Options to fill blank with: ");
        pauseObject.pause();
        System.out.println ("cocoon");
        pauseObject.pause();
        System.out.println ("fallen tree");
        pauseObject.pause();
        System.out.println ("lean-to");
        pauseObject.pause();
        System.out.println ("A-frame");
        //Asks for user input for filling in the blank
        String fillBlank = IBIO.inputString ("Fill in the blank: Brian decides to build a ___________ shelter.");
        //Case insensitive check
        fillBlank.toLowerCase();
        if (fillBlank.equals("lean-to"))
        {
            points = points+5;
            System.out.println ("You have " +points + " survival points");
            pauseObject.pause();
            System.out.println ("Yessir! That's what he decides to build, it is the most feasible after all!");
            pauseObject.pause();
            System.out.println ("finding some berry bushes. What do they do with the berry bushes?");
            pauseObject.pause();
            System.out.println ("_____#####_____");
            System.out.println ("_____########___"); 
            System.out.println ("______###___######"); 
            System.out.println ("_______###_____####"); 
            System.out.println ("_________####______#"); 
            System.out.println ("___________#########"); 
            System.out.println ("____________########"); 
            System.out.println ("_________________####"); 
            System.out.println ("________________#__#"); 
            System.out.println ("_______________##___##"); 
            System.out.println ("______________#_______#"); 
            System.out.println ("_____________ #_________##"); 
            System.out.println ("____________ ##___________#"); 
            System.out.println ("____________##_____________##"); 
            System.out.println ("__________###__________##########"); 
            System.out.println ("____###########____##___####_###"); 
            System.out.println ("___##____#######___#__#####__####"); 
            System.out.println ("__##____##### ###__###_##_##_####"); 
            System.out.println ("__#_____#########__#############"); 
            System.out.println ("__###############__##########"); 
            System.out.println ("____#############___#########"); 
            System.out.println ("_____##########____");
            pauseObject.pause();
            System.out.println (" a) eat it instantly and get sick");
            pauseObject.pause();
            System.out.println (" b) go home, research if it is edible, and eat accordingly");
            pauseObject.pause();
            multiplechoice3();
        }
        //If the answer is incorrect, they will get to try again 
        else 
        {
            pauseObject.pause();
            System.out.println ("\nNot quite, try again.");
            pauseObject.pause();
            fillBlank = IBIO.inputString ("\nFill in the blank: ");
        }

    }
//method where user prompted to fill in blank with whatever character/string they want. No incorrect answers
    public void fillintheblank ()
    {
        pauseObject.pause();
        String animal = IBIO.inputString ("Enter animal name here: ");
        pauseObject.pause();
        System.out.println ("As he eats he sees a " + animal + ", but the animal does not attack him. That night something crawls into a shelter with him, but he can't tell what it is because it's dark.");
        pauseObject.pause();
        System.out.println ("Brian wonders what are the chances the " + animal + " will eat him?"); 
        pauseObject.pause();
        Magic8 ();
    }
//method that asks a math question to user
    public void mathproblem ()
    {
        pauseObject.pause();
        System.out.println ("If Brian counts 147 eggs and wants to separate them between 4 months, how much a day can Brian eat?");
        double dailyfood = (147/4)/30;
        double input = IBIO.inputDouble ("Enter daily egg amount here: ");
        if (input == 1.225){
            points = points+5;
            System.out.println ("You have " +points + " survival points");
            pauseObject.pause();
            System.out.println ("NOW you’re thinking like a survivor ;).");
            pauseObject.pause();
            System.out.println ("Weeks pass and Brian embraces the \"new\" person he has become. He adapts and uses his environment to create tools he needs. He realizes early on he needs to hunt. But he needs a weapon"); 
            pauseObject.pause();
            System.out.println ("to do so. What weapon should Brian construct?");
            pauseObject.pause();
            multiplechoice4 ();
        }
        else if (input > 1.225){
            pauseObject.pause();
            System.out.println ("Careful, you’re going to run out of eggs sooner than you can think");
        }
        else{
            pauseObject.pause();
            System.out.println ("That’s too little food!! Are you trying to starve yourself??");

        }
    }
//method that runs the code for 3th multiple choice question. 
//Asks user 3th multiple choice question and gives output based on user response using if/else statements
    public void multiplechoice3 ()
    {
        char choice = IBIO.inputChar ("a or b: ");
        if (choice == 'b'){
            pauseObject.pause();
            System.out.println ("He can't go home you goof he's stranded on an island!");

        }
        if (choice == 'a'){
            points = points+5;
            System.out.println ("You have " +points + " survival points");
            pauseObject.pause();
            System.out.println ("Brian wakes up terribly sick from the berries. He goes looking for better");
            pauseObject.pause();
            System.out.println ("food and finds some raspberries, eating them more methodically so he won't get sick again.");
            pauseObject.pause();
            System.out.println ("As he eats he sees a _______________, but the animal does not attack him."); 
            pauseObject.pause();
            System.out.println ("That night something crawls into a shelter with him, but he can't tell what it is because it's dark.");
            pauseObject.pause();
            System.out.println ("Brian wonders what are the chances the ________________ will eat him?"); 
            pauseObject.pause();
            fillintheblank ();
        }
    }
//method that runs the code for 4th multiple choice question. 
//Asks user 4th multiple choice question and gives output based on user response using if/else statements
    public void multiplechoice4 ()
    {
        pauseObject.pause();
        System.out.println ("a) Rock knife");
        pauseObject.pause();
        System.out.println ("b) bow and arrow");
        pauseObject.pause();
        System.out.println ("c) weighted clubs"); 
        pauseObject.pause();
        char weapon = IBIO.inputChar ("Select a weapon (a, b, or c): ");
        if (weapon == 'a'){
            pauseObject.pause();
            System.out.println ("whoops, he is unable to make a rock knife");
        }
        else if (weapon == 'c'){
            pauseObject.pause();
            System.out.println ("whoops, can’t make that either, haha");
        }
        else {
            points = points+5;
            System.out.println ("You have " +points + " survival points");
            pauseObject.pause();
            System.out.println ("4$$-.");                               
            System.out.println ("4   .");                                        
            System.out.println ("4    ^.");                                       
            System.out.println ("4      $");                                       
            System.out.println ("4      'b");                                      
            System.out.println ("4      ''b.");                                    
            System.out.println ("4        $");                                    
            System.out.println ("4        $r");                                   
            System.out.println ("4        $F");                                   
            System.out.println ("-$b========4========$b====*P=-");                           
            System.out.println ("4       *$$F");                                  
            System.out.println ("4        $$");                                  
            System.out.println ("4       .$F");                                   
            System.out.println ("4       dP");                                    
            System.out.println ("4      F");                                      
            System.out.println ("4     @");                                       
            System.out.println ("4    .");                                        
            System.out.println ("J.");                                            
            System.out.println ("'$$     '");
            pauseObject.pause();
            System.out.println ("Yay! Brian can make a bow and arrow to get meat. Well, now he needs to be able to cook it over a fire. Luckily, he’s got a fire set up for him. He needs more food sources however. Should he catch fish?");
            pauseObject.pause();
            System.out.println ("||    | | | | | | |      __");   
            System.out.println ("|  |    | | | | | | |   | O~-_");
            System.out.println ("|   >----|-|-|-|-|-|-|--|  __/");
            System.out.println ("|  |    | | | | | | |   |__\""); 
            System.out.println ("||    | | | | | | |");
            pauseObject.pause();
            multiplechoice5 ();
        }
    }
//method that runs the code for 5th multiple choice question. 
//Asks user 5th multiple choice question and gives output based on user response using if/else statements
    public void multiplechoice5 ()
    {
        pauseObject.pause();
        System.out.println ("a) yes");
        pauseObject.pause();
        System.out.println ("b) no");
        pauseObject.pause();
        char yorn2 = IBIO.inputChar ("select an option (a or b, y or n): ");
        //or boolean statement to indicate both responses will be accepted with the same output
        if (yorn2 == 'b' || yorn2 == 'n'){
            pauseObject.pause();
            System.out.println ("Why would you not want him to get more food supplies!? He will lack resources for food and ultimately dies.");
        }
        else {
            points = points+5;
            System.out.println ("You have " +points + " survival points");
            pauseObject.pause();
            System.out.println ("Good choice!");
            pauseObject.pause();
            System.out.println ("                   _..._ ___");
            System.out.println ("     .:::::::.  `\"-._.-''.");
            System.out.println (",   /:::::::::\\     ':    \\\"                     _._");
            System.out.println ("\\:-::::::::::::\\     :.    |     /|.-'         /:::\\");
            System.out.println (" \\::::::::\\:::::|    ':     |   |  /           |:::|");
            System.out.println ("  `:::::::|:::::\\     ':    |   `\\ |    __     |\\::/\\");
            System.out.println ("    `-:::-|::::::|    ':    |  .`\\ .\\_.'  `.__/      |");
            System.out.println ("          |::::::\\    ':.   |   \\ ';:: /.-._   ,    /");
            System.out.println ("          |:::::::|    :.   /   ,`\\;:: \\'./0)  |_.-/");
            System.out.println ("          ;:::::::|    ':  |    \\.`;::.   ``   |  |");
            System.out.println ("           \\::::::/    :'  /     _\\::::'      /  /");
            System.out.println ("            \\::::|   :'   /    ,=:;::/           |");
            System.out.println ("             \\:::|   :'  |    (='` //        /   |");
            System.out.println ("              \\::\\   `:  /     '--' |       /\\   |");
            System.out.println ("               \\:::.  `:_|.-\"\"\"-.    \\__.-'/::\\  |");
            System.out.println ("               '::::.:::...:::. '.       /:::|  |");
            System.out.println ("                 '::/::::::::::::. '-.__.:::::|  |");
            System.out.println ("                   |::::::::::::\\::..../::::::| /");
            System.out.println ("                   |:::::::::::::|::::/::::::://");
            System.out.println ("                   \\:::::::::::::|'::/::::::::/");
            System.out.println ("                   /\\::::::::::::/  /:::::::/:|");
            System.out.println ("                  |::';:::::::::/   |::::::/::;");
            System.out.println ("                  |:::/`-:::::;;-._ |:::::/::/");
            System.out.println ("                  |:::|  `-::::\\   `|::::/::/");
            System.out.println ("                    |:::|     \\:::\\   \\:::/::/");
            System.out.println ("                 /:::/       \\:::\\   \\:/\\:/");
            System.out.println ("                (_::/         \\:::;__ \\_\\___");
            System.out.println ("                (_:/           \\::):):)\\:::):):)");
            System.out.println ("                 `\"             `\\\"\"\"\"`  `\"\"\"\"\"\"`");
            pauseObject.pause();
            System.out.println ("One night a skunk enters his shelter, and when it sprays him it blinds for a while.");
            pauseObject.pause();
            System.out.println ("What should Brian do?");
            pauseObject.pause();
            System.out.println (" a) Nothing! His resources are limited, no time to worry about skunks!");
            pauseObject.pause();
            System.out.println (" b) Take a nice long bath in the lake");
            pauseObject.pause();
            System.out.println (" c) Wash his eyes out");
            pauseObject.pause();
            multiplechoice6 ();
        }
    }
//method that runs the code for 6th multiple choice question. 
//Asks user 6th multiple choice question and gives output based on user response using if/else statements
    public void multiplechoice6 ()
    {
        char brian = IBIO.inputChar ("Select an option (a,b,or c): ");
        if (brian == 'a'){
            pauseObject.pause();
            System.out.println ("The man's blind!! how in the world is he supposed to do anything if he is blind??!!"); 
            pauseObject.pause();
            System.out.println ("If you really insist, fine let him work blind");
            pauseObject.pause();
            System.out.println ("*As Brian cannot see, he tries finding support but falls on a twig sticking out and it protrudes through his chest. Brian is dead. MAYBE NEXT TIME HE SHOULD WASH HIS EYES OUT.");
        }
        else if (brian == 'b'){
            pauseObject.pause();
            System.out.println ("As Brian takes his precious time washing himself in the lake, he feels a tug on his leg, and looks down to see red everywhere. A shark jumps out and continues to bite him in the head."); 
            pauseObject.pause();
            System.out.println ("Brian is dead. Yes, quite anticlimactic and gruesome but a lesson learnt; do NOT take so much time swimming in a lake.");
        }
        else{
            points = points+5;
            System.out.println ("You have " +points + " survival points");
            pauseObject.pause();
            System.out.println ("This is quick, efficient, and Brian is cleared of his blind vision and can clearly see. He is able to perform functions necessary to continue working for his survival");
            pauseObject.pause();
            System.out.println ("One day when Brian is hunting, a moose attacks him. It charges him, slams him with its head, and throws him in the lake. When he tries to escape, it attacks again, driving him underwater.");
            System.out.println ("It wounds his ribs, and he can really barely make it back to the shelter. Just as he arrives, another disaster strikes as a tornado hits. It tears his shelter apart and scatters his possessions. What should he do?");
            pauseObject.pause();
            System.out.println (".      //");
            System.out.println ("/) | ||    //");                            
            System.out.println ("VK                             (\\|  || |)u|   |F     /)");
            System.out.println ("|```.FF  |  |  |J   .'/");
            System.out.println ("__  `.  `|   |  `-'J .'.'");
            System.out.println ("______           __.--'  `-. |_ J    >.   `'.'   .");
            System.out.println ("_.-'      \"\"`-------'           `-.`.`. / )>.  /.' .<'");
            System.out.println (".'                                   `-._>--' )| `--''");
            System.out.println ("F .                                          ('.--'");
            System.out.println ("(_/                                            '\"");
            System.out.println ("|                                             'o`.");
            System.out.println ("||                                                `.");
            System.out.println ("J |          |              /      |                \"");
            System.out.println ("L |                       J       (             .  |");
            System.out.println ("J  |      .               F        _.--'`._  /`. |_)");
            System.out.println ("F  `.    |                       /        \"\"   \"\'");
            System.out.println ("F   /|   |_          ___|   `-_.'");
            System.out.println ("/   /  F  J `--.___.-'   F  - /");
            System.out.println ("/    F  |   L            J    /|");
            System.out.println ("(_   F   |   L            F  .'||");
            System.out.println ("L  F    |   |           |  /J  |");
            System.out.println ("| J     `.  |           | J  | |");              
            System.out.println ("|_|______ |  L          | F__|_|___.---------'");
            System.out.println ("--'        `-`--`--.___.-'-'---");
            pauseObject.pause();
            System.out.println ("a) try getting off the island on his own and search for civilization on his own");
            pause1Object.pause();
            System.out.println ("b) Just kill himself. Survival is hopeless");
            pause1Object.pause();
            System.out.println ("c) Keep staying strong and continue to seek resources to rebuild shelter");
            pause1Object.pause();
            multiplechoice7 ();
        }
    }
//method that runs the code for 7th multiple choice question. 
//Asks user 7th multiple choice question and gives output based on user response using if/else statements
    public void multiplechoice7 ()
    {
        pauseObject.pause();
        char moose = IBIO.inputChar ("Select an option (a,b, or c): ");
        if (moose == 'a'){
            pauseObject.pause();
            System.out.println ("Brian builds a wooden raft and sets afloat. The beginning of the journey is peaceful but soon after large currents arise. Brian does NOT have the most durable raft you would want in this situation."); 
            pauseObject.pause();
            System.out.println ("As the currents rise, large waves come towards him. Not long after, Brian and the raft are washed away by the waves. Sad, I know, but that is why you do not head off on a raft on your own, ESPECIALLY IF YOU ARE 13 YEARS OLD.");
        }
        else if (moose == 'b'){
            pauseObject.pause();
            System.out.println ("Brian shoots the bow and arrow at himself. He is dead. RIP.");
        }
        else {
            points = points+5;
            System.out.println ("You have " +points + " survival points");
            pauseObject.pause();
            System.out.println ("After overcoming such treacherous obstacles, and successfully rebuilding shelter, Brian realizes the impacts of such tragic events have reduced Brian’s supply significantly. Nearly running out after having");
            pauseObject.pause();
            System.out.println ("been on the island for well over a month, Brian needs supplies. He remembers that there is a survival kit in the plane. Should Brian go out to the broken plane, deserted on the lake, and retrieve the survivor kit?");
            pauseObject.pause();
            System.out.println (" a) yes");
            pauseObject.pause();
            System.out.println (" b) no");
            multiplechoice8 ();
        }
    }
//method that runs the code for 8th multiple choice question. 
//Asks user 8th multiple choice question and gives output based on user response using if/else statements
    public void multiplechoice8 ()
    {
        pauseObject.pause();
        char yorn = IBIO.inputChar("Select an option (a or b, or y or n): ");
        if (yorn == 'a' || yorn == 'y'){
            points = points+5;
            System.out.println ("You have " +points + " survival points");
            pauseObject.pause();
            System.out.println ("He builds a raft and goes out to the plane. At first he can't get in and is very frustrated. But when he slams his fist on the plane he realizes how thin its metal covering is."); 
            pauseObject.pause();
            System.out.println ("He starts chopping a hole in the side of the plane with his hatchet, but accidentally drops the hatchet."); 
            pauseObject.pause();
            System.out.println ("It sinks to the bottom of the lake. He has to dive repeatedly into the murky lake bottom to recover his hatchet, but he succeeds. When he gets it back, he uses the hatchet to make"); 
            pauseObject.pause();
            System.out.println ("the opening in the plane wall wider and goes inside. He finds the survival pack! He pulls the"); 
            pauseObject.pause();
            System.out.println ("survival pack to the top of the water and slowly drags it home. It's heavy and he's tired, so he takes several hours to haul it back to his shelter.");
            pauseObject.pause();
            System.out.println ("When he opens the survival pack the next day, he finds tools, weapons, clothing, and a large supply of food. He realizes this changes everything, making survival in the woods much easier."); 
            pauseObject.pause();
            System.out.println ("He also finds an emergency transmitter. Should he try to turn it on?");
            pauseObject.pause();
            System.out.println ("a) yes, it could possible work and he could be rescued");
            pauseObject.pause();
            System.out.println ("b) nope, being rescued is hopeless");
            pauseObject.pause();
            char transmitter = IBIO.inputChar ("Select an option (a or b): ");
            if (transmitter == 'a'){
                points = points+5;
                System.out.println ("You have " +points + " survival points");
                pauseObject.pause();
                System.out.println ("He tries to turn it on, but it doesn't do anything, which makes him think it was broken in the plane crash. He makes himself a good dinner from the freeze-dried food, but while he's eating it he hears a plane. The transmitter has worked. The pilot of a small plane heard it"); 
                pauseObject.pause();
                System.out.println ("and came to investigate. Once the man arrives, he recognizes Brian from the rescue broadcasts about him. Brian has lived at the lake for 54 days. He has finally been successfully rescued. Hurrah!"); 
                pauseObject.pause();
                System.out.println ("THE END");
            }
            else {
                pauseObject.pause();
                System.out.println ("Brian has no chance of survival without the survivor’s kit. He needs it. You can choose to go back to the storyline before selecting if Brian should go after the survivors kit, or you can restart the game.");
                pauseObject.pause();
                System.out.println (" Brian will stay stranded on the island, with no chance of survival. He dies after a while. RIP.");
            }
        }
    }
}

