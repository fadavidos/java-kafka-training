package com.fabian.osorio.kafka.messages;

public record CarMessage(String id, String brand, String model) implements MessagesKafka {
}
