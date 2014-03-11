package org.ffmpeg.avformat;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avcodec.AVPacket;
import org.ffmpeg.avcodec.AVCodecContext;
import org.ffmpeg.avcodec.AvcodecLibrary.AVDiscard;
import org.ffmpeg.avformat.AvformatLibrary.AVStreamParseType;
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.avutil.AVRational;
/**
 * Manuell korrigierte Bibliothek.
 */
@Library("avformat") 
public class AVStream extends StructObject {
	static {
		BridJ.register();
	}
	/** < stream index in AVFormatContext */
	@Field(0) 
	public int index() {
		return this.io.getIntField(this, 0);
	}
	/** < stream index in AVFormatContext */
	@Field(0) 
	public AVStream index(int index) {
		this.io.setIntField(this, 0, index);
		return this;
	}
	@Field(1) 
	public int id() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public AVStream id(int id) {
		this.io.setIntField(this, 1, id);
		return this;
	}
	/** C type : AVCodecContext* */
	@Field(2)
	public Pointer<AVCodecContext> codec() {
		return this.io.getPointerField(this, 2);
	}
	
	@Field(2)
	public AVStream codec(Pointer<AVCodecContext> codec) {
		this.io.setPointerField(this, 2, codec);
		return this;
	}
	
	/** C type : void* */
	@Field(3) 
	public Pointer<? > priv_data() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : void* */
	@Field(3) 
	public AVStream priv_data(Pointer<? > priv_data) {
		this.io.setPointerField(this, 3, priv_data);
		return this;
	}
	/** Conversion Error : AVFrac (failed to convert type to Java (undefined type)) */
	/** C type : AVRational */
	@Field(5) 
	public AVRational time_base() {
		return this.io.getNativeObjectField(this, 5);
	}
	/** C type : AVRational */
	@Field(5) 
	public AVStream time_base(AVRational time_base) {
		this.io.setNativeObjectField(this, 5, time_base);
		return this;
	}
	@Field(6) 
	public long start_time() {
		return this.io.getLongField(this, 6);
	}
	@Field(6) 
	public AVStream start_time(long start_time) {
		this.io.setLongField(this, 6, start_time);
		return this;
	}
	@Field(7) 
	public long duration() {
		return this.io.getLongField(this, 7);
	}
	@Field(7) 
	public AVStream duration(long duration) {
		this.io.setLongField(this, 7, duration);
		return this;
	}
	/** < number of frames in this stream if known or 0 */
	@Field(8) 
	public long nb_frames() {
		return this.io.getLongField(this, 8);
	}
	/** < number of frames in this stream if known or 0 */
	@Field(8) 
	public AVStream nb_frames(long nb_frames) {
		this.io.setLongField(this, 8, nb_frames);
		return this;
	}
	/** < AV_DISPOSITION_* bit field */
	@Field(9) 
	public int disposition() {
		return this.io.getIntField(this, 9);
	}
	/** < AV_DISPOSITION_* bit field */
	@Field(9) 
	public AVStream disposition(int disposition) {
		this.io.setIntField(this, 9, disposition);
		return this;
	}
	/**
	 * < Selects which packets can be discarded at will and do not need to be demuxed.<br>
	 * C type : AVDiscard
	 */
	@Field(10) 
	public IntValuedEnum<AVDiscard > discard() {
		return this.io.getEnumField(this, 10);
	}
	/**
	 * < Selects which packets can be discarded at will and do not need to be demuxed.<br>
	 * C type : AVDiscard
	 */
	@Field(10) 
	public AVStream discard(IntValuedEnum<AVDiscard > discard) {
		this.io.setEnumField(this, 10, discard);
		return this;
	}
	/** C type : AVRational */
	@Field(11) 
	public AVRational sample_aspect_ratio() {
		return this.io.getNativeObjectField(this, 11);
	}
	/** C type : AVRational */
	@Field(11) 
	public AVStream sample_aspect_ratio(AVRational sample_aspect_ratio) {
		this.io.setNativeObjectField(this, 11, sample_aspect_ratio);
		return this;
	}
	/** C type : AVDictionary* */
	@Field(12) 
	public Pointer<AVDictionary > metadata() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : AVDictionary* */
	@Field(12) 
	public AVStream metadata(Pointer<AVDictionary > metadata) {
		this.io.setPointerField(this, 12, metadata);
		return this;
	}
	/** C type : AVRational */
	@Field(13) 
	public AVRational avg_frame_rate() {
		return this.io.getNativeObjectField(this, 13);
	}
	/** C type : AVRational */
	@Field(13) 
	public AVStream avg_frame_rate(AVRational avg_frame_rate) {
		this.io.setNativeObjectField(this, 13, avg_frame_rate);
		return this;
	}
	/** C type : AVPacket */
	@Field(14) 
	public AVPacket attached_pic() {
		return this.io.getNativeObjectField(this, 14);
	}
	/** C type : AVPacket */
	@Field(14) 
	public AVStream attached_pic(AVPacket attached_pic) {
		this.io.setNativeObjectField(this, 14, attached_pic);
		return this;
	}
	/** C type : info_struct* */
	@Field(15) 
	public Pointer<AVStream.info_struct > info() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : info_struct* */
	@Field(15) 
	public AVStream info(Pointer<AVStream.info_struct > info) {
		this.io.setPointerField(this, 15, info);
		return this;
	}
	/** < number of bits in pts (used for wrapping control) */
	@Field(16) 
	public int pts_wrap_bits() {
		return this.io.getIntField(this, 16);
	}
	/** < number of bits in pts (used for wrapping control) */
	@Field(16) 
	public AVStream pts_wrap_bits(int pts_wrap_bits) {
		this.io.setIntField(this, 16, pts_wrap_bits);
		return this;
	}
	@Field(17) 
	public long reference_dts() {
		return this.io.getLongField(this, 17);
	}
	@Field(17) 
	public AVStream reference_dts(long reference_dts) {
		this.io.setLongField(this, 17, reference_dts);
		return this;
	}
	@Field(18) 
	public long first_dts() {
		return this.io.getLongField(this, 18);
	}
	@Field(18) 
	public AVStream first_dts(long first_dts) {
		this.io.setLongField(this, 18, first_dts);
		return this;
	}
	@Field(19) 
	public long cur_dts() {
		return this.io.getLongField(this, 19);
	}
	@Field(19) 
	public AVStream cur_dts(long cur_dts) {
		this.io.setLongField(this, 19, cur_dts);
		return this;
	}
	@Field(20) 
	public long last_IP_pts() {
		return this.io.getLongField(this, 20);
	}
	@Field(20) 
	public AVStream last_IP_pts(long last_IP_pts) {
		this.io.setLongField(this, 20, last_IP_pts);
		return this;
	}
	@Field(21) 
	public int last_IP_duration() {
		return this.io.getIntField(this, 21);
	}
	@Field(21) 
	public AVStream last_IP_duration(int last_IP_duration) {
		this.io.setIntField(this, 21, last_IP_duration);
		return this;
	}
	@Field(22) 
	public int probe_packets() {
		return this.io.getIntField(this, 22);
	}
	@Field(22) 
	public AVStream probe_packets(int probe_packets) {
		this.io.setIntField(this, 22, probe_packets);
		return this;
	}
	@Field(23) 
	public int codec_info_nb_frames() {
		return this.io.getIntField(this, 23);
	}
	@Field(23) 
	public AVStream codec_info_nb_frames(int codec_info_nb_frames) {
		this.io.setIntField(this, 23, codec_info_nb_frames);
		return this;
	}
	/** C type : AVStreamParseType */
	@Field(24) 
	public IntValuedEnum<AVStreamParseType > need_parsing() {
		return this.io.getEnumField(this, 24);
	}
	/** C type : AVStreamParseType */
	@Field(24) 
	public AVStream need_parsing(IntValuedEnum<AVStreamParseType > need_parsing) {
		this.io.setEnumField(this, 24, need_parsing);
		return this;
	}
	/** Conversion Error : AVCodecParserContext* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : AVPacketList* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : AVProbeData (failed to convert type to Java (undefined type)) */
	/** C type : int64_t[16 + 1] */
	@Array({16 + 1}) 
	@Field(28) 
	public Pointer<Long > pts_buffer() {
		return this.io.getPointerField(this, 28);
	}
	/** Conversion Error : AVIndexEntry* (failed to convert type to Java (undefined type)) */
	@Field(30) 
	public int nb_index_entries() {
		return this.io.getIntField(this, 30);
	}
	@Field(30) 
	public AVStream nb_index_entries(int nb_index_entries) {
		this.io.setIntField(this, 30, nb_index_entries);
		return this;
	}
	@Field(31) 
	public int index_entries_allocated_size() {
		return this.io.getIntField(this, 31);
	}
	@Field(31) 
	public AVStream index_entries_allocated_size(int index_entries_allocated_size) {
		this.io.setIntField(this, 31, index_entries_allocated_size);
		return this;
	}
	/** C type : AVRational */
	@Field(32) 
	public AVRational r_frame_rate() {
		return this.io.getNativeObjectField(this, 32);
	}
	/** C type : AVRational */
	@Field(32) 
	public AVStream r_frame_rate(AVRational r_frame_rate) {
		this.io.setNativeObjectField(this, 32, r_frame_rate);
		return this;
	}
	@Field(33) 
	public int stream_identifier() {
		return this.io.getIntField(this, 33);
	}
	@Field(33) 
	public AVStream stream_identifier(int stream_identifier) {
		this.io.setIntField(this, 33, stream_identifier);
		return this;
	}
	@Field(34) 
	public long interleaver_chunk_size() {
		return this.io.getLongField(this, 34);
	}
	@Field(34) 
	public AVStream interleaver_chunk_size(long interleaver_chunk_size) {
		this.io.setLongField(this, 34, interleaver_chunk_size);
		return this;
	}
	@Field(35) 
	public long interleaver_chunk_duration() {
		return this.io.getLongField(this, 35);
	}
	@Field(35) 
	public AVStream interleaver_chunk_duration(long interleaver_chunk_duration) {
		this.io.setLongField(this, 35, interleaver_chunk_duration);
		return this;
	}
	@Field(36) 
	public int request_probe() {
		return this.io.getIntField(this, 36);
	}
	@Field(36) 
	public AVStream request_probe(int request_probe) {
		this.io.setIntField(this, 36, request_probe);
		return this;
	}
	@Field(37) 
	public int skip_to_keyframe() {
		return this.io.getIntField(this, 37);
	}
	@Field(37) 
	public AVStream skip_to_keyframe(int skip_to_keyframe) {
		this.io.setIntField(this, 37, skip_to_keyframe);
		return this;
	}
	@Field(38) 
	public int skip_samples() {
		return this.io.getIntField(this, 38);
	}
	@Field(38) 
	public AVStream skip_samples(int skip_samples) {
		this.io.setIntField(this, 38, skip_samples);
		return this;
	}
	@Field(39) 
	public int nb_decoded_frames() {
		return this.io.getIntField(this, 39);
	}
	@Field(39) 
	public AVStream nb_decoded_frames(int nb_decoded_frames) {
		this.io.setIntField(this, 39, nb_decoded_frames);
		return this;
	}
	@Field(40) 
	public long mux_ts_offset() {
		return this.io.getLongField(this, 40);
	}
	@Field(40) 
	public AVStream mux_ts_offset(long mux_ts_offset) {
		this.io.setLongField(this, 40, mux_ts_offset);
		return this;
	}
	@Field(41) 
	public long pts_wrap_reference() {
		return this.io.getLongField(this, 41);
	}
	@Field(41) 
	public AVStream pts_wrap_reference(long pts_wrap_reference) {
		this.io.setLongField(this, 41, pts_wrap_reference);
		return this;
	}
	@Field(42) 
	public int pts_wrap_behavior() {
		return this.io.getIntField(this, 42);
	}
	@Field(42) 
	public AVStream pts_wrap_behavior(int pts_wrap_behavior) {
		this.io.setIntField(this, 42, pts_wrap_behavior);
		return this;
	}
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:140</i> */
	public static class info_struct extends StructObject {
		static {
			BridJ.register();
		}
		@Field(0) 
		public long last_dts() {
			return this.io.getLongField(this, 0);
		}
		@Field(0) 
		public info_struct last_dts(long last_dts) {
			this.io.setLongField(this, 0, last_dts);
			return this;
		}
		@Field(1) 
		public long duration_gcd() {
			return this.io.getLongField(this, 1);
		}
		@Field(1) 
		public info_struct duration_gcd(long duration_gcd) {
			this.io.setLongField(this, 1, duration_gcd);
			return this;
		}
		@Field(2) 
		public int duration_count() {
			return this.io.getIntField(this, 2);
		}
		@Field(2) 
		public info_struct duration_count(int duration_count) {
			this.io.setIntField(this, 2, duration_count);
			return this;
		}
		/** C type : double[2][(60 * 12 + 6)]* */
		@Field(3) 
		public Pointer<Pointer<Double > > duration_error() {
			return this.io.getPointerField(this, 3);
		}
		/** C type : double[2][(60 * 12 + 6)]* */
		@Field(3) 
		public info_struct duration_error(Pointer<Pointer<Double > > duration_error) {
			this.io.setPointerField(this, 3, duration_error);
			return this;
		}
		@Field(4) 
		public long codec_info_duration() {
			return this.io.getLongField(this, 4);
		}
		@Field(4) 
		public info_struct codec_info_duration(long codec_info_duration) {
			this.io.setLongField(this, 4, codec_info_duration);
			return this;
		}
		@Field(5) 
		public long codec_info_duration_fields() {
			return this.io.getLongField(this, 5);
		}
		@Field(5) 
		public info_struct codec_info_duration_fields(long codec_info_duration_fields) {
			this.io.setLongField(this, 5, codec_info_duration_fields);
			return this;
		}
		@Field(6) 
		public int found_decoder() {
			return this.io.getIntField(this, 6);
		}
		@Field(6) 
		public info_struct found_decoder(int found_decoder) {
			this.io.setIntField(this, 6, found_decoder);
			return this;
		}
		@Field(7) 
		public long last_duration() {
			return this.io.getLongField(this, 7);
		}
		@Field(7) 
		public info_struct last_duration(long last_duration) {
			this.io.setLongField(this, 7, last_duration);
			return this;
		}
		/** Those are used for average framerate estimation. */
		@Field(8) 
		public long fps_first_dts() {
			return this.io.getLongField(this, 8);
		}
		/** Those are used for average framerate estimation. */
		@Field(8) 
		public info_struct fps_first_dts(long fps_first_dts) {
			this.io.setLongField(this, 8, fps_first_dts);
			return this;
		}
		@Field(9) 
		public int fps_first_dts_idx() {
			return this.io.getIntField(this, 9);
		}
		@Field(9) 
		public info_struct fps_first_dts_idx(int fps_first_dts_idx) {
			this.io.setIntField(this, 9, fps_first_dts_idx);
			return this;
		}
		@Field(10) 
		public long fps_last_dts() {
			return this.io.getLongField(this, 10);
		}
		@Field(10) 
		public info_struct fps_last_dts(long fps_last_dts) {
			this.io.setLongField(this, 10, fps_last_dts);
			return this;
		}
		@Field(11) 
		public int fps_last_dts_idx() {
			return this.io.getIntField(this, 11);
		}
		@Field(11) 
		public info_struct fps_last_dts_idx(int fps_last_dts_idx) {
			this.io.setIntField(this, 11, fps_last_dts_idx);
			return this;
		}
		public info_struct() {
			super();
		}
		public info_struct(Pointer pointer) {
			super(pointer);
		}
	};
}
