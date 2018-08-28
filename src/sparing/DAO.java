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

	public void finnUtgifter(String dato) {
		for (int i = 0; i < utgifter.size(); i++) {
			Utgift u = utgifter.get(i);
			if(u.getDato().equals(dato)) {
				System.out.println(u.toString());
			}
		}
		
	}
}
