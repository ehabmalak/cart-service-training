package com.example.cartservice.adapter.messages.inbound;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


    public interface CartInputChannel {

        String INPUT = "cart-queue";

        @Input(INPUT)
        SubscribableChannel input();

    }

