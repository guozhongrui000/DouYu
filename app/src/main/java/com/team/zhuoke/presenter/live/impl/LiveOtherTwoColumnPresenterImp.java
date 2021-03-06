package com.team.zhuoke.presenter.live.impl;


import com.team.zhuoke.model.logic.live.bean.LIveOtherTwoColumn;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.presenter.live.interfaces.LiveOtherTwoColumnContract;

import java.util.List;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/11/14 下午3:22
 **/
public class LiveOtherTwoColumnPresenterImp extends LiveOtherTwoColumnContract.Presenter {

    @Override
    public void getPresenterLiveOtherTwoColumn(String mCloumnName) {
        addSubscribe(mModel.getModelLiveOtherTwoColumn(mContext,mCloumnName).subscribe(new RxSubscriber<List<LIveOtherTwoColumn>>() {
            @Override
            public void onSuccess(List<LIveOtherTwoColumn> mLiveOtherTwoColumns) {
                mView.getViewLiveOtherTwoColumn(mLiveOtherTwoColumns);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
