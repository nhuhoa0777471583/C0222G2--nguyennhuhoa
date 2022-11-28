package com.example.demo.controller;

import com.example.demo.dtos.MessageDTO;
import com.pusher.rest.Pusher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping({"api"})
public class ChatController {
    @PostMapping({"/messages"})
    @NotNull
    public ResponseEntity message(@RequestBody @NotNull MessageDTO body) {
        Intrinsics.checkParameterIsNotNull(body, "body");
        Pusher pusher = new Pusher("1209954", "f5a26ae2a539732ad139", "61e14c9ab300df6bd442");
        pusher.setCluster("");
        pusher.setEncrypted(true);
        pusher.trigger("chat", "message", body);
        ResponseEntity var10000 = ResponseEntity.ok(new String[0]);
        Intrinsics.checkExpressionValueIsNotNull(var10000, "ResponseEntity.ok(emptyArray<String>())");
        return var10000;
    }

}
