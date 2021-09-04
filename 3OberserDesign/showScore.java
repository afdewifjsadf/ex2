public class showScore implements MyObserver{
    @Override
    public void update(Source o){
        System.out.println("live result: Thai "+ ((HeadQuater)o).getScoreThai() + "-" +((HeadQuater)o).getScoreUAE()+" UAE");
    }
    
}
