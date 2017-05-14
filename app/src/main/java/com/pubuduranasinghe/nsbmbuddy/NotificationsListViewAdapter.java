package com.pubuduranasinghe.nsbmbuddy;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pubudu on 2017-05-14.
 */

public class NotificationsListViewAdapter extends ArrayAdapter<Notifications> {
    private Activity context;
    private List<Notifications> mNotificationsList;

    public NotificationsListViewAdapter(Activity context, List<Notifications> mNotificationsList) {
        super(context, R.layout.fragment_notifications, mNotificationsList);
        this.context = context;
        this.mNotificationsList = mNotificationsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listItemView = inflater.inflate(R.layout.fragment_notifications, null, true);

        TextView date = (TextView) listItemView.findViewById(R.id.notification_date);
        TextView desc = (TextView) listItemView.findViewById(R.id.notification_desc);

        Notifications n = mNotificationsList.get(position);
        date.setText(n.getDate());
        desc.setText(n.getNotification());

        return listItemView;
//        return super.getView(position, convertView, parent);
    }
}
