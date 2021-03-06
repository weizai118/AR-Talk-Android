package org.anyrtc.anyrtcspeak.adapter;

import android.graphics.Color;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import org.anyrtc.anyrtcspeak.R;
import org.anyrtc.anyrtcspeak.bean.MessageBean;

/**
 * Created by liuxiaozhong on 2018/10/25.
 */
public class MessageAdapter extends BaseQuickAdapter<MessageBean,BaseViewHolder> {
    public MessageAdapter() {
        super(R.layout.iten_message);
    }

    @Override
    protected void convert(BaseViewHolder helper, MessageBean item) {
        TextView tvContent=helper.getView(R.id.tv_message);
        if (item.isSelf){
            tvContent.setTextColor(Color.parseColor("#ffffff"));
            tvContent.setBackgroundResource(R.drawable.shape_message_self);
        }else {
            tvContent.setTextColor(Color.parseColor("#666666"));
            tvContent.setBackgroundResource(R.drawable.shape_message_other);
        }
        tvContent.setText("ID"+item.userId+"："+item.content);
    }
}
