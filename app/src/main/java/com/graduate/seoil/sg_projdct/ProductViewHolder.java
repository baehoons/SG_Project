package com.graduate.seoil.sg_projdct;

import android.view.View;
import android.widget.TextView;

import com.graduate.seoil.sg_projdct.Model.Product;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ProductViewHolder extends ChildViewHolder {
    // 승연
    private TextView mTextView;

    public ProductViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.textView);
    }
    public  void  bind (Product product) {
        mTextView.setText(product.getName());
    }
}
