package cn.rong.combusis.ui.friend;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.basis.adapter.recycle.RcyHolder;
import com.basis.adapter.recycle.RcySAdapter;
import com.rongcloud.common.utils.ImageLoaderUtil;

import cn.rong.combusis.R;
import cn.rong.combusis.ui.friend.model.Friend;

public class FriendAdapter extends RcySAdapter<Friend, RcyHolder> {
    private int type;
    private OnFollowClickListener onFollowClickListener;

    public FriendAdapter(Context context, int itemLayoutId) {
        super(context, itemLayoutId);
    }

    @Override
    public void convert(RcyHolder holder, Friend friend, int position) {
        ImageView avatar = holder.getView(R.id.civ_avatar);
        ImageLoaderUtil.INSTANCE.loadImage(context, avatar, friend.getPortrait(), R.drawable.default_portrait);
        holder.setText(R.id.tv_name, friend.getName());
        holder.setChecked(R.id.btn_follow, friend.isChecked(type));
        CheckBox follow = holder.getView(R.id.btn_follow);
        follow.setText(friend.getFollowDesc(type));
        if (onFollowClickListener != null) {
            holder.setOnClickListener(R.id.btn_follow, v -> onFollowClickListener.clickFollow(friend));
            holder.itemView.setOnClickListener(v -> onFollowClickListener.clickItem(friend));
        }
    }

    public void setOnFollowClickListener(OnFollowClickListener onFollowClickListener) {
        this.onFollowClickListener = onFollowClickListener;
    }

    public void setType(int mType) {
        this.type = mType;
    }

    interface OnFollowClickListener {
        void clickFollow(Friend friend);

        void clickItem(Friend friend);
    }
}
