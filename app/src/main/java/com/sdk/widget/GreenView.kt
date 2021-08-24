package com.sdk.widget

import android.view.ViewGroup
import android.widget.TextView
import com.sdk.component.BaseViewHolder

class GreenView(viewGroup: ViewGroup) : BaseViewHolder<User>(R.layout.item_user, viewGroup) {

    override fun bind(item: User) {
        itemView.findViewById<TextView>(R.id.username).text = item.user
        itemView.findViewById<TextView>(R.id.email).text = item.email
    }
}