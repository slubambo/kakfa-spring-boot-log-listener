package logs.consumer.exception;

import java.time.LocalDateTime;

public record ApiError(String path, String message, String errorDescription, int statusCode,
		LocalDateTime localDateTime) {
}
