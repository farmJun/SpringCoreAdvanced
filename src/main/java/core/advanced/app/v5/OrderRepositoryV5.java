package core.advanced.app.v5;

import core.advanced.trace.AbstractTemplate;
import core.advanced.trace.callback.TraceTemplate;
import core.advanced.trace.logTrace.LogTrace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV5 {
    private final TraceTemplate template;

    public void save(String itemId) {
        template.execute("OrderRepository.save()", () -> {
            //저장 로직
            if (itemId.equals("ex")) {
                throw new IllegalStateException("예외 발생!");
            }
            sleep(1000);
            return null;
        });
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
