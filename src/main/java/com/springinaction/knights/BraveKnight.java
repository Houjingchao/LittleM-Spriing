package com.springinaction.knights;

import sia.knights.Knight;
import sia.knights.Quest;

/**
 * Created by Hjc on 2017/5/1.
 */
public class BraveKnight implements Knight {
    private Quest quest;//是接口

    /**
     * 构造器注入
     * 依赖注入的方式之一
     * 带来的收益  松耦合
     *
     * @param quest
     */
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
