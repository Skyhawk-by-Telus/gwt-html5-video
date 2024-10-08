package fr.hd3d.html5.video.client;

public class VideoSource {
	public enum VideoType {
		MP4 {
			@Override
			public String getType() {
				return MP4_VIDEO_TYPE;
			}
		},
		THREE_GPP {
			@Override
			public String getType() {
				return THREE_GPP_VIDEO_TYPE;
			}
		},
		OGG {
			@Override
			public String getType() {
				return OGG_VIDEO_TYPE;
			}
		},
		MKV {
			@Override
			public String getType() {
				return MKV_VIDEO_TYPE;
			}
		},
		WEBM {
			@Override
			public String getType() {
				return WEBM_VIDEO_TYPE;
			}
		};

		public abstract String getType();

		public static VideoType getByType(String type) {
			for (VideoType videoType : VideoType.values()) {
				if (videoType.getType().equalsIgnoreCase(type)) {
					return videoType;
				}
			}
			return null;
		}
	}

	private static final String MP4_VIDEO_TYPE = "video/mp4";
	private static final String THREE_GPP_VIDEO_TYPE = "video/3gpp";
	private static final String OGG_VIDEO_TYPE = "video/ogg";
	private static final String MKV_VIDEO_TYPE = "video/x-matroska";
	private static final String WEBM_VIDEO_TYPE = "video/webm";
	private VideoType videoType;
	private String src;

	/**
	 * @param src
	 *            <b>the address</b> of the media resource (video, audio) to show
	 * @param videoType
	 *            {@link VideoType} that represent the type of the media resource
	 */
	public VideoSource(String src, VideoType videoType) {
		this.src = src;
		this.videoType = videoType;
	}

	/**
	 * @param src
	 *            <b>the address</b> of the media resource (video, audio) to show
	 */
	public VideoSource(String src) {
		super();
		this.src = src;
	}

	/**
	 * @return {@link VideoType} that represent the type of the media resource
	 */
	public VideoType getVideoType() {
		return videoType;
	}

	/**
	 * @return <b>the address</b> of the media resource (video, audio) to show
	 */
	public String getSrc() {
		return src;
	}

	public static VideoType getByType(String type) {
		for (VideoType videoType : VideoType.values()) {
			if (videoType.getType().equalsIgnoreCase(type)) {
				return videoType;
			}
		}
		return null;
	}
}
