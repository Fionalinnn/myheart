package com.netease.nim.demo.session.fragment.tab;

import android.os.Bundle;

import com.netease.nim.demo.R;
import com.netease.nim.demo.session.model.AckMsgTab;

/**
 * Created by winnie on 2018/3/15.
 */

public class UnreadAckMsgTabFragment extends AckMsgTabFragment  {


    public UnreadAckMsgTabFragment() {
        this.setContainerId(AckMsgTab.UNREAD.fragmentId);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        onCurrent();
    }

    @Override
    protected void onInit() {
        findViews();
    }

    @Override
    public void onCurrent() {
        super.onCurrent();
    }

    private void findViews() {

    }
}
