package hku.cs.smp.guardian.tag;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import hku.cs.smp.guardian.common.protocol.TagRequest;

@Entity(tableName = "tag_command")
public class TagCommand {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "phone")
    public String phone;

    @ColumnInfo(name = "tag")
    public String tag;

    @ColumnInfo(name = "uploaded")
    public Boolean uploaded;

    public TagCommand(String phone, String tag) {
        this.phone = phone;
        this.tag = tag;
        this.uploaded = false;
    }

    TagRequest toTagRequest() {
        return new TagRequest(phone, tag);
    }
}
