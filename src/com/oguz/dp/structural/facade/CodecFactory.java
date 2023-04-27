package com.oguz.dp.structural.facade;

public class CodecFactory {

  public static Codec extract(VideoFile videoFile) {
    String fileType = videoFile.getCodecType();
    if (fileType == "mp4") {
      System.out.println("CodecFactory: extracting mpeg audio...");
      return new MPEG4CompressionCodec();
    } else {
      System.out.println("CodecFactory: extracting ogg audio...");
      return new OggCompressionCodec();
    }
  }
}
