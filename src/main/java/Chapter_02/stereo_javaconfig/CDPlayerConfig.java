package Chapter_02.stereo_javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 启用组件扫描扫描这个包以及这个包下所有子包
 * Created by Hjc on 2017/5/7.
 */
@Configuration
//@ComponentScan
@ComponentScan(basePackages = "Chapter_02")
public class CDPlayerConfig {
}
