package rxsqlite.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Daniel Serdyukov
 * @deprecated and will be removed in next release
 */
@Deprecated
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface SQLiteStringList {

    String value() default "";

}
