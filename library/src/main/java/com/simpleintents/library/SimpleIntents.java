package com.simpleintents.library;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class SimpleIntents {

    private final Context context;
    private Intent intent;

    private SimpleIntents(Context context) {
        this.context = context;
    }

    public static SimpleIntents from (Context context) {
        return new SimpleIntents(context);
    }

    //Browser Intent
    public void openLink(String url) {
        intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        context.startActivity(intent);
    }

    //Email Intent
    public void sendEmail(String[] to, String subject, String message) {
        intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, to);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        context.startActivity(intent);
    }

    //Market Intent (Google Play)
    public void showInMarket(String packageName) {
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName));
        context.startActivity(intent);
    }

    //Dial Number Intent
    public void showDialNumber(String phoneNumber) {
        intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber.replace(" ", "")));
        context.startActivity(intent);
    }

    //Share Intent
    public void shareText(String subject, String message) {
        intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setType("text/plain");
        context.startActivity(intent);
    }

}
