package cn.rong.combusis.ui.room.fragment.roomsetting;

import cn.rong.combusis.R;

/**
 * @author lihao
 * @project RongRTCDemo
 * @date 2021/11/16
 * @time 6:02 下午
 */
public class RoomTagsFun extends IFun.BaseFun {

    public RoomTagsFun(int status) {
        setStatus(status);
    }

    @Override
    public int getIcon() {
        return R.drawable.ic_room_setting_tags;
    }

    @Override
    public String getText() {
        return "贴纸";
    }
}
