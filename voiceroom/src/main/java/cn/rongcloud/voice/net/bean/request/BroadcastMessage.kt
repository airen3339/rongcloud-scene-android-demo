/*
 * Copyright © 2021 RongCloud. All rights reserved.
 */

package cn.rongcloud.voice.net.bean.request
import com.google.gson.annotations.SerializedName


/**
 * @author gusd
 * @Date 2021/06/17
 */
data class BroadcastMessage(
    @SerializedName("content")
    val content: String? = null,
    @SerializedName("fromUserId")
    val fromUserId: String? = null,
    @SerializedName("objectName")
    val objectName: String? = null
)