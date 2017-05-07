package com.springinaction.knights;

import sia.knights.Knight;
import sia.knights.RescueDamselQuest;

/**
 * 紧密耦合的代码难测试和复用
 * 但耦合是必须的，应该小心的管理
 * Created by Hjc on 2017/5/1.
 */
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest rdq;

    public DamselRescuingKnight() {
        this.rdq = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        rdq.embark();
    }
}
