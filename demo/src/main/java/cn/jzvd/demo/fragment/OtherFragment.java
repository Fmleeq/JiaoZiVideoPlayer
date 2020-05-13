package cn.jzvd.demo.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import cn.jzvd.demo.DirectPlayActivity;
import cn.jzvd.demo.LocalVideoActivity;
import cn.jzvd.demo.R;
import cn.jzvd.demo.WebViewActivity;

/**
 * Created by pengan.li on 2020/5/8.
 */
public class OtherFragment extends BaseFragment implements View.OnClickListener {

    private Button mDirectPlay, mWebView, mLocalVideo;

    @Override
    protected View initView() {
        View view = View.inflate(mContext, R.layout.fragment_other, null);
        mDirectPlay = view.findViewById(R.id.direct_play);
        mWebView = view.findViewById(R.id.web_view);
        mLocalVideo = view.findViewById(R.id.local_video);
        mDirectPlay.setOnClickListener(this);
        mWebView.setOnClickListener(this);
        mLocalVideo.setOnClickListener(this);
        return view;
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.direct_play:
                startActivity(new Intent(mContext, DirectPlayActivity.class));
                break;
            case R.id.web_view:
                startActivity(new Intent(mContext, WebViewActivity.class));
                break;
            case R.id.local_video:
                startActivity(new Intent(mContext, LocalVideoActivity.class));
                break;
        }

    }
}
