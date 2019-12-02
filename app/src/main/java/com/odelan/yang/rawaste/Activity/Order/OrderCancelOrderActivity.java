package com.odelan.yang.rawaste.Activity.Order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.odelan.yang.rawaste.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrderCancelOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_cancel_order);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_back) void onClickBack() {
        finish();
    }

    @OnClick(R.id.btn_cancel) void onClickCancel() {
        finish();
    }
}
