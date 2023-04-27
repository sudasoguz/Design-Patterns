package com.oguz.dp.structural.facade;

import java.io.File;

public class VideoConversionFacade {
  public File convertVideo(String fileName, String format) {
    System.out.println("VideoConversionFacade: conversion started.");
    VideoFile file = new VideoFile(fileName);
    Codec sourceCodec = CodecFactory.extract(file);
    Codec destinationCodec;
    if (format.equals("mp4")) {
      destinationCodec = new MPEG4CompressionCodec();
    }else {
      destinationCodec = new OggCompressionCodec();
    }
    VideoFile buffer = BiteReader.read(file,sourceCodec);
    VideoFile intermediateResult = BiteReader.convert(buffer, destinationCodec);
    AudioMixer audioMixer = new AudioMixer();
    File result = audioMixer.fix(intermediateResult);
    System.out.println("VideoConversionFacade: conversion completed.");
    return result;
  }
}
