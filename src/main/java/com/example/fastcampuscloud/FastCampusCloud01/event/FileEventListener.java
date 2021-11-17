package com.example.fastcampuscloud.FastCampusCloud01.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FileEventListener {

    @EventListener // 이벤트 관련 어노테이션, 스프링 이벤트를 받아줌
    public void onFileEventHandler(FileEvent fileEvent) {
        log.info("fileEvent recive type : {} data : {}", fileEvent.getType(), fileEvent.getData());
    }
}
