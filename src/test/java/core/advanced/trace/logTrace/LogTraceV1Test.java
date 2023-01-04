package core.advanced.trace.logTrace;

import core.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

class LogTraceV1Test {

    @Test
    void begin_end() {
        LogTraceV1 trace = new LogTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.end(status);
    }

    @Test
    void begin_exception() {
        LogTraceV1 trace = new LogTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.exception(status, new IllegalStateException());
    }
}