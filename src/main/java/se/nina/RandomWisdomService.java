package se.nina;

import java.util.Random;

public class RandomWisdomService implements WisdomService{

    private String[] wiseBook = {
            "programming is an art form that fights back",
            "deleted code is debugged code",
            "the strength of javascript is that you can do anything, the weakness is that you will",
            "give someone a program, you frustrate them for a day; teach them how to program, you frustrate them for a lifetime"
    };

    private Random myRandom = new Random();

    @Override
    public String getWisdom(){
        int index = myRandom.nextInt(wiseBook.length);
        String theWisdom = wiseBook[index];

        return theWisdom;
    }

}
