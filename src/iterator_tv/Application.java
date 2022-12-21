package iterator_tv;

import iterator_tv.Tv.Channel;

public class Application {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		for (Channel channel : tv) 
			System.out.println(channel);

	}

}
