package shit.zen.event.impl;

import lombok.*;
import shit.zen.event.EventMarker;

@Data
@AllArgsConstructor
public class HeadTurnEvent
implements EventMarker {
    @Getter @Setter
    private float yaw;
    @Getter @Setter
    private float lastYaw;
}