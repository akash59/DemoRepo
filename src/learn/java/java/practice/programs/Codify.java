package learn.java.java.practice.programs;

import sun.java2d.pipe.SolidTextRenderer;

public class Codify {

    public String solution(String S) {
        // write your code in Java SE 8

        StringBuilder result = new StringBuilder("");
        int totalMusicFilesSize = 0;
        int totalImageFileSize = 0;
        int totalMovieFileSize = 0;
        int totalOthersFileSize = 0;
        String file_extension;

        if(S.length() > 0) {

            String[] lines = S.split("\n");
            for(int i = 0; i< lines.length; i++) {

                String[] words = lines[i].split(" ");
                file_extension = words[0].substring(words[0].lastIndexOf(".") + 1);

                if(file_extension.equalsIgnoreCase("mp3") ||
                        file_extension.equalsIgnoreCase("flac") ||
                        file_extension.equalsIgnoreCase("aac")) {

                    totalMusicFilesSize = totalMusicFilesSize + Integer.parseInt(words[1].replace("b", ""));
                }

                else if (file_extension.equalsIgnoreCase("jpg") ||
                        file_extension.equalsIgnoreCase("bmp") ||
                        file_extension.equalsIgnoreCase("gif")) {

                    totalImageFileSize = totalImageFileSize + Integer.parseInt(words[1].replace("b", ""));
                }

                else if(file_extension.equalsIgnoreCase("mp4") ||
                        file_extension.equalsIgnoreCase("avi") ||
                        file_extension.equalsIgnoreCase("mkv")) {

                    totalMovieFileSize = totalMovieFileSize + Integer.parseInt(words[1].replace("b", ""));
                }

                else {

                    totalOthersFileSize = totalOthersFileSize + Integer.parseInt(words[1].replace("b", ""));
                }
            }
        }

        result.append("music "+totalMusicFilesSize+"b\n");
        result.append("images "+totalImageFileSize+"b\n");
        result.append("movies "+totalMovieFileSize+"b\n");
        result.append("other "+totalOthersFileSize+"b\n");

        return result.toString();
    }


    public static void main(String[] args) {

        String s = "my.song.mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b\n";
        Codify cod = new Codify();
        System.out.println(cod.solution(s));

    }

}
