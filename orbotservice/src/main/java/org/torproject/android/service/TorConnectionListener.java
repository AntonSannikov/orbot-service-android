package org.torproject.android.service;

public interface TorConnectionListener {
    void onEvent(String message);
}
