package nova.committee.mcmodwiki.init.callbacks;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/6/3 7:00
 * Version: 1.0
 */
public class KeyBoardEvents {
    public KeyBoardEvents() {
    }

    public static final Event<KeyPressed> KEY_PRESSED_EVENT = EventFactory.createArrayBacked(KeyBoardEvents.KeyPressed.class, callbacks -> (l, i, j, k, m) -> {
        for (KeyBoardEvents.KeyPressed callback : callbacks) {
            callback.onPressed(l, i, j, k, m);
        }
    });


    @FunctionalInterface
    public interface KeyPressed {
        void onPressed(long l, int i, int j, int k, int m);
    }
}
