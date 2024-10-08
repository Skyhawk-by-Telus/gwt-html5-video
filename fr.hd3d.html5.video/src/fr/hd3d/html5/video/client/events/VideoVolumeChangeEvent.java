package fr.hd3d.html5.video.client.events;

import com.google.gwt.event.shared.GwtEvent;

import fr.hd3d.html5.video.client.handlers.VideoVolumeChangeHandler;


/**
 * Either the volume attribute or the muted attribute has changed. Fired after the relevant attribute's setter has
 * returned.
 * 
 * @author michael.guiral
 * 
 */
public class VideoVolumeChangeEvent extends GwtEvent<VideoVolumeChangeHandler> {
	private static final Type<VideoVolumeChangeHandler> TYPE = new Type<>();

	public static Type<VideoVolumeChangeHandler> getType() {
		return TYPE;
	}

	@Override
	protected void dispatch(VideoVolumeChangeHandler handler) {
		handler.onVolumeChange(this);
	}

	@Override
	public Type<VideoVolumeChangeHandler> getAssociatedType() {
		return TYPE;
	}
}
