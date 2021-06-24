package com.luismalamoc.demodozerjdk8support.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SourceHelloObject {
    private String message;
    private LocalDateTime sendedAt;
}
