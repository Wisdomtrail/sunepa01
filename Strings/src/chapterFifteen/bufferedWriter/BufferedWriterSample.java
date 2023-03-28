package chapterFifteen.bufferedWriter;

import chapterFifteen.utils.AppUtils;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterSample {
    public static void main(String[] args) {
        String[] words = {"QWERTY", "ASDFG", "ZXCVB", "POIUY", "LKJHG", "MNBVC"};
        try{
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(AppUtils.APP_ASSET_LOCATION+"\\sun.txt"));
            BufferedWriter bufferedwriter = new BufferedWriter(writer);
            bufferedwriter.write(words[0]+" "+words[3]);
            bufferedwriter.flush();
            bufferedwriter.write(words[1]);
            bufferedwriter.close();
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
