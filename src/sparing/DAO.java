package sparing;

import java.util.ArrayList;

public class DAO<T> {
	private ArrayList<Utgift> utgifter;
	
	
	public ArrayList<Utgift> getUtgifter() {
		return utgifter;
	}

	public DAO() {
		utgifter = new ArrayList<Utgift>();
	}
	
	public void lagreNyUtgift(Utgift utgift) {
		utgifter.add(utgift);
	}
}
