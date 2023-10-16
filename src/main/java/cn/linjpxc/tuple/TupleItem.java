package cn.linjpxc.tuple;

import java.io.Serializable;

/**
 * @author linjpxc
 */
public interface TupleItem extends Serializable {

    int index();

    Object value();
}
