package com.sdk.component

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<U>(@LayoutRes layout: Int, viewGroup: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(viewGroup.context).inflate(layout, viewGroup, false)
) {

    abstract fun bind(item: U)

}