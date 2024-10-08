package fr.hd3d.html5.video.client.events;

import com.google.gwt.event.shared.GwtEvent;

import fr.hd3d.html5.video.client.handlers.VideoPlayingHandler;


/**
 * Playback has started.
 * 
 * @author michael.guiral
 * 
 */
public class VideoPlayingEvent extends GwtEvent<VideoPlayingHandler> {
	private static final Type<VideoPlayingHandler> TYPE = new Type<>();

	public static Type<VideoPlayingHandler> getType() {
		return TYPE;
	}

	@Override
	protected void dispatch(VideoPlayingHandler handler) {
		handler.onPlaying(this);
	}

	@Override
	public Type<VideoPlayingHandler> getAssociatedType() {
		return TYPE;
	}
}
