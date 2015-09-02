package org.aggregateframework.ormlite.entity;

import org.aggregateframework.entity.AbstractDomainObject;
import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by changming.xie on 2014/7/27.
 */
public class AbstractGenericOrmLiteDomainObject<ID extends Serializable> extends AbstractDomainObject<ID> {

    @DatabaseField(columnName = "ID", generatedId = true )
    private Integer id;

    @DatabaseField(columnName = "CREATE_TIME")
    private Date createTime;

    @DatabaseField(columnName = "LAST_UPDATE_TIME")
    private Date lastUpdateTime;

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Override
    public ID getId() {
        return null;
    }
}
