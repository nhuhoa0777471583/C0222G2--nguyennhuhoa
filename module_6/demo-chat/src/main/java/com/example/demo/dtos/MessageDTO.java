package com.example.demo.dtos;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class MessageDTO {
    @NotNull
    private final String username = "";
    @NotNull
    private String message = "";

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.message = var1;
    }
}
