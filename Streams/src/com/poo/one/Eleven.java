package com.poo.one;



	import java.util.ArrayList;
    import java.util.Comparator;
    import java.util.List;
	import java.util.stream.Collectors;
    import com.poo.streams.Trader;

	public class Eleven  {

		public static void main(String[] args) {
			List<Trader> list=new ArrayList<>();
			list.add(new Trader("pooja", "Banglore"));
			list.add(new Trader("sonu","Hyderabad"));
			list.add(new Trader("acchu", "Indore"));
			list.add(new Trader("sonchi", "Pune"));
			list.add(new Trader("dimple", "Indore"));
			list.add(new Trader("renu", "Bangalore"));
			list.add(new Trader("sahiti", "Pune"));
			list.add(new Trader("kavya", "Indore"));
			list.add(new Trader("raja", "Pune"));
			list.add(new Trader("shreyas", "Indore"));
			
			System.out.println("Traders names are:");
			List<Trader> names4=list.stream()
					.sorted(Comparator.comparing(Trader::getName))
					.collect(Collectors.toList());
			String S=names4.stream()
					.map(Trader::getName)
					.collect(Collectors.joining(", "));
			System.out.println(S);
						
}
}

