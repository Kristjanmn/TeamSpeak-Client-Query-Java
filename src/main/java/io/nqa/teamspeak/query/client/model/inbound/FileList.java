package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnFileList;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnFileList} event.
 */
@ToString
public class FileList extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    /** File browser path */
    public String path;
    /** Return code */
    public String return_code;
    /** List of files */
    public List<File> files;

    /**
     * Create empty FileList object.
     */
    public FileList() {}

    /**
     * Object containing File information.
     */
    @ToString
    public static class File {
        /** File name */
        public String name;
        /** File size in bytes */
        public Long size;
        /** File upload timestamp */
        public Long datetime;
        /** File type */
        public Integer type;

        /**
         * Create empty File object.
         */
        public File() {}
    }
}
