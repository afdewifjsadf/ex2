import java.util.ArrayList;


public class HeadQuater implements Source{
    private final ArrayList<MyObserver> list;
    private int ThaiS, UAES;

    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setSomeData(int ThaiS, int UAES) {
    this.ThaiS = ThaiS;
    this.UAES = UAES;
	notifyObservers();
    }

    public int getScoreThai() {
	return ThaiS;
    }
    public int getScoreUAE(){
    return UAES;
    }

    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
}
