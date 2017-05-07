package Chapter_02.stereo_javaconfig;

import javafx.scene.media.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Hjc on 2017/5/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)//test 3.1
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    public static void main(String[] args) {
        CDPlayerTest cdPlayerTest = new CDPlayerTest();
        cdPlayerTest.cdShouldNotBeNull();
    }

}
