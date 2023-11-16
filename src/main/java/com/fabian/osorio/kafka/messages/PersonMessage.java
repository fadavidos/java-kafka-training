package com.fabian.osorio.kafka.messages;

public record PersonMessage(String id, String name, String age) implements MessagesKafka {}
