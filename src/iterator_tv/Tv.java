package iterator_tv;

import java.util.Iterator;
import java.util.Random;

public class Tv implements Iterable<Tv.Channel>{

	final private Channel[] channels = new Channel[30];
	
	public Tv() {
		searchChannels();
	}
	
	private void searchChannels() {
		for (int i = 0; i < channels.length; i++)
			channels[i] = new Channel(i + 1);
	}

	@Override
	public Iterator<Channel> iterator() {
		return new ChannelIterator(channels);
	}
	
	public class Channel {
		
		final private int number;
		final private boolean signal = new Random().nextBoolean();

		public Channel(int number) {
			this.number = number;
		}
		
		@Override
		public String toString() {
			return String.format("%02d", number) + ": " + (signal ? "Ok!" : "No signal!");
		}
		
	}
	
	public class ChannelIterator implements Iterator<Channel> {
		
		private Channel[] channels;
		private int index = 0;
		
		public ChannelIterator(Channel[] channels) {
			this.channels = channels;
		}
		
		@Override
		public boolean hasNext() {
			return channels != null && index < channels.length;
		}

		@Override
		public Channel next() {
			return channels[index++];
		}
		
	}

}
