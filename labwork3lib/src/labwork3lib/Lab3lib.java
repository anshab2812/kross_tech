package labwork3lib;

import java.util.Collections;
import java.util.List;

public class Lab3lib {

	public int DynRange(List<Integer> list) {
		int max = Collections.max(list);
		int min = Collections.min(list);
		int result = max-min;
		return result;
	}
	
	public int Energy(List<Integer> list)
	{
		int result=0;
		for (int i: list) {
			result += i*i;
		}
		return result;
	}
	
	public double AvgPower (List<Integer> list) 
	{
		double result=0;
		for (int i: list) {
			result += i*i;
		}
		return result/list.size();
	}
	
	public double AvgSamples (List<Integer> list)
	{
		double result = 0;
		for (int i: list) {
			result += i;
		}
		return result/list.size();
	}
	
	public double Dispersion(List<Integer> list)
	{
		double m = AvgSamples(list);
		double result = 0;
		for (int i: list) {
			result+=(i-m)*(i-m);
		}
		return result/list.size();
	}
	
	public double AutoCorrel(List<Integer> list, int t)
	{
		double m = AvgSamples(list);
		double result = 0;
		if (t<0) t=-t;
		for (int i=0; i<list.size()-t;i++) {
			result += (list.get(i+t)-m)*(list.get(i)-m);
		}
		return result/(list.size()-t);
	}
	
	public double CorrelInterval(List<Integer> list)
	{
		double resultop = 0;
		double resultbot = AutoCorrel(list, 0);
		for (int i=0;i<list.size();i++) {
			resultop += AutoCorrel(list, i);
		}
		return resultop/resultbot;
	}
}
