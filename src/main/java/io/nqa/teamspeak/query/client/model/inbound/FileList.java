package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class FileList extends TeamSpeakNotifyModel {
    public Integer cid;
    public String path;
    public String return_code;
    public List<File> files;

    @ToString
    public static class File {
        public String name;
        public Long size;
        public Long datetime;
        public Integer type;
    }
}
