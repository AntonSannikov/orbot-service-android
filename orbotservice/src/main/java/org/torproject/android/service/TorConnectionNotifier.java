package org.torproject.android.service;

import androidx.annotation.Nullable;

public class TorConnectionNotifier {

    @Nullable
    private static TorConnectionListener torListener;

    public static void notify(String message) {
        if (torListener != null) {
            torListener.onEvent(message);
        }

    }

    public static void setTorListener(@Nullable TorConnectionListener listener) {
        torListener = listener;
    }
}
