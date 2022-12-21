package iterator2_tv;

import java.nio.channels.Channels;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import iterator2_tv.Tv.Channel;

public class Application {

	public static void main(String[] args) {

		Tv tv = new Tv();
		
		Stream<Channel> stream = StreamSupport.stream(tv.spliterator(), false);
		List<Channel> onlineChannels = stream.filter(channel -> channel.getSignal()).toList();
		
		onlineChannels.forEach(System.out::println);
	}

}
