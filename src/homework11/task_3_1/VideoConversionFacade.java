package homework11.task_3_1;


public class VideoConversionFacade {
    public VideoFile convert(VideoFile videoFile, Codec codec) {
        String filename = videoFile.getName();

        Codec videoFileCodec = CodecFactory.extract(videoFile);
        Buffer videoBuffer = BitrateReader.read(videoFile, videoFileCodec);
        Buffer audioBuffer = videoFile.getAudioBuffer();

        VideoFile newVideoFile = BitrateReader.convert(videoBuffer, filename, codec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(newVideoFile, audioBuffer);

        return newVideoFile;
    }
}
