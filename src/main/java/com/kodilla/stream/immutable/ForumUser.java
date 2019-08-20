package com.kodilla.stream.immutable;

import org.w3c.dom.ls.LSOutput;

public final class ForumUser {
    private final String username;
    private final String realName;

    public ForumUser(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
