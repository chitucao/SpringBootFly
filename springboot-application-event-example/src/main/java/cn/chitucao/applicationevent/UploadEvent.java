package cn.chitucao.applicationevent;

import org.springframework.context.ApplicationEvent;

/**
 * @author DennyFly
 * @since 2020/3/20 15:17
 */
public class UploadEvent extends ApplicationEvent {
    public UploadEvent(Object source) {
        super(source);
    }
}
