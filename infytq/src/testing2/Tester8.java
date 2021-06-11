package testing2;

import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
		//Implement your logic here and change the return statement accordingly
     	 ArrayList<Double> marks=new ArrayList<Double>();
		for(Entry<String,Double>entry:studentMarks.entrySet()){
		    marks.add(entry.getValue());
		    }
		Object[]mark=marks.toArray();
		Arrays.sort(mark);
		int n=mark.length;
		Double max =(Double) mark[n-1];
		Double min =(Double) mark[0];
		Map<String, Double>maxMinScorers = new HashMap<String, Double>();
		for(Entry<String,Double> entry:studentMarks.entrySet()) {
			if((double)entry.getValue()==min) {
				maxMinScorers.put(entry.getKey(),entry.getValue());
			}
			if((double)entry.getValue()==max) {
				maxMinScorers.put(entry.getKey(),entry.getValue());
			}
		}
		
		return maxMinScorers;
	}

}

class Tester8 {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		studentMarks.put("raghava", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}