package fr.hd3d.html5.video.client.events;

import com.google.gwt.event.shared.GwtEvent;

import fr.hd3d.html5.video.client.handlers.VideoLoadMetadataHandler;


/**
 * The user agent has just determined the duration and dimensions of the media resource
 * 
 * @author michael.guiral
 * 
 */
public class VideoLoadMetadataEvent extends GwtEvent<VideoLoadMetadataHandler> {
	private static final Type<VideoLoadMetadataHandler> TYPE = new Type<>();

	public static Type<VideoLoadMetadataHandler> getType() {
		return TYPE;
	}

	@Override
	protected void dispatch(VideoLoadMetadataHandler handler) {
		handler.onMetadataLoaded(this);
	}

	@Override
	public Type<VideoLoadMetadataHandler> getAssociatedType() {
		return TYPE;
	}
}
