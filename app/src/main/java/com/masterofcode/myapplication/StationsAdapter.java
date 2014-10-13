package com.masterofcode.myapplication;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pDevice;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StationsAdapter extends BaseAdapter {

    private List<WifiP2pDevice> p2pDevices;

    private Context context;

    public StationsAdapter(Context context, List<WifiP2pDevice> p2pDevices) {
        this.p2pDevices = p2pDevices;
        this.context = context;
    }

    @Override
    public int getCount() {
        return p2pDevices.size();
    }

    @Override
    public WifiP2pDevice getItem(int position) {
        return p2pDevices.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.item_stations, null);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText(getItem(position).deviceName);
        return null;
    }
}
