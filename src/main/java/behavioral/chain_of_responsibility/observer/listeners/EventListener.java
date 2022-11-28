package behavioral.chain_of_responsibility.observer.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
