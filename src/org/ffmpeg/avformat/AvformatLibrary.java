package org.ffmpeg.avformat;
import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Callback;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.ffmpeg.avcodec.AVCodec;
import org.ffmpeg.avcodec.AVPacket;
import org.ffmpeg.avcodec.AvcodecLibrary.AVCodecID;
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;
/**
 * Wrapper for library <b>avformat</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avformat") 
@Runtime(CRuntime.class) 
public class AvformatLibrary {
	static {
		BridJ.register();
	}
	/**
	 * enum values<br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:86</i>
	 */
	public enum AVStreamParseType implements IntValuedEnum<AVStreamParseType > {
		AVSTREAM_PARSE_NONE(0),
		/** < full parsing and repack */
		AVSTREAM_PARSE_FULL(1),
		/** < Only parse headers, do not repack. */
		AVSTREAM_PARSE_HEADERS(2),
		/** < full parsing and interpolation of timestamps for frames not starting on a packet boundary */
		AVSTREAM_PARSE_TIMESTAMPS(3),
		/** < full parsing and repack of the first frame only, only implemented for H.264 currently */
		AVSTREAM_PARSE_FULL_ONCE(4),
		/**
		 * < full parsing and repack with timestamp and position generation by parser for raw<br>
		 * this assumes that each packet in the file contains no demuxer level headers and<br>
		 * just codec level data, otherwise position generation would fail
		 */
		AVSTREAM_PARSE_FULL_RAW(((0) | (('R') << 8) | (('A') << 16) | ('W' << 24)));
		AVStreamParseType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVStreamParseType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVStreamParseType > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:169</i>
	 */
	public enum AVDurationEstimationMethod implements IntValuedEnum<AVDurationEstimationMethod > {
		/** < Duration accurately estimated from PTSes */
		AVFMT_DURATION_FROM_PTS(0),
		/** < Duration estimated from a stream with a known duration */
		AVFMT_DURATION_FROM_STREAM(1),
		/** < Duration estimated from bitrate (less accurate) */
		AVFMT_DURATION_FROM_BITRATE(2);
		AVDurationEstimationMethod(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVDurationEstimationMethod > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVDurationEstimationMethod > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_NOBUFFER = (int)0x0040;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h</i> */
	public static final int AVIO_FLAG_DIRECT = (int)0x8000;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_MP4A_LATM = (int)0x8000;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_DISCARD_CORRUPT = (int)0x0100;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/version.h</i> */
	public static final int LIBAVFORMAT_VERSION_MICRO = (int)104;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h</i> */
	public static final int AVIO_FLAG_READ = (int)1;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_NOPARSE = (int)0x0020;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_PRIV_OPT = (int)0x20000;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_NOFILLIN = (int)0x0010;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int FF_FDEBUG_TS = (int)0x0001;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h</i> */
	public static final int AVIO_FLAG_READ_WRITE = (int)(1 | 2);
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_GENPTS = (int)0x0001;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVSEEK_FLAG_FRAME = (int)8;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_FLUSH_PACKETS = (int)0x0200;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h</i> */
	public static final int AVIO_FLAG_WRITE = (int)2;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/version.h</i> */
	public static final int LIBAVFORMAT_VERSION_MINOR = (int)19;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVSEEK_FLAG_ANY = (int)4;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int RAW_PACKET_BUFFER_SIZE = (int)2500000;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int MAX_STD_TIMEBASES = (int)(60 * 12 + 6);
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_IGNIDX = (int)0x0002;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h</i> */
	public static final int AVIO_FLAG_NONBLOCK = (int)8;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_SORT_DTS = (int)0x10000;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/version.h</i> */
	public static final int LIBAVFORMAT_VERSION_MAJOR = (int)55;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVSEEK_FLAG_BYTE = (int)2;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_CUSTOM_IO = (int)0x0080;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVSEEK_FLAG_BACKWARD = (int)1;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_IGNDTS = (int)0x0008;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int MAX_PROBE_PACKETS = (int)2500;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_NONBLOCK = (int)0x0004;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_KEEP_SIDE_DATA = (int)0x40000;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int AVINDEX_KEYFRAME = (int)0x0001;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h</i> */
	public static final int MAX_REORDER_DELAY = (int)16;
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h:48</i> */
	public static abstract class avio_alloc_context_read_packet_callback extends Callback<avio_alloc_context_read_packet_callback > {
		public int apply(Pointer<? > opaque, Pointer<Byte > buf, int buf_size) {
			return apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size);
		}
		public int apply(@Ptr long opaque, @Ptr long buf, int buf_size) {
			return apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size);
		}
	};
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h:49</i> */
	public static abstract class avio_alloc_context_write_packet_callback extends Callback<avio_alloc_context_write_packet_callback > {
		public int apply(Pointer<? > opaque, Pointer<Byte > buf, int buf_size) {
			return apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size);
		}
		public int apply(@Ptr long opaque, @Ptr long buf, int buf_size) {
			return apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size);
		}
	};
	/** <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h:50</i> */
	public static abstract class avio_alloc_context_seek_callback extends Callback<avio_alloc_context_seek_callback > {
		public long apply(Pointer<? > opaque, long offset, int whence) {
			return apply(Pointer.getPeer(opaque), offset, whence);
		}
		public long apply(@Ptr long opaque, long offset, int whence) {
			return apply(Pointer.pointerToAddress(opaque), offset, whence);
		}
	};
	/**
	 * Original signature : <code>AVIOContext* avio_alloc_context(unsigned char*, int, int, void*, avio_alloc_context_read_packet_callback*, avio_alloc_context_write_packet_callback*, avio_alloc_context_seek_callback*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h:39</i>
	 */
	public Pointer<AVIOContext > avio_alloc_context(Pointer<Byte > buffer, int buffer_size, int write_flag, Pointer<? > opaque, Pointer<AvformatLibrary.avio_alloc_context_read_packet_callback > read_packet, Pointer<AvformatLibrary.avio_alloc_context_write_packet_callback > write_packet, Pointer<AvformatLibrary.avio_alloc_context_seek_callback > seek) {
		return Pointer.pointerToAddress(avio_alloc_context(Pointer.getPeer(buffer), buffer_size, write_flag, Pointer.getPeer(opaque), Pointer.getPeer(read_packet), Pointer.getPeer(write_packet), Pointer.getPeer(seek)), AVIOContext.class);
	}
	@Ptr 
	public native long avio_alloc_context(@Ptr long buffer, int buffer_size, int write_flag, @Ptr long opaque, @Ptr long read_packet, @Ptr long write_packet, @Ptr long seek);
	/**
	 * Original signature : <code>void avio_flush(AVIOContext*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h:41</i>
	 */
	public void avio_flush(Pointer<AVIOContext > s) {
		avio_flush(Pointer.getPeer(s));
	}
	public native void avio_flush(@Ptr long s);
	/**
	 * Original signature : <code>int avio_open(AVIOContext**, const char*, int)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h:43</i>
	 */
	public int avio_open(Pointer<Pointer<AVIOContext > > s, Pointer<Byte > url, int flags) {
		return avio_open(Pointer.getPeer(s), Pointer.getPeer(url), flags);
	}
	public native int avio_open(@Ptr long s, @Ptr long url, int flags);
	/**
	 * Original signature : <code>int avio_open2(AVIOContext**, const char*, int, const AVIOInterruptCB*, AVDictionary**)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h:45</i>
	 */
	public int avio_open2(Pointer<Pointer<AVIOContext > > s, Pointer<Byte > url, int flags, Pointer<AvformatLibrary.AVIOInterruptCB > int_cb, Pointer<Pointer<AVDictionary > > options) {
		return avio_open2(Pointer.getPeer(s), Pointer.getPeer(url), flags, Pointer.getPeer(int_cb), Pointer.getPeer(options));
	}
	public native int avio_open2(@Ptr long s, @Ptr long url, int flags, @Ptr long int_cb, @Ptr long options);
	/**
	 * Original signature : <code>int avio_close(AVIOContext*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avio.h:47</i>
	 */
	public int avio_close(Pointer<AVIOContext > s) {
		return avio_close(Pointer.getPeer(s));
	}
	public native int avio_close(@Ptr long s);
	/**
	 * Original signature : <code>void av_register_all()</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:246</i>
	 */
	public native void av_register_all();
	/**
	 * Original signature : <code>int avformat_version()</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:248</i>
	 */
	public native int avformat_version();
	/**
	 * Original signature : <code>AVFormatContext* avformat_alloc_context()</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:250</i>
	 */
	public Pointer<AVFormatContext > alloc_context() {
		return Pointer.pointerToAddress(avformat_alloc_context(), AVFormatContext.class);
	}
	@Ptr 
	public native long avformat_alloc_context();
	/**
	 * Original signature : <code>void avformat_free_context(AVFormatContext*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:252</i>
	 */
	public void avformat_free_context(Pointer<AVFormatContext > s) {
		avformat_free_context(Pointer.getPeer(s));
	}
	public native void avformat_free_context(@Ptr long s);
	/**
	 * Original signature : <code>AVStream* avformat_new_stream(AVFormatContext*, const AVCodec*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:254</i>
	 */
	public Pointer<AVStream > avformat_new_stream(Pointer<AVFormatContext > s, Pointer<AVCodec > c) {
		return Pointer.pointerToAddress(avformat_new_stream(Pointer.getPeer(s), Pointer.getPeer(c)), AVStream.class);
	}
	@Ptr 
	public native long avformat_new_stream(@Ptr long s, @Ptr long c);
	/**
	 * Original signature : <code>int avformat_alloc_output_context2(AVFormatContext**, AVOutputFormat*, const char*, const char*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:256</i>
	 */
	public int avformat_alloc_output_context2(Pointer<Pointer<AVFormatContext > > ctx, Pointer<AVOutputFormat > oformat, Pointer<Byte > format_name, Pointer<Byte > filename) {
		return avformat_alloc_output_context2(Pointer.getPeer(ctx), Pointer.getPeer(oformat), Pointer.getPeer(format_name), Pointer.getPeer(filename));
	}
	public native int avformat_alloc_output_context2(@Ptr long ctx, @Ptr long oformat, @Ptr long format_name, @Ptr long filename);
	/**
	 * Original signature : <code>int avformat_open_input(AVFormatContext**, const char*, AVInputFormat*, AVDictionary**)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:258</i>
	 */
	public int avformat_open_input(Pointer<Pointer<AVFormatContext > > ps, Pointer<Byte > filename, Pointer<AVInputFormat > fmt, Pointer<Pointer<AVDictionary > > options) {
		return avformat_open_input(Pointer.getPeer(ps), Pointer.getPeer(filename), Pointer.getPeer(fmt), Pointer.getPeer(options));
	}
	public native int avformat_open_input(@Ptr long ps, @Ptr long filename, @Ptr long fmt, @Ptr long options);
	/**
	 * Original signature : <code>int av_read_frame(AVFormatContext*, AVPacket*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:260</i>
	 */
	public int av_read_frame(Pointer<AVFormatContext > s, Pointer<AVPacket > pkt) {
		return av_read_frame(Pointer.getPeer(s), Pointer.getPeer(pkt));
	}
	public native int av_read_frame(@Ptr long s, @Ptr long pkt);
	/**
	 * Original signature : <code>int av_seek_frame(AVFormatContext*, int, int64_t, int)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:262</i>
	 */
	public int av_seek_frame(Pointer<AVFormatContext > s, int stream_index, long timestamp, int flags) {
		return av_seek_frame(Pointer.getPeer(s), stream_index, timestamp, flags);
	}
	public native int av_seek_frame(@Ptr long s, int stream_index, long timestamp, int flags);
	/**
	 * Original signature : <code>int avformat_seek_file(AVFormatContext*, int, int64_t, int64_t, int64_t, int)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:264</i>
	 */
	public int avformat_seek_file(Pointer<AVFormatContext > s, int stream_index, long min_ts, long ts, long max_ts, int flags) {
		return avformat_seek_file(Pointer.getPeer(s), stream_index, min_ts, ts, max_ts, flags);
	}
	public native int avformat_seek_file(@Ptr long s, int stream_index, long min_ts, long ts, long max_ts, int flags);
	/**
	 * Original signature : <code>void avformat_close_input(AVFormatContext**)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:266</i>
	 */
	public void avformat_close_input(Pointer<Pointer<AVFormatContext > > s) {
		avformat_close_input(Pointer.getPeer(s));
	}
	public native void avformat_close_input(@Ptr long s);
	/**
	 * Original signature : <code>int avformat_write_header(AVFormatContext*, AVDictionary**)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:268</i>
	 */
	public int avformat_write_header(Pointer<AVFormatContext > s, Pointer<Pointer<AVDictionary > > options) {
		return avformat_write_header(Pointer.getPeer(s), Pointer.getPeer(options));
	}
	public native int avformat_write_header(@Ptr long s, @Ptr long options);
	/**
	 * Original signature : <code>int av_write_frame(AVFormatContext*, AVPacket*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:270</i>
	 */
	public int av_write_frame(Pointer<AVFormatContext > s, Pointer<AVPacket > pkt) {
		return av_write_frame(Pointer.getPeer(s), Pointer.getPeer(pkt));
	}
	public native int av_write_frame(@Ptr long s, @Ptr long pkt);
	/**
	 * Original signature : <code>int av_interleaved_write_frame(AVFormatContext*, AVPacket*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:272</i>
	 */
	public int av_interleaved_write_frame(Pointer<AVFormatContext > s, Pointer<AVPacket > pkt) {
		return av_interleaved_write_frame(Pointer.getPeer(s), Pointer.getPeer(pkt));
	}
	public native int av_interleaved_write_frame(@Ptr long s, @Ptr long pkt);
	/**
	 * Original signature : <code>int av_write_trailer(AVFormatContext*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:274</i>
	 */
	public int av_write_trailer(Pointer<AVFormatContext > s) {
		return av_write_trailer(Pointer.getPeer(s));
	}
	public native int av_write_trailer(@Ptr long s);
	/**
	 * Original signature : <code>AVOutputFormat* av_guess_format(const char*, const char*, const char*)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:276</i>
	 */
	public Pointer<AVOutputFormat > av_guess_format(Pointer<Byte > short_name, Pointer<Byte > filename, Pointer<Byte > mime_type) {
		return Pointer.pointerToAddress(av_guess_format(Pointer.getPeer(short_name), Pointer.getPeer(filename), Pointer.getPeer(mime_type)), AVOutputFormat.class);
	}
	@Ptr 
	public native long av_guess_format(@Ptr long short_name, @Ptr long filename, @Ptr long mime_type);
	/**
	 * Original signature : <code>AVCodecID av_guess_codec(AVOutputFormat*, const char*, const char*, const char*, AVMediaType)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:278</i>
	 */
	public IntValuedEnum<AVCodecID > av_guess_codec(Pointer<AVOutputFormat > fmt, Pointer<Byte > short_name, Pointer<Byte > filename, Pointer<Byte > mime_type, IntValuedEnum<AVMediaType > type) {
		return FlagSet.fromValue(av_guess_codec(Pointer.getPeer(fmt), Pointer.getPeer(short_name), Pointer.getPeer(filename), Pointer.getPeer(mime_type), (int)type.value()), AVCodecID.class);
	}
	public native int av_guess_codec(@Ptr long fmt, @Ptr long short_name, @Ptr long filename, @Ptr long mime_type, int type);
	/**
	 * Original signature : <code>int av_find_best_stream(AVFormatContext*, AVMediaType, int, int, AVCodec**, int)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:280</i>
	 */
	public int av_find_best_stream(Pointer<AVFormatContext > ic, IntValuedEnum<AVMediaType > type, int wanted_stream_nb, int related_stream, Pointer<Pointer<AVCodec > > decoder_ret, int flags) {
		return av_find_best_stream(Pointer.getPeer(ic), (int)type.value(), wanted_stream_nb, related_stream, Pointer.getPeer(decoder_ret), flags);
	}
	public native int av_find_best_stream(@Ptr long ic, int type, int wanted_stream_nb, int related_stream, @Ptr long decoder_ret, int flags);
	/**
	 * Original signature : <code>char* av_get_media_type_string(AVMediaType)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:282</i>
	 */
	public Pointer<Byte > av_get_media_type_string(IntValuedEnum<AVMediaType > media_type) {
		return Pointer.pointerToAddress(av_get_media_type_string((int)media_type.value()), Byte.class);
	}
	@Ptr 
	public native long av_get_media_type_string(int media_type);
	/**
	 * Original signature : <code>int avformat_find_stream_info(AVFormatContext*, AVDictionary**)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:284</i>
	 */
	public int avformat_find_stream_info(Pointer<AVFormatContext > ic, Pointer<Pointer<AVDictionary > > options) {
		return avformat_find_stream_info(Pointer.getPeer(ic), Pointer.getPeer(options));
	}
	public native int avformat_find_stream_info(@Ptr long ic, @Ptr long options);
	/**
	 * Original signature : <code>void av_dump_format(AVFormatContext*, int, const char*, int)</code><br>
	 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavformat/avformat.h:286</i>
	 */
	public void av_dump_format(Pointer<AVFormatContext > ic, int index, Pointer<Byte > url, int is_output) {
		av_dump_format(Pointer.getPeer(ic), index, Pointer.getPeer(url), is_output);
	}
	public native void av_dump_format(@Ptr long ic, int index, @Ptr long url, int is_output);
	/** Undefined type */
	public static interface AVProgram {
		
	};
	/** Undefined type */
	public static interface AVCodecTag {
		
	};
	/** Undefined type */
	public static interface AVChapter {
		
	};
	/** Undefined type */
	public static interface AVIOInterruptCB {
		
	};
}
