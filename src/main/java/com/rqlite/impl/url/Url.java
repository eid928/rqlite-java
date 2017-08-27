package com.rqlite.impl.url;

import com.google.api.client.http.GenericUrl;

public class Url extends GenericUrl {
    public Url(String encodedUrl) {
        super(encodedUrl);
    }

    public Url enableTransaction(Boolean tx) {
        if (tx) {
            this.put("transaction", tx.toString());
        } else {
            this.remove("transaction");
        }
        return this;
    }

    public Url enableTimings(Boolean tm) {
        if (tm) {
            this.put("timings", tm.toString());
        } else {
            this.remove("timings");
        }
        return this;
    }
}
