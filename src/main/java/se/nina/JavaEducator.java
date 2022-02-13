package se.nina;

public class JavaEducator implements Educator{

    private WisdomService wisdomService;

    public JavaEducator(WisdomService theWisdomService){
        wisdomService = theWisdomService;
    }

    @Override
    public String getClassOfTheDay(){
        return "Class of the day is Java!";
    }

    @Override
    public String getDailyWisdom(){
        return wisdomService.getWisdom();
    }
}
