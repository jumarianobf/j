package adopet.api.exception;

import org.springframework.http.HttpStatus;

import java.time.LocalTime;

public record ResponseError(String message, HttpStatus httpStatus, LocalTime time) {
}
