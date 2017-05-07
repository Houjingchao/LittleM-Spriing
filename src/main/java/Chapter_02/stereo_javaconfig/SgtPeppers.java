package Chapter_02.stereo_javaconfig;

import org.springframework.stereotype.Component;

/**
 * Created by Hjc on 2017/5/7.
 */
@Component("lonelyHeartsClub")//可以在括号了 备注ID，不备注 默认是sgtPeppers
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
