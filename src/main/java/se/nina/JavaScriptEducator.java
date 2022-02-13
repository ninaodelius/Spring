package se.nina;

public class JavaScriptEducator implements Educator{

    private WisdomService wisdomService;

    public JavaScriptEducator(WisdomService theWisdomService){
        wisdomService = theWisdomService;
    }
    @Override
    public String getClassOfTheDay() {
        return "Class of the day is JavaScript!";
    }

    @Override
    public String getDailyWisdom(){
        return wisdomService.getWisdom();
    }
}
